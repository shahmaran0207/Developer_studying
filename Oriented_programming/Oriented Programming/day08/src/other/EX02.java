package other;

import java.util.Random;

public class EX02 {
	public static void main(String[] args) {
		//Random을 좀 더 쉽게 제공하는 클래스
		Random ran=new Random();
		int n=ran.nextInt();	//int 범위 내에서 정수를 랜덤으로 반환
//		for(int i=0; i<5; i++) {
//			System.out.println("n= "+n);
//		}
//		System.out.println();
//
//		for(int i=0; i<5; i++) {
//			n=ran.nextInt(10);
//			System.out.println("n= "+n);
//		}
//		System.out.println();
		
//		연습) 11 ~ 35사이 랜덤 정수 3개를 출력
		for(int i=0; i<3; i++) {
			n=ran.nextInt(25)+11;
			System.out.print(n+" ");
		}
	}
}
