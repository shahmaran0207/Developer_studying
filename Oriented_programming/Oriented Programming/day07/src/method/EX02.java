package method;

public class EX02 {
	// 매개변수(=parameter) →→→→→→→ 매개변수도 '지역변수'의 일종임 
	//- 메서드 호출 시 전달된 값을 저장하는 변수 
	static void hello(int n) {	
		for(int i=1; i<=n; i++) {
			System.out.println(i+": Hello World");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		hello(1);	//전달인자(=arguments)
		hello(7);	//- 메서드 호출 시 메서드에 전달하는 값
		hello(4);
	
		//매개변수 전달인자 사용 팁
		//1. 매개변수와 전달인자는 개수 및 타입을 일치시키자
		//2. 매개변수에는 전달인자가 순서대로 전달된다.
		
//		hello(3.0); // 타입 불일치
//		hello(3,2); // 개수 불일치
		
	}
}