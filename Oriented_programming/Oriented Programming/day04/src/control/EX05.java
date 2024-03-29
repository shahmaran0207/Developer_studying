package control;

import java.util.Scanner;

/*
중첩 조건문
	- 조건문 안에 또 조건문을 구성하는 방식
	- 세부 조건을 판별 시 사용
	- 단, 남용시 가독성을 떨어뜨림으로 주의!
*/

public class EX05 {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("짝수");
			if(num%3==0) {
				System.out.println("짝수이며 3의 배수");
			}
			else {
				System.out.println("짝수지만 3의 배수는 아님");
			}
		} 
		
		else {
			System.out.println("홀수");
			if(num%3==0) {
				System.out.println("홀수이며 3의 배수");
			}
			else {
				System.out.println("홀수지만 3의 배수는 아님");
			}
		}
		
		sc.close();
	}
}