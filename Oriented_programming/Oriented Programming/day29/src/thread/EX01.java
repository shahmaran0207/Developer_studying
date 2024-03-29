package thread;

/*
 	Thread: 쓰레드
 	- 한 프로그램 내의 실행흐름을 의미
 	- java는 기본적으로 main에서 한개의 thread가 생성되고 코드가 순차적으로 수행됨
 	- 이 thread는 여러 개를 생성 후 실행도 가능함 → 멀티쓰레드(한 프로그램에서 흐름이 여러개)
 */

//Thread클래스를 상속 받아 생성 가능
class test1 extends Thread{
	//새로 생성할 쓰레드의 코드는 run()을 오버라이딩 한다.
	
	@Override
	public void run() {				//run을 상속받아서 사용하는데 원래 throw가 안되게 돼있음 그래서 여기서 오류 전가 불가
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
	
}

public class EX01 {
	public static void main(String[] args) {
		test1 t1=new test1();
		test1 t2=new test1();
		
//		t1.run(); //실행할 코드는 run()에 구현
//		t2.run();
		
		t1.start();	//start에서 새 쓰레드가 만들어지는 것
		t2.start(); //새 쓰레드를 만들어 실해하려면 start()호출!
		
		//총 스레드 3개  → start에서 각 1개씩 + main에 하나
		
		System.out.println("???");
	}
}