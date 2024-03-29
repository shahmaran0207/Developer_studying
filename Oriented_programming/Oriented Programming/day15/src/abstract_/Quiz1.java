package abstract_;
/*
	1. 실수형 배열을 생성 후 내림차순 정렬
	2. 문자형 배열을 생성 후 오름차순 정렬
	3. Person 클래스를 생성 후 나이순으로 내림차순
	- 핃드는 이름, 나이만 가짐
 */

import java.util.Arrays;
import java.util.Comparator;

class Person{
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	Person(String name, int age){
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return name+" "+"("+age+"세)";
	}
}
public class Quiz1 {
	public static void main(String[] args) {
		Comparator<Double> desc_d=(Double o1, Double o2) -> {
			int n=(int)(o2-o1);
			return n;
		};

		Comparator<Integer> desc_I=(Integer o1, Integer o2) ->{
			return o1-o2;
		};

		Double[] db=new Double[] {3.14, 1.17, 4.2, 5.8};
		Arrays.sort(db,  desc_d);
		System.out.println("double형: "+Arrays.toString(db));

		//정수
		String[] arr2=new String[] {"JAVA", "C++", "PYTHON"};

		Comparator<String> asc=(String o1, String o2) -> {
			return o1.compareTo(o2);
		};

		Arrays.sort(arr2, asc);
		System.out.println("Integer형: "+Arrays.toString(arr2));

		//인물
		Person[] perp=new Person[] {
				new Person("홍길동", 26),
				new Person("이수진", 23),
				new Person("김민지", 24),
				new Person("김길동", 27)
		};

		Comparator<Person> age=(Person o1, Person o2) -> {
			return o2.getAge()-o1.getAge();
		};

		Arrays.sort(perp, age);
		System.out.println("인간형: "+Arrays.toString(perp));


		Comparator<Person> name=(Person o1, Person o2) -> {
			String name1=o1.getName();
			String name2=o2.getName();
			return name2.compareTo(name1);
		};
		Arrays.sort(perp, name);
		System.out.println("인간형: "+Arrays.toString(perp));
	}
}