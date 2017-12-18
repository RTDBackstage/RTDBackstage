package com.rtdback.service;

import static org.hamcrest.CoreMatchers.nullValue;

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
	
	public Account login(String name,String password){
		return accountMapper.login(name, password);
	}
	
}
