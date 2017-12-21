package com.rtdback.dao;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.mysql.fabric.xmlrpc.base.Data;
import com.rtdback.pojo.Account;

@Repository("accountMapper")
public interface AccountMapper {

	//根据id查询所有 在修改
	@Select("select * from account where id = #{id}")
	Account findById(@Param("id")Integer id);
	
	//根据用户名，密码查询 登陆
	@Select("select * from account where username = #{username} and password=#{password}")
	Account login(@Param("username")String username,@Param("password")String password);
	
	//查询所有  
	@Select("select * from account ")
	List<Account> find();
	
	//添加用户 
	@Insert("insert into account(username, password, phone, email, name, card, sex, age, photo, remaining, time, paynum, askcode, asksum, question1, answer1, question2, answer2, question3, answer3) "
			+ "values(#{username},#{password},#{phone},"
			+ "#{email},#{name},#{card},#{sex},#{age},#{photo},#{remaining}"
			+ ",now(),#{paynum},#{askcode},#{asksum},#{question1},#{answer1},"
			+ "#{question2},#{answer2},#{question3},#{answer3})")
	int add(Account account);
	
	//更新用户
	@Update("update account set username=#{username},password=#{password},phone=#{phone},"
			+ "email=#{email},name=#{name},card=#{card},sex=#{sex},age=#{age},"
			+ "photo=#{photo},remaining=#{remaining},time=#{time},paynum=#{paynum},"
			+ "askcode=#{askcode},asksum=#{asksum},question1=#{question1},answer1=#{answer1},"
			+ "question2=#{question2},answer2=#{answer2},question3=#{question3},answer3=#{answer3}"
			+ "where id=#{id}")
	int modify(Account account);
	
	//多条件查询用户
	@Select("select * from account where username=#{username} and "
			+ "phone=#{phone} and askcode=#{askcode} and "
			+ "time>=#{timemin} and time<=#{timemax}")
	List<Account> findByParam(@Param("username")String username,@Param("phone")String phone,
			@Param("askcode")String askcode,@Param("timemin")Date timemin,@Param("timemax")Date timemax);
}
