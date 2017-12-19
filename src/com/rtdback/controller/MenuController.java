package com.rtdback.controller;

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
	@RequestMapping(value = "/menu/index/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> index(@PathVariable("id") Integer id,HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
	    Account account = (Account) request.getSession().getAttribute("account");
		
		List<Integer> list = menuService.loadAccountMenu(account.getId());
		List<Menu> menus= null;
		if(id!=0 ){
			menus = menuService.loadIdTopMenu(id);
		}else {
			 menus = menuService.loadTopMenu();
		}

		List<MenuNode> nodelist = new ArrayList<MenuNode>();
		for (Menu menu : menus) {
			if (list.contains(menu.getId())) {
				MenuNode node = new MenuNode();
				node.setName(menu.getName());
				node.setParentid(menu.getId());
				node.setSeq(menu.getSeq());
				node.setUrl(menu.getUrl());
				node.setStatus(menu.getStatus());
				nodelist.add(node);
			}
		}

		return new ResponseEntity<List<MenuNode>>(nodelist,HttpStatus.OK);
	}

}
