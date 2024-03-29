package Quiz;

public class Car {
	private String model;
	private int speed;
	private Person driver;
	
	public Car(String model){
		this.model=model;
	}

	public void showInfo() {
		String on = (this.driver!=null)?driver.getName():"X";
		String msg="%s (%d km/h, %s)\n\n";
		System.out.printf(msg, this.model, this.speed, on);
	}
	
	public void rideOn(Person driver) {
		if(this.driver==null) {
			this.driver=driver;
			System.out.printf("%s님이 탑승\n\n", this.driver.getName());
			showInfo();
			}
		
		else System.out.println("이미 운전자가 있습니다.");
	}

	public void accel(int fast) {
		if(this.driver !=null) {
			speed+=fast;
			System.out.printf("%d km/h 가속\n", fast);
		}
		else System.out.println("운전자가 없습니다.");
		showInfo();
	}
}