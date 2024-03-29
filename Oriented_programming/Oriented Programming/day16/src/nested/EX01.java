package nested;
/*
	중첩 클래스(nested class)
	- 클래스 안에 클래스를 작성하는 기법
	- 객체 지향의 캡슐화를 더욱 높이는데 사용
 */

class Outer{
	private int out=10;
//	private Inner in;
	
//	인스턴스 중첩 클래스
//	- Outer의 멤버로 존재하는 클래스
//	- 멤버이므로 private 같은 지시자가 붙을 수 있음
	private class Inner{	
//		Inner는 Outer의 멤버이므로 Outer의 private 접근 가능
		void inMethod() {
			System.out.println("out= "+out);
		}
	}
	
	void outMethod() {
		System.out.println("outMethod 실행");
		System.out.println("Inner 인스턴스 생성");
		Inner in=new Inner();	//이렇게 하면 지역변수 → 함수 끝나면 끝남  → 유지시키고 싶으면 필드로 생성해야 함
 		in.inMethod();
	}
}

public class EX01 {
	public static void main(String[] args) {
		Outer o=new Outer();
		
	}
}