package Quiz;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void showInfo() {
		String msg="%s (%d세) \n\n";
		System.out.printf(msg, this.getName(), this.getAge());
	}
	
	public void eat(String food) {
		String msg="%s가 %s를 먹었습니다.\n\n";
		if (this.getName() !=null) System.out.printf(msg, this.getName(), food);
		else return;
	}
	
	public void talkTo(Person name) {
		String msg="%s가 %s에게 말을 걸었습니다.\n\n";
		if (this.getName() !=null && name!=null) System.out.printf(msg, this.getName(), name.getName());
		else return;
	}
}