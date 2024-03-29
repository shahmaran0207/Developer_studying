package accessModifier;

import other.Person;

//변수를 public으로 직접 풀어주는 것보다는 get/set으로 간접적으로 풀어주는 것이 안전함

public class EX01 {
	public static void main(String[] args) {
		Person per=new Person("홍길동", 34);
		System.out.println("per이름: "+per.getName());
		
		//getter와 setter는 반드시 둘 다 구현할 필요 없음 → 필요시 get or set만 구현해서 사용함
		per.setName("윤진영");
		System.out.println("per이름: "+per.getName());
		
		per.setAge(44);
		System.out.println("per나이: "+per.getAge());
	}
}