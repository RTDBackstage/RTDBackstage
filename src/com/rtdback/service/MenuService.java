package com.rtdback.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rtdback.dao.MenuMapper;
import com.rtdback.pojo.Menu;

@Service("menuService")
@Transactional(readOnly = true,propagation = Propagation.NOT_SUPPORTED)
public class MenuService {

	@Resource(name = "menuMapper")
	private MenuMapper menuMapper;
	
	public List<Integer> loadAccountMenu(Integer accountid){
		return menuMapper.loadAccountMenu(accountid);
	}
	
	public List<String> menuName(Integer menuname){
		return menuMapper.MenuName(menuname);
	}
	
	public List<Menu> loadTopMenu(){
		return menuMapper.loadTopMenu();
	}
	
	public List<Menu> loadChildMenu(Integer parentid){
		return menuMapper.loadChildMenu(parentid);
	}
	
	//根据id查询父菜单
	public List<Menu> loadIdTopMenu(Integer id){
		return menuMapper.loadIdTopMenu(id);
	}
	
	
}
