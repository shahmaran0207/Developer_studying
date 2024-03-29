package accessModifier;
/*
	메서드는 기능이므로 밖에서 접근이 가능해야 함--> public으로 주는 경우 많음
	필드 --> 중요 정보일 경우가 많음 → 외부에서 함부로 접근하면 문제가 생김 → 최소가 protected, 일반적으로 private
 */

import other.person;

public class EX01 {
	public static void main(String[] args) {
		person p1=new person("홍길동", 27, 171.3);
		
		p1.name="홍진호";
//		p1.age=22;	age는 패키지 속성이므로 외부에서 접근불가
//		p1.height=172.22; height는 private 클래스로, 같은 패키지에서도 불가하며, 클래스 내부에서만 접근이 가능함
//		ㄴ height는 결국 외부에서 '직접 접근이 불가함'
		
		
		p1.showInfo();
//		- 하지만, public으로 공개된 메서드를 통해서
//		- 간접적으로 height의 데이터를 확인할 수 있음
//		
//		중요!) 이 간접적으로 접근하는 행위에서 안정성이 따라옴
		
	}
}