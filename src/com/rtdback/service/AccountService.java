package com.rtdback.service;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mysql.fabric.xmlrpc.base.Data;
import com.rtdback.dao.AccountMapper;
import com.rtdback.pojo.Account;

@Service("accountService")
@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
public class AccountService {

	@Resource(name = "accountMapper")
	private AccountMapper accountMapper;
	
	
	//修改用户
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int modify(Account account){
		return accountMapper.modify(account);
	}
	
	//根据id查询所有
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Account findById(Integer id){
		return accountMapper.findById(id);
	}

	// 添加用户
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int add(Account account) {
		return accountMapper.add(account);
	}

	// 根据用户名，密码查询
	public Account login(String name, String password) {
		return accountMapper.login(name, password);
	}

	// 查询所有
	public List<Account> find() {
		return accountMapper.find();
	}
	
	//多条件查询
	public List<Account> findByParam(String username,String phone,String askcode,Date timemin,Date timemax){
		return accountMapper.findByParam(username,phone,askcode,timemin, timemax);
	}

}
