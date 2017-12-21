package com.rtdback.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rtdback.dao.AccountMapper;
import com.rtdback.pojo.Account;
import com.rtdback.pojo.Menu;
import com.rtdback.pojo.MenuNode;
import com.rtdback.service.AccountService;
import com.rtdback.service.MenuService;

@RestController // 直接把对象转换为 json 格式
public class MenuController {

	@Autowired
	private MenuService menuService;

	@RequestMapping(value = "/menu/childMenuByFatherName/{name}",method=RequestMethod.GET)
	public ResponseEntity<?> childMenuByFatherName(@PathVariable("name")String name){
		List<Menu> menus = menuService.childMenuByFatherName(name);
		return new ResponseEntity<List<Menu>>(menus,HttpStatus.OK);
	}
	
	
	/**
	 * 
	 * test:http://localhost:8080/RTDBackstage/menu/topMenu/2
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/menu/topMenu/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<String>> topMenu(@PathVariable("id") Integer id) {
		List<String> menuNames = menuService.menuName(id);
		return new ResponseEntity<List<String>>(menuNames, HttpStatus.OK);
	}

	/**
	 * test:http://localhost:8080/RTDBackstage/menu/topMenu
	 * 
	 * @return
	 */
	@RequestMapping(value = "/menu/topMenu", method = RequestMethod.GET)
	public ResponseEntity<?> topMenu() {
		List<Menu> menus = menuService.loadTopMenu();

		return new ResponseEntity<List<Menu>>(menus, HttpStatus.OK);
	}

	/**
	 * test:http://localhost:8080/RTDBackstage/menu/index/2
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/menu/index", method = RequestMethod.GET)
	public ResponseEntity<?> index(HttpServletRequest request) {
		
		Account account = (Account) request.getSession().getAttribute("account");
		
		List<Integer> list = null;
		if(account != null){
			//根据用户id查询该用户下的父菜单的编号
			list = menuService.loadAccountMenu(account.getId());
			System.out.println(list.toString());
		}
		
		//加载所有的节点信息
		List<Menu> menus= menuService.loadTopMenu();
		
		List<List<Menu>> childMenu =new ArrayList<List<Menu>>();
		if (list != null) {
			for (Integer i :list) {
				List<Menu> menu2 =menuService.loadChildMenu(i);
				childMenu.add(menu2);
			}
		}else {
			for(Menu menu :menus){
				List<Menu> menu2 = menuService.loadChildMenu(menu.getId());
				childMenu.add(menu2);
			}
		}

		//提取指定数据，放入MenuNode
		List<MenuNode> nodelist = new ArrayList<MenuNode>();
		MenuNode node =null;
		for (Menu menu : menus) {
			node = new MenuNode();
			if(list != null){
				if (list.contains(menu.getId())) {
					node.setId(menu.getId());
					node.setName(menu.getName());
					node.setSeq(menu.getSeq());
					nodelist.add(node);
				}
			}else {
				node.setName(menu.getName());
				node.setId(menu.getId());
				node.setSeq(menu.getSeq());
				nodelist.add(node);
			}
		}
		
		for(List<Menu> menus2 :childMenu){
			for(Menu menu :menus2){
				node = new MenuNode();
				node.setId(menu.getId());
				node.setParentid(menu.getParentid());
				node.setChildName(menu.getName());
				node.setSeq(menu.getSeq());
				node.setUrl(menu.getUrl());
				nodelist.add(node);
			}
		}
		

		return new ResponseEntity<List<MenuNode>>(nodelist,HttpStatus.OK);
	}

}
