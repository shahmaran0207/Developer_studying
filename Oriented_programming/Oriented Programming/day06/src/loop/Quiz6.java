package loop;

import java.util.Scanner;

/*
 	1. N X N별 찍기
 	입력: 5
 	*****
 	*****
 	*****
 	*****
 	*****
 	
 	2. 직각 삼각형
 	입력: 5
 	*
 	**
 	***
 	****
 	*****
 	
 	3. 2번을 위 아래 반전
 	*****
 	****
 	***
 	**
 	*

 	4. 2번을 좌/우 반전
 	    *
 	   **
 	  ***
 	 ****
 	*****
 
  5. 4번을 위 아래 반전
  *****
   ****
    ***
     **
     *
     *
     
     6. 피라미드
     입력: 5
         *
        ***
       *****
      *******
     *********
 */
public class Quiz6 {
	public static void main(String[] args) {

		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		n=sc.nextInt();

		//1.
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");

		//2.
		System.out.println("2번");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");

		//3.
		System.out.println("3번");
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");

		//4.
		System.out.println("4번");	//처음부터 변수로 푸는게 까다로우면 숫자 넣어놓고 나중에 변수 넣는것도 낫밷
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		//5.
		System.out.println("5번");

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" "); // 현재 행 번호에 따라 공백을 출력합니다.
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*"); // 현재 행 번호에 따라 별표를 출력합니다.
			}
			System.out.println(); // 각 행이 완료되면 다음 줄로 이동합니다.
		}
		System.out.println("\n");

		//6.
		System.out.println("6번");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");

		//7.
		System.out.println("7번");

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" "); // 현재 행 번호에 따라 공백을 출력합니다.
			}
			for (int k = 1; k <= i*2-1; k++) {
				System.out.print("*"); // 현재 행 번호에 따라 별표를 출력합니다.
			}
			System.out.println(); // 각 행이 완료되면 다음 줄로 이동합니다.
		}
		System.out.println("\n");


		sc.close();
	}
}