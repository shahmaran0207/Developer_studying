package inherited;

import other.Person;

class Student extends Person{
	private int score;
	
	Student(String name, int age, int score){
		//	super(); //→ 부모 클래스의 기본 생성자를 호출하는 코드 →  → 즉, 호출할 기본 생성자가 없다면 형시겡 맞게 적어줘야 함
		super(name, age);	//부모 클래스에서 생성된 생성자는 부모 클래스에서 초기화
		this.score=score;	//부모 클래스에는 score가 없음  →  →  자식 클래스에서 직접 초기화해야 하므로 이렇게 해야 함
		
		//상속: 공통된 것을 묶는 것
	}
	
	@Override	
	//@Override: 어노테이션  → 자바에서 정의된 클래스파일+특수기능 
	//→ 오버리이드가 제대로 되었는지 검사  
	//→ 무조건 부모꺼를 덮어씀( → 부모 클래스와 자료형, 지시자가 모두 같아야 함)
	//오버라이드 키워드가 없어도 오류가 발생하지는 않음
	public String showInfo() {
		
//		return super.showInfo()+" "+score+"점";
//		- super.메서드명(): 부모의 메서드를 호출함
		
//		오버라이드 전체를 다시 써도 된다.
		String msg="%s (%d세, %d점)";	// 이렇게 완전히 새로 써도 되고, 받아서 써도 됨
		//오버라이드 하는 경우: 물려받았는데 기능이 마음에 안들거나 기능이 부족한 경우
		msg=String.format(msg,  name, age, score);	
		//private 클래스는 자식 클래스가 상속을 받았더라고 직접 접근은 불가능!
		return msg;
	}
	
	public void study(String subject) {
		String msg="%s(이)가 %s을(를) 공부한다\n";
		System.out.printf(msg, name, subject);
	}
	
}

public class EX02 {
	public static void main(String[] args) {
		Person per=new Person("홍길동", 33);
		
		System.out.println("per= "+per.showInfo());
		per.eat("라면");
		
		Student stu=new Student("김민지", 18, 88);
		System.out.println("\nstu= "+stu.showInfo());
		stu.eat("떡볶이");
		stu.study("java");
		
//		자식 클래스가 사용되는 메서드
//		1. 그대로 물려받은 메서드
//		2. 오버라이드한 메서드
//		3. 자식에서 생성한 메서드
	}
}