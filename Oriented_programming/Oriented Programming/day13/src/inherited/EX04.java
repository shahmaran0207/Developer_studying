package inherited;

import other.Person;

public class EX04 {
	public static void main(String[] args) {
		Person per=new Person("홍길동", 34);
		Student stu=new Student("김민지", 16, 87);
		Police pol=new Police("박철수", 34, "경위");
		
		//업캐스팅은 아래와 같이 하위 클래스를 묶는 용도로 자주 사용됨
		Person[] pers=new Person[] {per, stu, pol};
		//Student와 Police는 형이 Person이 아님에도 불구하고 Person형 배열에 들어가게 됨 → 업캐스팅
		
		for(int i=0; i<pers.length; i++) {
			System.out.println(pers[i].showInfo());
		}
		System.out.println();
		
//		person[1].study("JAVA");  →  →  → 여기서는 student가 아닌 person형으로 취급받기에 student의 요소 출력 불가
		
		//Person 무리 중 학생을 꺼내서 다운 캐스팅을 적용하면
		Student tmp=(Student)pers[1];
		
		tmp.study("JAVA");
		
//		다운 캐스팅시 원래 타입과 맞지 않으면 에러발생
//		tmp=(Student)pers[2];
		
//		업캐스팅된 인스턴스의 원래 타입 파악하기
		System.out.println(pers[1] instanceof Student);
		System.out.println(pers[2] instanceof Student);
		System.out.println(pers[2] instanceof Police);
		
	}
}