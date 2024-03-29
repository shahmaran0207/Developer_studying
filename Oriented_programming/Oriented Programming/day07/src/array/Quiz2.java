package array;
/*
 	1. 정수를 입력받아서 N X N 배열을 생성
 	2. 1번 배열에 아래와 같이 채우넣는다.
 	입력: 5
 		1	2	3	4	5
 		6	7	8	9	10	
 		11	12	13	14	15
 		16	17	18	19	20
 		21	22	23	24	25
 	
 	3. N X N 배열을 하나 더 만들어 채워 넣는다
 	입력: 5
 	1	6	11	16	21	
 	2	7	12	17	22
 	3	8	13	18	23	
 	4	9	14	19	24
 	5	10 	15	20	25
 */

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num, count=1;
		
		System.out.print("정수 입력: ");
		num=sc.nextInt();
		
		int[][] arr=new int[num][num];

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j]=count++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.print("2번째 정수 입력: ");
		num=sc.nextInt();
		
		count=1;
		int[][] arr2=new int[num][num];
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				arr2[j][i]=count++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}