package inherited;

import other.Person;
/*
 	1. 상속 없이 Student, Police 구현 시
 	Student			police
 	-------			--------
 	name			name
 	age				age
 	score			score
 	
 	showInfo()		showInfo()
 	eat()			eat()
 	study()			study()
 	
 	2. 공통점을 상위 클래스  Person으로 묶어서 상속
 	
 	Person
 	--------
 	name
 	age
 	
 	showInfo()
 	eat()
 	 
 	↓			↘
 	
 	Student			Police
 	--------		--------
 	scorer			rank
 	study()			patrol()
 */

class Police extends Person{
	private String cla;
	
	Police(String name, int age, String cla){
		super(name, age);
		this.cla=cla;
	}
	
//	@override
	public String showInfo() {
//		String msg="%s (%d세), 직급: %s";
//		msg = String.format(msg, name, age, cla);
//		return msg;
		
		return super.showInfo()+", "+"직급: "+cla;
	}
	
	public void patrol(String area) {
		String msg="%s가 %s를 순찰한다\n";
		System.out.printf(msg, name, area);
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		//아래 코드가 동작하게 클래스를 작성
		//단, other.Person을 상속 받아서 작성할 것
		
		Police pol=new Police("김민수", 29, "순경");
		
		System.out.println("pol= "+pol.showInfo());
		//pol= 김민수, 29, 순경
		
		pol.eat("팥빵");//김민수가 팥빵을 먹는다
		
		pol.patrol("해운대구");	//김민수가 해운대구를 순찰한다.
	}
}