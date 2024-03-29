package interaction;
//복합대입연산자도 대입연산자임 → 우변먼저 하고 복합대입연산자 진행

class Human{
	String name;
	Human(String name){
		this.name=name;
	}
}

class Taxi{
	String model;
	int speed;
	Human[] sits=new Human[4];
	//- 0: 운전석
	//- 나머지: 보조석

	Taxi(String model) {
		this.model=model;
	}
	
	void accel(int fast) {
		if(sits[0]!=null) speed+=fast;
		else System.out.println("운전자가 없습니다.");
		showInfo();
	}
	
	void showInfo() {
		String[] tmp=new String[4];
		String msg="[%s, %s, %s, %s]\n\n";
		
		//사람이 있으면 해당 좌석 이름을, 없으면 빈좌석 반환
		for(int i=0; i<sits.length; i++) {
			tmp[i]=(sits[i]==null)?"빈좌석":sits[i].name;		
		}
		System.out.printf(msg, tmp[0], tmp[1], tmp[2], tmp[3]);

//		for(int i=0; i<sits.length; i++) {
//			sits[i].name=(sits[i]==null)?"빈좌석":sits[i].name;		//이게 불가능한 이유는 sits[i]가 null이면 '빈좌석'이라는 것을 대입할 공간 자체가 없기 때문임
//		}
//		
//		System.out.printf(msg, sits[0].name, sits[1].name, sits[2].name, sits[3].name);
//		
//		System.out.printf("%s (%d km/h)\n\n", model, speed);
	}
	
	void rideOn(int num, Human name) {
		if(sits[num]==null) { 
			sits[num]=name;
			System.out.printf("%d번 좌석에 %s 탑승\n", num+1, name.name);
		}
		else System.out.println("탑승 불가");
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		Taxi car=new Taxi("아반떼");
		
		Human hong=new Human("홍길동");
		Human kim=new Human("김민수");
		Human lee=new Human("이수민");
		
		car.showInfo();	//아반떼: [빈좌석, 빈좌석, 빈좌석, 빈좌석] 
		
		car.rideOn(0, hong);	//0번석(=운저석)에 홍길동 탑승
		car.rideOn(1, kim);		//1번석에 김민수 탑승
		
		car.rideOn(1, lee);		//1번석에 이미 사람 있음 --> 탑승 불가
		car.rideOn(3, lee);		//3번석에 이수민 탑승
		
		car.showInfo();	//아반떼: [홍길동, 김민수, 빈좌석, 이수민] 
		
		car.accel(30);	//자동차 가속 메서드, 운전자 없으면 실행 불가
	}
}