package interaction;

class Ball{
	String type;
	
	public Ball(String type) {
		this.type=type;
	}
}

class Child {
	String name;
	Ball ball;
	
	Child(String name) {
		this.name=name;
	}
	
	void takeBall(Ball baseball) {
		this.ball=baseball;
		String msg="\n%s가 %s를 얻었다\n";
		String type=(ball==null)?"X":ball.type;
		System.out.printf(msg, name, type);
	}
	
	void showInfo() {
		String name=(this.name==null)?"없음":this.name;
		String type=(ball==null)?"X":ball.type;
		System.out.printf("%s (공: %s)\n", name, type);
	}
	
	void throwBall(Child name2) {
//		minsu.throwBall(jinho);
//		의 경우 minsu는 보이지 않는 this에, jinho는 name2에 들어가있음
		
		String msg="\n%s가 %s로 부터 %s를 받았다\n";
		System.out.printf(msg, name2.name, name, ball.type);
		name2.ball=this.ball;
		this.ball=null;
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Child minsu=new Child("민수");
		Child jinho=new Child("진호");
		
		minsu.showInfo();	//민수(공: X)
		jinho.showInfo();	//진호(공: X)
		
		//공(필드: 타입)
		Ball baseball=new Ball("야구공");
		
		//어린이가 공을 얻는 메서드
		minsu.takeBall(baseball);

		minsu.showInfo();	//민수(공: 야구공)
		jinho.showInfo();	//진호(공: X)
		
//		다른 어린이에게 공을 던지는 메서드
		minsu.throwBall(jinho);
		minsu.showInfo();	//민수(공: X)
		jinho.showInfo();	//진호(공: 야구공)
	}
}
