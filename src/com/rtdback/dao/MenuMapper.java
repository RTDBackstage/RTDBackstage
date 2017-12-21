package com.rtdback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.junit.runners.Parameterized.Parameters;
import org.springframework.stereotype.Repository;

import com.rtdback.pojo.Menu;

@Repository("menuMapper")
public interface MenuMapper {
	
	//根据父节点名查询所有 -- 点击父节点加载子节点
	@Select("select * from menu where parentid = (select id from menu where name = #{name})")
	List<Menu> childMenuByFatherName(@Param("name")String name);
	
	//根据rm的角色编号roleid查询菜单名 
	@Select("select rm.roleid, m.name from menu m,role_menu rm WHERE  rm.menuid = m.id")
	List<String> findChildElevl();
	
	//用户权限不同，显示不同的菜单编号及身份 
	@Select("select a.id ,a.username,r.name ,r.introduced from account a, account_role ar,role r WHERE  a.id = ar.accountid and ar.roleid = r.id")
	List<String> findElevl();

	//获取登陆用户的子节点编号
	@Select("select rm.menuid from role_menu rm,role r,account_role ar WHERE ar.roleid = r.id and r.id = rm.roleid and ar.accountid = #{accountid}")
	List<Integer> loadAccountMenu(@Param("accountid") Integer accountid);
	
	//根据父菜单id查询子菜单名
	@Select("select m.name from account a,account_role ar,role_menu rm,menu m where ar.accountid=a.id and ar.roleid=rm.roleid and rm.menuid=m.id and a.id=#{menuname} order by seq;")
	List<String> MenuName(@Param("menuname") Integer menuname); 
	
	//加载父节点名
	@Select("select * from menu where parentid is NULL order by seq")
	List<Menu> loadTopMenu();
	
	//根据id查询父菜单
	@Select("select * from menu where id = #{id}")
	List<Menu> loadIdTopMenu(@Param("id")Integer id);
	
	//根据父节点查询子节点
	@Select("select * from menu where parentid = #{parentid} order by seq")
	List<Menu> loadChildMenu(@Param("parentid") Integer parentid);
	
}
