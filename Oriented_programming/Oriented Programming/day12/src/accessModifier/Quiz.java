package accessModifier;

import Quiz.Person;
/*
 	아래 코드가 실행되게 클래스를 ㄴ작성
 	단, 아래 클래스는 quiz 패키지에 작성할 것
 	
 	필드는 private로 지정 후 변경하지 않음
 */

public class Quiz {
	public static void main(String[] args) {
		Person p1=new Person("김민수", 23);
		Person p2=new Person("박지민", 21);
		
		p1.showInfo();
		p2.showInfo();
		
		p1.eat("김밥");	//김민수가 김밥을 먹는다
		p1.talkTo(p2);	//김민수가 박지민에게 대화를 건다
	}
}