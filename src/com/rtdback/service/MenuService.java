package com.rtdback.service;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.rtdback.dao.MenuMapper;

@Service("menuService")

public class MenuService {

	@Resource(name = "menuMapper")
	private MenuMapper menuMapper;
	
	
}
