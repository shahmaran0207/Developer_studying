package com.itbank.test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itbank.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class AOPTest {
	
	@Autowired
	private TestService ts;
	
	@Test
	public void test1() {
		ts.firstAOP();
	}
	
	@Test
	public void runTime() throws InterruptedException {
		long start=System.currentTimeMillis();
		
		System.out.println("로직 수행");
		
		Thread.sleep(1000);
		long end=System.currentTimeMillis();
		
		System.out.println("소요시간: "+(end-start)/1000.0);
	}
	

	@Test
	public void quiz() throws InterruptedException {
		
		long start=System.currentTimeMillis();
		System.out.println("로직 수행");
		
		Thread.sleep(1000);
		long end=System.currentTimeMillis();
		
		System.out.println("소요시간: "+(end-start)/1000.0);
	}
}