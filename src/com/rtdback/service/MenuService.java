package com.rtdback.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
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
	
	//根据父节点名查询所有 -- 点击父节点加载子节点
	public List<Menu> childMenuByFatherName(@Param("name")String name){
		return menuMapper.childMenuByFatherName(name);
	}
	
	//根据rm的角色编号roleid查询菜单名 
	public List<String> findChildElevl(){
		return menuMapper.findChildElevl();
	}
	
	//用户权限不同，显示不同的菜单编号及身份 
	public List<String> findElevl(){
		return menuMapper.findElevl();
	}
	
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
