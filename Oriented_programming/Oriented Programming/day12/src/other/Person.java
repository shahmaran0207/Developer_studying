package other;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}

	//getter/setter: alt+s
	//getter	: 필드이 값을 얻을 때
	
	public String getName() {	//getName: get+name의 합성어 → Name을 대문자로 하지 않으면 추후 에러가 발생할 가능성이 존재함
		return name;
	}

	//setter	: 필드의 값을 변경할 때
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}