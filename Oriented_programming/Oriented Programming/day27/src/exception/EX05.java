package exception;

import java.util.Scanner;

/*
개발자가 직접 예외 클래스를 작성해서 사용도 가능하다.
- 예외 클래스로 사용하기 위해서는  Exception을 꼭 상속받아야 한다
- 하지만, JAVA는 이미 만들어진 예외 클래스가 많아서 직접 만들어서 사용하는 경우는 적음

직렬화: 자바 언어에서 사용되는 데이터를 다른 컴퓨터에서도 사용 할 수 있게 하는 기술(바이트 스트림 형태로 연속적인 데이터로 변환하는 포맷 변환)
- 
*/

class PositiveException extends Exception{
	public PositiveException(String message) {
		super(message);
	}

	//아래는 '자바 직렬화'라는 부분 검색
	//클래스에 생성자 만들지 않으면 자동으로 기본 생성자 만들어짐
	private static final long serialVersionUID = -919280856526411615L;
	
	
}

public class EX05 {
	static int input(Scanner sc) throws PositiveException {
		int n;
		
		System.out.print("양수 입력: ");
		n=sc.nextInt();
		
		if(n<0) {
			throw new PositiveException("양수 아님");
		}
		
		return n;
	}
	
	public static void main(String[] args) throws PositiveException {
		Scanner sc=new Scanner(System.in);
		int n=input(sc);
		
		System.out.println("n= "+n);
		sc.close();
	}
}