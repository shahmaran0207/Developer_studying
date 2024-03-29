package loop;

import java.util.Scanner;

/*
	연습
	1. 2단
	2. 입력한 구구단이 출력되게 변경
	3. 아래 반복을 하나 더 작성해서 역순으로 출력되게 함
*/

public class EX02 {
	public static void main(String[] args) {
		int i=1, num;
		String mul="%d X %d= %d\n";
		
		while(i<10) {
			System.out.printf(mul,2, i, 2*i);
			i++;
		}
		
		System.out.println();
		
		//입력한 구구단		
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 입력: ");
		
		num=sc.nextInt();
		
		System.out.printf("%d단\n", num);
		
		i=1;
		while(i<10) {
			System.out.printf(mul, num, i, num*i);
			i++;
		}
		System.out.println();
	
		//구구단 역순
		System.out.println("역순");
		
		i=9;
		while(i>0) {
			System.out.printf(mul, num, i, num*i);
			i--;
		}
		
		sc.close();
	}
}
