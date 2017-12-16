package com.rtdback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.rtdback.pojo.Menu;

@Repository("menuMapper")
public interface MenuMapper {

	//获取登陆用户的子节点编号
	@Select("select rm.menuid from role_menu rm,role r,account_role ar WHERE ar.roleid = r.id and r.id = rm.roleid and ar.accountid = #{accountid}")
	List<Integer> loadAccountMenu(@Param("accountid") Integer accountid);
	
	//加载父节点名
	@Select("select * from menu where parentid is NULL order by seq")
	List<Menu> loadTopMenu();
	
	//根据父节点查询子节点
	@Select("select * from menu where parentid = #{parentid} order by seq")
	List<Menu> loadChildMenu(@Param("parentid") Integer parentid);
	
}
