package com.rtdback.dao;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.rtdback.pojo.Account;

@Repository("accountMapper")
public interface AccountMapper {

	//根据用户名，密码查询
	@Select("select * from account where username = #{username} and password=#{password}")
	Account login(@Param("username")String username,@Param("password")String password);
	
	//查询所有
	@Select("select * from account ")
	List<Account> find();
	
	//添加用户
	@Insert("insert into account(username, password, phone, email, name, card, sex, age, photo, remaining, time, paynum, askcode, asksum, question1, answer1, question2, answer2, question3, answer3) "
			+ "values(#{username},#{password},#{phone},"
			+ "#{email},#{name},#{card},#{sex},#{age},#{photo},#{remaining}"
			+ ",#{time},#{paynum},#{askcode},#{asksum},#{question1},#{answer1},"
			+ "#{question2},#{answer2},#{question3},#{answer3})")
	int add(Account account);
}
