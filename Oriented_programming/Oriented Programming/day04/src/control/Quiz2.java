package control;
/*
	1. USB 8GB 메모리가 1개 5,000원이다. 구매 개수를 입력받아서 총 가격을 입력하는 프로그램을 작성
	단, 10개 이상 시 10% 할인하고
	50개 이상 시 15% 할인한 금액을 적용
*/

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		int count, price=5000;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("구매 개수를 입력하세요: ");
		count=sc.nextInt();
		
		if(count>=10) {
			if(count>=50) {
				price*=0.85; //복합대입연산자 사용시 좌변의 자료형에 자동으로 맞춰줌
			}
			else {
				price*=0.9;
			}
		}
		int result=count*price;
		
		System.out.printf("총 가격은 %d원 입니다.\n", result);
		sc.close();
	}
}