package interaction;
/*
	서로 다른 클래스 객체 간에 상호작용을 적용
 */

class Person{
	String name;

	Person(String name){
		this.name=name;
	}
}

class Car{
	String model;	//모델명			→	→ 기본값: null 	→	→	→	→ 아무것도 입력하지 않으면 기본값이 들어가게 됨
	int speed;		//속도			→	→ 기본값: 0
	Person driver;	//운전자(=사람) 	→	→ 기본값: null
	
	Car(String model){
		this.model=model;
	}
	
	void showInfo() {
//		운전자가 없는지(=null) 판별
//		- null인 상태에서 멤버를 참조하면 에러
		String name=(driver==null)?"없음":driver.name;
		
		String msg="%s (%d km/h, %s)\n\n";
		System.out.printf(msg, model, speed, name);	//driver.name → 사용하기 전 운전자가 있는지 없는지를 먼저 확인해야 함
	}
	
	void rideOn(Person driver) {
		this.driver=driver;
		System.out.println(driver.name+"님 탑승");
		this.showInfo();
	}
	
	void accel(int fast) {
		if(driver==null) fast=this.speed;	//상호작용시 상대방이 있는지를 잘 체크해야 함
		else this.speed+=fast;
		this.speed=fast;
		
		System.out.println(speed + " km/h 가속");
		this.showInfo();
	}
	
	void break_(int speed) {
		if(driver==null) speed=this.speed;
		else {
			if(this.speed-speed<=0)	this.speed=0;
			else this.speed-=speed;
		}

		System.out.println(speed+" /km/h 감속");
		this.showInfo();
	}
	
	void rideOff() {
		if(this.speed==0) {
			System.out.println(driver.name+" 하차");
			driver=null;
		}
		else System.out.println("하차 불가");
		showInfo();
	}
}

public class EX01 {
	public static void main(String[] args) {
		Person hong=new Person("홍길동");
		Car car=new Car("아우디");
//		car.showInfo();
		
		car.rideOn(hong);
		
//		연습) 자동차 가속 메서드
//		1. 전달한 정수만큼 속도를 증가
//		2. 단, 운전자가 없으면 속도 증가 가 되지 않게 함
		car.accel(30);
		
//		감속 메서드. 마찬가지로 운전자 있어야 함
		car.break_(20);
		
//		하차 메서드. 단, 속도가 0이 아니면 불가능
		car.rideOff();
	}
}