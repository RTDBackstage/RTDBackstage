package com.rtdback.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.rtdback.pojo.Account;

@Repository("accountMapper")
public interface AccountMapper {

	@Select("select * from account where username = #{username} and password=#{password}")
	Account login(@Param("username")String username,@Param("password")String password);
	
}
