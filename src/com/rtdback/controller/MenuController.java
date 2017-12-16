package com.rtdback.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rtdback.pojo.Menu;
import com.rtdback.service.MenuService;

@RestController // 直接把对象转换为 json 格式
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	/**
	 * 
	 * test:127.0.0.1:8080/RTDBackstage/menu/topMenu/2
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/menu/topMenu/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> topMenu(@PathVariable("id") Integer id){
		
		List<String> menuNames = menuService.menuName(id);
		return new ResponseEntity<List<String>>(menuNames,HttpStatus.OK);
	}
	
	
}
