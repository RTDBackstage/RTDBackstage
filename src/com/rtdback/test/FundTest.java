package com.rtdback.test;

import java.awt.image.AreaAveragingScaleFilter;

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
	
	@Test
	public void aa(){
		/*Integer m1 = 200;
		Integer m2 = 200;
		Integer n1 = 100;
		Integer n2 = 100;
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
		System.out.println(n1==n2);
		System.out.println(n1.equals(n2));*/
		/*int c = 3;
		Integer a = new Integer(3);
		Integer b = 3;
		System.out.println(a==b);//true
		System.out.println(a.equals(b));
		System.out.println(b==c);//flase
		System.out.println(a.equals(c));//flase
		System.out.println(b.equals(c));
		System.out.println(a==c);//true*/	
		
		Integer a = 200;
		Integer b = 200;
		int e = 200;
		Integer c = Integer.valueOf(200);
		Integer d = new Integer(200);
		System.out.println(a+" "+b);
		System.out.println(a==b);
		System.out.println(b==e);
		System.out.println(a==c);
		System.out.println(c==d);
		System.out.println(b==d);
		System.out.println(a==d);
		
	}
	
	@Before
	public void init(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		fundService = ctx.getBean("fundService",FundService.class);
	}
}
