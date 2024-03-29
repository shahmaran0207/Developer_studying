package inherited;

import other.Person;

class Doctor extends Person {
	private String hos;
	
	Doctor(String name, int age, String hos){
		super(name, age);
		this.hos=hos;
	}
	
	@Override
	public String showInfo() {
		
		return super.showInfo()+", "+hos;
	}
	
	void cure(Person per) {		//상위 클래스인 Person으로 업캐스팅 한 것!
		String msg="%s의 %s가 %s를 치료한다.\n";
		System.out.printf(msg, hos, name, per.getName());
	}
}

public class Quiz2 {
	public static void main(String[] args) {
//		아래 코드가 동작하게 클래스를 작성
//		단, other.Person을 상속받을 것
		Student stu=new Student("홍길동", 15, 78);
		Police pol=new Police("김민지", 33, "경위");
		Doctor doc=new Doctor("박진수", 40, "내과");
		
		System.out.println(doc.showInfo());
		//박진수 40세 내과
		
		doc.eat("샐러드");
		
		doc.cure(stu);		//의사가 '사람'을 치료하는 메서드
		doc.cure(pol);		//내과의 박지수가 김민지를 치료한다
		
		
	}
}