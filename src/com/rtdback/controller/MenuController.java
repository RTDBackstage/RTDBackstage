package com.rtdback.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rtdback.node.MenuNode;
import com.rtdback.pojo.Menu;
import com.rtdback.service.MenuService;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;

@Controller
public class MenuController {

	@Resource(name="menuService")
	private MenuService menuService;
	
	@RequestMapping("topMenu")
	public String topMenu(HttpServletRequest request ,HttpServletResponse response){
		List<Menu> menus = menuService.loadTopMenu();
		
		List<MenuNode> nodelist = new ArrayList<MenuNode>();
		for(Menu menu :menus){ 
			
		}
		
		JSON topMenuJson = JSONSerializer.toJSON(menus);
		try {
			response.getWriter().println(topMenuJson);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "topMenu";
	}
	
	
}
