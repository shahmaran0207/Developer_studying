package inherited;
/*
	상속: 재산 따위를 물려주는 행위

	클래스의 상속
	- 기존에 작성된 클래스의 기능을 물려받아서 새 클래스를 작성하는 기법
	- 클래스들의 공통된 부분을 상위 클래스로 묶어서 재사용성을 높임

	상속하는 클래스: 부모, 상위, 슈퍼, 기반 클래스라고 함

	상속받는 클래스: 자식, 하위, 서브, 파생 클래스라고 함
	
	자식 인스턴스는 내부에 부모 인스턴스를 품고 있음 --> 자식 인스턴스는 부모의 필드 + 메서드를 가지고 있음 
		--> 자식 인스턴스는 부모 인스턴스와 메서드를 사용할 수 있지만
		--> 부모 인스턴스는 자식 인스턴스와 메서드를 사용할 수 없음
*/

class Super{
	int n=10;
	Super(){
		System.out.println("\n부모 생성자 호출");
	}
	
	void supMethod() {
		System.out.println("부모 클래스의 메서드 입니다 ~\n");
	}
}

class Sub extends Super{
	int m=20;
	Sub(){
		super();	//부모 생성자를 호출하는 키워드
		
		System.out.println("자식 생성자 호출");
	}
	
	void subMethod() {
		System.out.println("자식 클래스 메서드 입니다~\n");
	}
}

public class EX01 {
	public static void main(String[] args) {
		Super sup=new Super();
		
		System.out.println("n= "+sup.n);
		sup.supMethod();
		
//		2. 하지만 부모는 자식의 인스턴스를 가지지 않음
//		즉, 자시그이 멤버는 사용 불가능
//		System.out.println("m= "+sup.m);
//		※상속은 위에서 아래로 → 부모가 자식 클래스를 상속 받는건 불가능 →  →  → 클래스 상속은 양방향 불가능!
		
		//1. 자식 인스턴스는 내부에 부모 클래스를 가지고 있음
		Sub sub=new Sub();
		
		//따라서, 부모의 멤버는 물ㄹ론
		System.out.println("n= "+sub.n);
		sub.supMethod();
		
		//자신의 멤버까지 사용 가능
		System.out.println("m= "+sub.m);
		sub.subMethod();
	}
}