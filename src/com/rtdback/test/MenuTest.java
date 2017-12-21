package com.rtdback.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rtdback.pojo.Menu;
import com.rtdback.pojo.MenuNode;
import com.rtdback.service.MenuService;

public class MenuTest {

	private MenuService menuService;
	
	@Test
	public void childMenuByFatherName(){
		List<Menu> menus = menuService.childMenuByFatherName("产品管理");
		for(Menu menu :menus){
			System.out.println(menu.getName());
		}
	}
	
	@Test
	public void findElevl(){
		List<String> menus = menuService.findElevl();
		for (int i = 0; i < menus.size(); i++) {
			System.out.println(i);
		}
	}
	
	//根据id查询父菜单
	@Test
	public void loadIdMenu(){
		List<Integer> list = menuService.loadAccountMenu(2);
		
		List<Menu> menus =  menuService.loadTopMenu();
		
		List<MenuNode> nodelist= new ArrayList<MenuNode>();
		for(Menu menu :menus){
			if (list.contains(menu.getId())) {
				MenuNode node = new MenuNode();
				node.setName(menu.getName());
				node.setParentid(menu.getId());
				node.setSeq(menu.getSeq());
				node.setSeq(menu.getSeq());
				node.setUrl(menu.getUrl());
				nodelist.add(node);
			}
		}
		
		for(MenuNode menuNode:nodelist){
			System.out.println(menuNode.getName());
		}
		
		
	}
	
	
	
	@Test
	public void loadAccountMenu(){
		List<Integer> list = menuService.loadAccountMenu(2);
			System.out.println(list.toString());
	}
	
	@Test
	public void menuName(){
		List<String> menunames = menuService.menuName(2);
		System.out.println(menunames.toString());
	}
	
	@Test
	public void loaddTopeMenu(){
		List<Menu> menus = menuService.loadTopMenu();
		for(Menu menu :menus){
			System.out.println(menu.getName());
		}
	}
	
	@Test
	public void loadChildMenu(){
		List<Menu> menus = menuService.loadChildMenu(3);
		for(Menu menu :menus){
			System.out.println(menu.getName());
		}
	}
	
	
	
	
	
	
	
	@Before
	public void init(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		menuService = ctx.getBean("menuService",MenuService.class);
	}
}
