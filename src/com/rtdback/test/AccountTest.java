package com.rtdback.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rtdback.pojo.Account;
import com.rtdback.service.AccountService;

public class AccountTest {

	private AccountService accountService;
	
	@Test
	public void login(){
		 
		System.out.println(accountService.login("华东", "12345"));
	}
	
	@Before
	public void init(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		accountService = ctx.getBean("accountService",AccountService.class);
	}
}
