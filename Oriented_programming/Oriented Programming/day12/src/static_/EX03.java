package static_;

import static_.other.Function;
//하위 패키지에 있는 것이라도 import는 해야 함

//클래스 내에서 사용할 떄는 이름이 겹치지 않는 한, 클래스명 생략 가능
//아래의 경우 외부 클래스에서 가져오므로 클래스 명을 써 주는 것

/*
	필드가 없는 클래스는 인스턴스를 만들어도
	전부 동일하게 만들어짐.

	즉, 단순하게 메서드(=기능)만 필요하면 
	인스턴스 없이 클래스로 바로 사용하는 것이 효율이 좋음
 */

public class EX03 {
	public static void main(String[] args) {
		//정적 멤버는 인스턴스 없이 바로 사용이 가능함
		//1. 1~n까지 일렬로 출력하는 메서드.
		Function.printNumber(5);
		Function.printNumber(10);

	}
}