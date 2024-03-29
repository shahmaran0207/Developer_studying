package static_;
/*
 	아래 메서드 구현
 	단, Function 클래스 아래 작성할 것
 	1. 1~n 까지의 합계를 반환
 	2. 절대값을 반환하는 메서드
 	3. 배열 오름차순 정렬(=선택 정렬)
 	4. 소수를 판별하는 메서드
 */

import java.util.Arrays;

import static_.other.Function;

public class Quiz1 {
	public static void main(String[] args) {
		//1.
		int sum=Function.total(5);	//클래스명을 쓸 경우 반드시 static을 써야함
		System.out.println(sum);
		System.out.println();
		
		//2.
		int n=Function.absolute(-5);
		System.out.println(n);
		System.out.println();
		
		//3. 
		int[] arr=new int[] {50,10,20,40,30};
		Function.selectSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		//4.
		boolean prime=Function.isPrime(7);
		System.out.println(prime);
		System.out.println();
	}
}