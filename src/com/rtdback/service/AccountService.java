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
	
	public String  login(String name,String password){
		Account account = accountMapper.login(name, password);
		if (account == null) {
			return "loginerror";
		}
		return "loginsuccess";
	}
	
}
