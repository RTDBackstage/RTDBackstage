package com.rtdback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository("menuMapper")
public interface MenuMapper {

	@Select("select rm.menuid from role_menu rm,role r,account_role ar WHERE ar.roleid = r.id and r.id = rm.roleid and ar.accountid = #{accountid}")
	List<Integer> loadAccountMenu(@Param("accountid") Integer accountid);
	
	
}
