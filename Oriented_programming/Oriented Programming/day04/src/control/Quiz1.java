package control;
/* 
 * ※모두 조건문으로 풀 것
 1. 정수를 입력 받아서 절대값을 출력
 2. 두 정수를 입력받아서 큰 수를 출력
 3. 정수를 입력받아서 5의 배수인지 판별해서 출력
 4. 세 정수를 입력받아서 가장 큰 수를 출력
*/
//조건문이 조건 연산자보다 조금 더 세부적인 제어 가능

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc=new Scanner(System.in);

		//1. 
		System.out.print("정수를 입력하세요: ");
		num1=sc.nextInt();
		
		if (num1<0) {
			num1*=-1;
		}
		System.out.println("절댓값: "+num1+"\n");
		
		//2. 
		System.out.print("두 정수를 입력하세요: ");
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num2>num3) {
			System.out.printf("둘 중 더 큰 수는 %d입니다.\n", num2);
		}
		if(num3>num2) {
			System.out.printf("둘 중 더 큰 수는 %d입니다.\n",num3);
		}

		System.out.println();
		
//		이게 더 좋음! → else는 안쓰는게 성능상 더 좋기 때문
//		int big;
//		big=num2;
//		if(num2<num3) {
//			big=num3;
//		}
//		System.out.println("더 큰수: "+big);
//		System.out.println();
		
		//3. 
		System.out.print("정수를 입력하세요: ");
		num1=sc.nextInt();
		if(num1%5==0) {
			System.out.printf("%d는 5의 배수가 맞습니다.\n", num1);
		} else {
			System.out.printf("%d는 5의 배수가 아닙니다.\n", num1);
		}
		System.out.println();
		
		//4.
		System.out.print("세 정수를 입력하세요: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.printf("가장 큰 수는 %d입니다.\n", num1);
		} 
		if(num2>num1 && num2> num3) {
			System.out.printf("가장 큰 수는 %d입니다.\n", num2);
		} 
		if(num3>num1 && num3> num1) {
			System.out.printf("가장 큰 수는 %d입니다.\n", num3);
		}

//		마찬가지로 성능상 이 코드가 더 나음
//		int big=num1;
//		if(big<num2) {
//			big=num2;
//		}
//		if(big<num3) {
//			big=num3;
//		}
//		System.out.println("최댓값: "+big);
		sc.close();
	}
}
