package com.rtdback.service;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rtdback.dao.AccountMapper;
import com.rtdback.pojo.Account;

@Service("accountService")
@Transactional(readOnly = true,propagation = Propagation.NOT_SUPPORTED)
public class AccountService {

	@Resource(name ="accountMapper")
	private AccountMapper accountMapper;
	
	//根据用户名，密码查询
	public Account login(String name,String password){
		return accountMapper.login(name, password);
	}
	
	//查询所有
	public List<Account> find(){
		return accountMapper.find();
	}
	
	//添加用户
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int add(Account account){
		return accountMapper.add(account);
	}
	
}
