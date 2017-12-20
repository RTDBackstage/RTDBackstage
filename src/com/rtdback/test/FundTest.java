package com.rtdback.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rtdback.pojo.Fund;
import com.rtdback.service.FundService;
import com.rtdback.util.Pager;

public class FundTest {
	private FundService fundService;
	
	@Test
	public void findByParam(){
		Pager<Fund> pager = fundService.findByParam("2017-12-01", "2017-12-11", "标","融资", 2, 5, "time", "desc");
		for (Fund fund : pager.getRows()) {
			System.out.println(fund.getId());
		}
		
	}
	
	@Before
	public void init(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		fundService = ctx.getBean("fundService",FundService.class);
	}
}
