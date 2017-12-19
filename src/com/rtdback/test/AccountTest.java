package com.rtdback.test;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Date;

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
	
	@Test
	public void add(){
		Account account = new Account();
		account.setUsername("wen");
		account.setPassword("wen");
		account.setPhone("12345");
		account.setEmail("213534@163.com");
		account.setName("wenhuadong");
		account.setSex("男");
		account.setCard("1234567890");
		account.setAge(23);
		account.setPhoto("zhaopian");
		account.setRemaining(245346d);
		account.setAskcode("12");
		account.setPaynum("123456");
		account.setAsksum(11);
		account.setQuestion1("你的最好的朋友");
		account.setAnswer1("wen");
		account.setQuestion2("最喜欢的动物");
		account.setAnswer2("狗");
		account.setQuestion3("最热爱的运动");
		account.setAnswer3("游泳");
		
		account.setTime(new Date());
		int count = accountService.add(account);
		System.out.println(count);
	}
	
	@Before
	public void init(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		accountService = ctx.getBean("accountService",AccountService.class);
	}
}
