package accessModifier;

//package 클래스
//- 외부에서 import 할 수 없다
//- .java파일과 이름이 달라도 된다.
class Human{
	private String name;
	private int age;
	
	Human(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	String getName() {
		return name;
	}
	
	void setname(String name) {
		this.name=name;
	}
	
//	access 메서드
//	- getter/setter라고 하며
//	- 필드를 간접적으로 제공하는 메서드
}

/* getter/setter
 1. 용도에 따라 둘 중 하나만 만들어도 됨
 2. 대부분의 라이브러리에서 getter/setter를 채택하고 있음
 */

//public 클래스
//- 외부에서 import 할 수 있다.
//- 단. java 파일과 이름이 같아야 한다
//- 따라서 한 .java에 한개만 작성이 가능함
public class EX02 {		
	public static void main(String[] args) {
		Human h1=new Human("홍길동", 34);
		
//		System.out.println("이름: "+h1.name);
//		System.out.println("나이: "+h1.age);
		
		System.out.println("이름: "+h1.getName());
	}
}