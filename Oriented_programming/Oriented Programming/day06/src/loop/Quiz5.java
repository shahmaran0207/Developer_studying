package loop;

import java.util.Scanner;

/*
 	※for문을 이용해서 풀기!
	1. 정수를 입력받아서 1~n까지 출력
	2. 정수를 입력받아서 약수를 모두 출력
	3. 정수를 입력받아서 소수인지 판별
*/

public class Quiz5 {
	public static void main(String[] args) {
		int num=0;
		Scanner sc=new Scanner(System.in);
		boolean bo=true;
		
		System.out.print("정수 하나를 입력해 주세요: ");
		num=sc.nextInt();
		
		for (int i=1; i<=num; i++) System.out.print(i+" ");
		System.out.println("\n");
		
		for (int i=1; i<=num; i++) {
			if(num%i==0) { 
				System.out.println("약수: "+i);
				if(i !=1 && i !=num) bo=false;
			}
		}
		System.out.println("\n"+num+"은 소수인가?: "+bo);
		sc.close();
	}
}