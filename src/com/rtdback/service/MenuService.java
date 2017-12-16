package com.rtdback.service;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtdback.dao.MenuMapper;

@Service("menuService")
@Transactional
public class MenuService {

	@Resource(name = "menuMapper")
	private MenuMapper menuMapper;
	
	
}
