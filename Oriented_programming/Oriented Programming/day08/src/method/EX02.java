package method;
/*
 	지역변수
 	- 특정 영역에서 생성된 변수
 	- 해당 영역이 끝나면 메모리에서 제거됨
 	
 	※ 서로 다른 지역변수는 이름이 같아도 다른 변수임!
 */

public class EX02 {
	static void test(int n) {
		n+=5;
	}
	
	public static void main(String[] args) {
		int n=10;
		test(n);	//변수를 전달 인자로 사용시, 원본이 아닌
		//test(10);	//저장된 값을 복사해서 전달(= call by value)
		
		System.out.println("n= "+n);
	}
}