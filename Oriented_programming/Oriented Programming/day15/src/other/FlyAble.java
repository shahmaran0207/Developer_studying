package other;
/*
	Java에서는 class의 다중 상속이 불가능하다
	- 여러가지 클래스를 상속 받으면 기능이 많아지기 때문에 강력한 상속방식임
	- 강력한 상속방식이지만 안정성이 떨어짐 → 안정성을 이유로 JAVA에서는 막아놓은 상태
	- 하지만 다양한 타입을 상속 받으면 업 캐스팅도 다양하게 가능하다는 장점이 있음
	- 이 장점을 살리기 위해서 interface라는 구문을 별도로 작성하고 상속을 가능하게 함
	
	interface
	- 자바에서 다중 상속이 가능한 타입
	- 인스턴스 생성 불가
	- 클래스와 비슷하게 작성되지만, 내부가 모두 추상화 됨
	- 즉, 껍데기만 있다는 의미		 →  껍데기가 있기에 일관된 코드를 작성할 수 있음  →  →  →  즉, 인터페이스의 껍데기가 안정성을 가져옴!!!!
	- 인터페이스를 상속 받았다는 것은 특정 기능을 반드시 구현했다는 의미
	
	interface의 멤버
	- 필드는 모두 public static final 속성
	- 메서드는 모두 public abstract 속성
 */

public interface FlyAble {
	String type="날개";		// 보이지는 않지만 public static final이 적혀져 있음
	
	void fly();				//보이지는 않지만 public abstract속성이므로 몸체를 가질 수 없음
}