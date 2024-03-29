package other;
/*
자바에서 기본 생성자를 생성하지 않는 경우 - 이 두가지 외에는 전부 자동생성함
1. 사용자가 다른 생성자를 명시적으로 정의한 경우

2. 상위 클래스가 매개변수를 갖는 생성자만을 가진 경우: 
*/

public class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String showInfo() {
		String msg="%s (%d세)";
		msg=String.format(msg, name, age);
		
		return msg;
	}
	
	public void eat(String food) {
		String msg="%s(이)가 %s를 먹는다\n";
		System.out.printf(msg, name, food);
	}
}