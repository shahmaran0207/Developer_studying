package thread;

//Thread클래스를 상속 받아서 멀티 스레드로 사용 시
//다른 클래스를 상속 받을 수 없는 문제 발생
//이를 해결하기 위해서 인터페이스 Runnable이 제공됨
class Test2 implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

public class EX02 {
	public static void main(String[] args) {
		
		//Runnable은 직접 사용 하는 것이 아닌
		Test2 t1=new Test2();
		
		//Thread 객체 생성자에 전달 후 실행 가능
		Thread th1=new Thread(t1);
		Thread th2=new Thread(()-> {
			for(int i=5; i>=1; i--) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		});
		
		th1.start();
		th2.start();
		
		String[] arr=new String[] {"Anglur", "Basic", "C##", "Django", "Flask"};
		
		for(String n: arr) {
			System.out.println(n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}