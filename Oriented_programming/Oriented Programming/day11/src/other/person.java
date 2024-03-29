package other;
/*
	접근제어 지시자: 멤버에 접근하는 정도를 지정하는 키워드
	1. private		: 클래스 내부에서만 접근 가능
	2. package		: 클래스 내부 + 같은 패키지까지 접근 가능		
		→ private로 하면, 값을 바꾸는 것도 안되지만, 조회도 안됨 → 즉, 직접 접근 자체가 불가한 것!(간접 접근으로 우회해야함)
		→ 접근이 가능하게 되면 의도하지 않아도 코드가 꼬여들아가는 경우도 있음
	    → 간접접근: 값을 바꾸는 것은 불가하지만 조회는 가능하게 됨(코드의 안정성이 따라옴!!) 
	
	3. protected	: 내부+같은 패키지+상속받은 클래스까지 접근 가능
	4. public		: 내부+같은 패키지+상속+외부 접근 가능 → 즉, 어디서든 접근 가능
	
	※접근 제어자: 코드의 안정성을 높여줌
	→ 안쓴다고 코드를 못짜는 등 문제가 생기는 것은 아니지만 안정성이 떨어짐
 */

public class person {	//여기서 public이 없으면 외부(=다른 패키지)에서 사용불가
	//int age; 처럼 지시자가 없으면 package 속성임/ 그렇다고 package를 쓰면 안됨(가장 처음에 패키지를 쓰고 있기 때문)
	public String name;
	int age;
	private double height;
	
	public person(String name, int age, double height){
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	public void showInfo() {
		String msg="%s (%d세, %.1fcm)\n";
		System.out.printf(msg, name, age, height);
	}
}