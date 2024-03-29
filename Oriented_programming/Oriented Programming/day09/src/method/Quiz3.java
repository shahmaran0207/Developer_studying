package method;

/*
	1. 재귀함수를 이용해서 factorial을 구현(=누적곱)
	2. 재귀 함수를 이용해서 피보나치 수열을 구현
	
 */

import java.util.Scanner;
public class Quiz3 {
	static int factorial(int n) {
		if(n==1) return 1;
		return n*factorial(n-1);
	}
	
	static int fibonaci(int n) {
		if(n==1 || n==2) return 1;
		return fibonaci(n-1)+fibonaci(n-2);
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		n=sc.nextInt();
		
		int fac=factorial(n);
		System.out.printf("factorial(%d)= %d\n", n, fac);
		
		int fibo=fibonaci(n);
		System.out.printf("fibonaci(%d)= %d\n", n, fibo);
		
		sc.close();
	}
}