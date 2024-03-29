package static_;

//패키지 클래스는 같은 패키지 안에서 공유됨
// 즉, 동일 패키지 내에서 같은 이름의 클래스 생성 불가

class Human{
	private String name;
	private static int eyes=2;

//	static 메서드는 this가 없다
//	- 왜? 클래스 자체가 가지며, 인스턴스가 공유(= 구분 불필요)
	static int getEyes() {
		return eyes;
	}
	
	static void setEyes(int eyes) {
		Human.eyes=eyes;
//		name="실행안됨";		//※ 정적 메서드에서 비정적 멤버에 접근이 불가함 (★순서상의 문제 때문임)
//		코드 순서상 getEyes() → Human hong=new Human("홍길동");실행됨 
//		→ 그러나 static은 클래스만 있으면 쓸 수 있는 반면
//		일반 멤버는 인스턴스가 생성되어야 사용이 가능함
//		→ 즉, 생성되지도 않은 것에 접근하려고 하니 순서상 문제가 생긴것
//		
//		정적 멤버는 인스턴스 이전에 사용될 가능성이 있는데 만들어지지 않은 코드를 사용하는 것은 순서상 모순임
//		→→→ 정적 멤버는 비정적 멤버에 접근이 불가하게 되는 것!!!
		}

	Human(String name){
		this.name=name;
	}
	
//	아래 메서드 원형
//	void showInfo(Human this)
//	- 일반 메서드는 모두 0번째 매개변수로 this를 가짐
//	- 왜? ★어떤 인스턴스가 메서드를 호출했는지 구분하기 위함
	void showInfo() {
		System.out.printf("%s (눈 %d개)\n", name, eyes);	//여기서 eyes가 접근 가능한 이유는 같은 클래스 내부이기 때문
	}
}

public class EX02 {
	public static void main(String[] args) {
		System.out.println("사람 눈 개수: "+Human.getEyes());	//여기서 바로 eyes로 접근이 불가한 이유는 private으로 인해 외부에서 접근이 불가하기 떄문
		
		Human hong=new Human("홍길동");
		Human kim=new Human("김민지");
		
		Human.setEyes(3);
		
		hong.showInfo();
		kim.showInfo();
	}
}