package com.rtdback.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rtdback.pojo.Menu;
import com.rtdback.service.MenuService;

public class MenuTest {

	private MenuService menuService;
	
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
