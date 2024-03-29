package object;
/*
	object 클래스
	- 자바의 최상위 클래스
	- 자바의 모든 클래스는 예외 없이 이 클래스를 상속받게 된다.
	- 따라서, 모든 클래스는 Object로 up-casting이 가능함 → object의 목적

	※Object에는 몇몇 필드, 메서드가 있다
	- 이를 오버라이드 해서 필요한 기능으로 변경해서 자주 사용
 */

class Person extends Object{	//extends object를 적지 않아도 자동으로 들어감
	private String name;
	private int age;

	Person(String name, int age){
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		String msg="%s (%d세)";
		return String.format(msg,  name, age);
	}

//	아래 두 메서드는 직접 작성을 권장하지 않음
//	보통 JAVA를 지원하는 IDE마다 자동완성을 제공함
	
//	아래 코드는 안만들어도 동작은 함
//	하지만 이름, 나이가 같으면 같다는 코드를 작성할 시 해시코드도 같게 출력되어야 함
//	그렇지 않아도 작동은 하지만 시스템 효율이 떨어짐  →  → 즉, 효율성 떄문에 작성하는 코드
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {	//object에는 모든 클래스가 들어갈 수 있음  → 매개변수가 object라는 것은 무엇이든 집어 넣을 수 있음
		if (this == obj)		//this=per1, obj=per2  →  → 인스턴스가 같으면 같을 수 밖에 없음
			return true;
		
		if (obj == null)		//비교할 인스턴스가 없으면 비교할 것이 없으므로 당연히 거짓
			return false;
		
		if (getClass() != obj.getClass())	//클래스가 다르면 같지 않으니 거짓
			return false;
		
		Person other = (Person) obj; // name과 age는 person에 있는 것  →  →  person으로 다운 캐스팅 해야 쓸 수 있음
		if (age != other.age)
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
			
		} else if (!name.equals(other.name))	//String 비교는 equals를 써야 함
			return false;
		
		return true;
	}
	
	
}

public class EX01 {
	public static void main(String[] args) {
		Person per1=new Person("홍길동", 25);
		Person per2=new Person("홍길동", 25);
		Person per3=per1;
		//여기서 만들어진 인스턴스는 2개 → 마지막 per3는 per1을 가리키는 참조변수임

		//toString(): 참조 변수 출력시 자동으로 호출되게 되어 있음
		//- 이를 오버라이딩 하면 참조 변수를 원하는 형태로 출력 가능함
		System.out.println("per1= "+per1);
		System.out.println("per1= "+per1.toString());
		
		System.out.println("\nper2= "+per2);
		System.out.println("\nper3= "+per3);
		
//		참조변수의 비교는 같은 인스턴스를 '가리키면' true
		System.out.println("\nper1 == per2 결과: "+(per1 == per2 ));
		System.out.println("\nper1 == per3 결과: "+(per1 == per3 ));
	
//		실제 인스턴스의 필드값으로 비교를 하려면 equals()라는 메서드를 사용
//		- 상속받은 형태로 그냥 쓰면 ==과 동일
//		- 따라서, 오버라이더 해서 사용하는 것이 일반적
		System.out.println("\nper1.equals(per2)결과: "+per1.equals(per2));
		System.out.println("per1.equals(per3)결과: "+per1.equals(per3));
	}
}