package inherited;
/*
	클래스는 서로 상속 관계일때 형변환이 가능함
	1. up-casting		: 자식의 인스턴스를 부모의 참조변수로 가리키는 것
	2. down-casting		: up-casting된 인스턴스를 다시 자식 참조변수로 가리키는 것
 */

import other.Person;

public class EX03 {
	public static void main(String[] args) {
		//자식 참조 변수 = 자식 인스턴스
		Student stu=new Student("홍길동", 17, 91);
		
		stu.eat("김밥");
		stu.study("JAVA");
		System.out.println();
		
		//1. up-casting
		Person per=new Student("홍길동", 17, 91);
		per.eat("김밥");
		System.out.println();
		
//		업캐스팅시 자식의 필드는 참조 불가능
//		per.study("JAVA");
//		상위 클래스로 하위클래스 객체들을 묶어서 사용가능
		
		//2. down - casting
		//업캐스팅으로 묶인 객체들 중 자식의 멤버를 사용해야 하는 경우 사용
		Student tmp=(Student)per;
		tmp.study("JAVA");
	}
}