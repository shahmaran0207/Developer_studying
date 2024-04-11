package com.itbank.DI;

import org.springframework.context.support.GenericXmlApplicationContext;
import com.itbank.beans.Toy;

/*
 Spring Framework의 대표 기능
 1. DI (Dependency Injection)
 - 객체에 필요한 필드(=의존성)을 spring이 알아서 처리
 - spring bean을 요청 시 의존성을 해결한 상태로 개발자에게 내어준다.
 
 2. IoC (Inverse of Control)
 - 실행의 '주'가 개발자가 아닌 프레임워크가 주도한다.
 - Spring이 우리가 작성한 코드를 호출해서 전체적인 프로그램이 동작
 
 3. AOP (Aspect Oriented Programming)
 - 관점 지향 프로그래밍
 - Service에서 공통적인 부분이 발생시 동일한 '관심사'를 묶어서 처리
 - 중복되는 부분을 효율적으로 처리 가능해 진다.
 
*/

// 스프링을 활용한 코드
public class Ex02 {
	public static void main(String[] args) {
		String path = "classpath:appCtx.xml";
		
		GenericXmlApplicationContext gxac;
		gxac = new GenericXmlApplicationContext(path);
		
		//Spring이 관리하는 객체를 spring bean이라고 한다.
		// - 이름이 겹치지 않으면 클래스명 만으로 spring bean을 받을 수 있다.
		Toy t1 = gxac.getBean(Toy.class);
		
		t1.run();
		
		//spring bean은 기본 싱글톤 이라는 방식으로 관리되는데
		// - 혹시 이름이 겹치는 bean이 있으면 이름을 명시해서 정확히 받을 수 있다.
		Toy t2=gxac.getBean("t1", Toy.class);
		t2.run();
		
		//객체를 요청할 때마다 1개만 생성 후 같은 것을 계속 반환해준다.
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		
		
		
		
		gxac.close();
	}
}