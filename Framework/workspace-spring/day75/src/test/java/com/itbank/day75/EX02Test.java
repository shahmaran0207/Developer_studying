package com.itbank.day75;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EX02Test {

	private int num;
	private static int share;
	
	@BeforeClass //테스트 클래스(EX02Test)가 수행시 딱 한번만
	public static void setShare() {
		System.out.println("beforeclass수행");
		share=10;
	}
	
	@org.junit.Before		//@test들 마다 먼저 수행되는 코드
	public void seNum() {
		System.out.println("\nbefore 수행");
		num=10;
	}
	
	@Test
	public void run1() {
		System.out.println("run1 실행");
		
		num+=2;
		share+=2;
		System.out.println("run1의 num= "+num);
		System.out.println("run1의 share= "+share);
	}
	
	@Test
	public void run2() {
		System.out.println("run2 실행");
		
		num+=2;
		share+=2;
		System.out.println("run2의 num= "+num);
		System.out.println("run2의 share= "+share);
	}

	@After							//@Test 들마다 끝난 후 수행되는 코드
	public void resultNum() {
		System.out.println("after 수행");
		System.out.println("num= "+num);
		System.out.println("share= "+share);
	}
	
	@AfterClass
	public static void resultshare() {
		System.out.println("after 클래스 수행");
	}
}