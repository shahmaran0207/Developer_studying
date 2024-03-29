package abstract_;

import java.util.Arrays;
import java.util.Comparator;

/*
	Comparable 은 해당 클래스의 '기본' 비교기준
	- 지정 클래스에 상속 받아서 구현
 */

class Human implements Comparable<Human>{
	private String name;
	private int age;
	private double height;

	public int getAge() {
		return age;
	}

	Human(String name, int age, double height){
		this.name=name;
		this.age=age;
		this.height=height;
	}

	@Override
	public String toString() {
		String msg="%s (%d세, %.1fcm)";
		msg=String.format(msg, name, age, height);
		return msg;
	}

	@Override
	public int compareTo(Human o) {
//		this: 앞
//		o: 뒤
		return name.compareTo(o.name);
	}
}

public class EX07 {
	public static void main(String[] args) {
		Human[] hus=new Human[] {
				new Human("홍길동", 30, 172.3),
				new Human("이수진", 26, 183.9),
				new Human("김민지", 24, 178.5),
				new Human("김길동", 27, 156.9)
		};
		Arrays.sort(hus); 	//Comparable<Human>를 상속 받아서 사용해야 함
		System.out.println("hus= "+Arrays.toString(hus));
		
//		그 외 비교기준은 외부에서 Comparato를 사용한다
		Comparator<Human> ageDesc=(Human o1, Human o2) -> {
			return o2.getAge()-o1.getAge();
		};
		Arrays.sort(hus, ageDesc); 	//Comparable<Human>를 상속 받아서 사용해야 함
		System.out.println("hus= "+Arrays.toString(hus));
	}
}
