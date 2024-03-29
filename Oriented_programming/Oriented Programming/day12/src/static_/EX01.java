package static_;
/*
	클래스 멤버의 종류
	1. 일반 멤버
	- 인스턴스마다 별도로 공간을 가짐
	- 인스턴스가 생성되어야만 공간이 만들어진다.
	
	2. 정적 멤버
	- 인스턴스가 공유하는 공간
	- 인스턴스가 없어도 이미 공간이 있음
 */

class Person{
	//일반멤버(=인스턴스 멤버)
	String name;			//일반 멤버는 글자가 똑바로 나옴
	
	//정적 멤버(=클래스 멤버)
	static int eyes=2;		//정적 멤버는 글자가 약간 기울어져서 나옴 (마우스 가져갔을떄 아이콘에S나오면 static임)
	
	Person(String name){
		this.name=name;
	}
	
	void showInfo() {
		System.out.printf("%s (눈: %d개)\n\n", name, eyes);	
//		name에는 this.이 생략된 것,
//		하지만 eyes 앞에는 Person.이 생략된 것임!!! 
//		각 이름의 인스턴스에는 eyes가 없고, Person.eyes를 공유하기 때문!!!
	}
}

public class EX01 {
	public static void main(String[] args) {
//		cheon.eyes=3;	//인스턴스가 만들어지지 않음 + 변수도 만들어지지 않음
		System.out.println("사람 눈 개수: "+Person.eyes);
		
		Person cheon=new Person("천진반");
		Person kim=new Person("김민수");
		Person lee=new Person("이수진");
		
//		- 정적 멤버는 클래스 자체가 가지는 멤버
//		- 즉, 클래스명으로 접근하는 것이 올바른 방법임
//		cheon.eyes=3;	//공유하는 eyes를 바꾸니 둘 다 바뀌게 된 것 → 실행 자체는 가능하지만 이런식의 접근은 올바른 방식이 아님
		Person.eyes=3;	//eyes는 개개인의 값이 아닌 클래스의 공통값이라는 의미!
		
		cheon.showInfo();
		kim.showInfo();
		lee.showInfo();
	}
}