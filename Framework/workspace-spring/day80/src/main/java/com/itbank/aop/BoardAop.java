package com.itbank.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.itbank.model.vo.BoardVO;

@Component
@Aspect
public class BoardAop {
	@Before("execution(* com.itbank.service.BoardService.getboard(int))")
	public void param(JoinPoint jp) {
		System.out.println("파라미터 테스트");

		for (Object ob : jp.getArgs()) {
			System.out.println(ob);
		}

		System.out.println(jp);
		System.out.println(jp.getSignature());
		System.out.println(jp.getSignature().getName());

		String methodName = jp.getSignature().getName();

		System.out.println(methodName);
	}

	@After("execution(* *.*.service.BoardService.*(com.itbank.model.vo.BoardVO))")
	public void vocheck(JoinPoint jp) {
		BoardVO vo= (BoardVO) jp.getArgs()[0];
		
		System.out.println("번호: "+vo.getIdx());	//값을 바꾸는 것이 아니므로 before / after 상관없음, 물론 set 등을 통해 값을 바꾼다면 중요함
	}
}