package variable;

/*
 	변수 종류
 	1. 원시 타입
 		- boolean, char, byte, short, int, long, float, double
 		- 위 8가지만 가장 기본이 되는 원시 타입이다.
 		- 변수에 직접 메모리에 데이터를 저장
 		
 	2. 참조 타입
 		- 위 8가지를 제외한 모든 것
 		- 배열, 클래스 등
 		- 다른 곳의 데이터를 가리킨다
 		
 	※ 코딩에서 참조(reference)란 어떠한 대상을 가리키는 것을 의미함
 	
 */

public class EX06 {
	public static void main(String[] args) {
		int n=10;
		int[] arr=new int[] {10, 20, 30};
		
		System.out.println("n = "+n);
		System.out.println("arr= "+arr);
		System.out.println("arr[0]= "+arr[0]);
		
		//★이 코드는 꼭 pythontutor.com에서 그림으로 확인할 것!!!!
 	}
}
