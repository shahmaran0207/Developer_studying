package final_;

class A{
	final void method_A() {
		System.out.println("A클래스 메서드");
	}
}

final class B extends A{
	/*
	- final 메서드는 오버라이드가 불가능 → '상속을 받지만' 바꾸지를 못하는 것!
	
	@Override
	void method_A() {
		System.out.println("B에서 오버라이드한 메서드");
	}
	*/
}

/*
	final 클래스는 더 이상 상속이 불가능함
	※상속을 하지 못하는 것일 뿐, 사용자체는 문제가 없음
class C extends B{
}

같은 이름 여러개 → overloading
같은 이름을 재정의 → overriding 
*/

public class EX03 {
	public static void main(String[] args) {
		B b=new B();
		b.method_A();
		
	}
}