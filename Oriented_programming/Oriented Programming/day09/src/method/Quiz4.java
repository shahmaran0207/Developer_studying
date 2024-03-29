package method;

import java.util.Scanner;

//2**n-1
public class Quiz4 {
	static void hanoi(int n, char src, char sub, char dst) {
		if(n==1) {
			System.out.printf("원판 %d %c --> %c\n", n, src, dst);
			return;
		}
		hanoi(n-1, src, dst, sub);
		System.out.printf("원판 %d %c --> %c\n", n, src, dst);
		hanoi(n-1, sub, src, dst);
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("원판개수 입력: ");
		n=sc.nextInt();
		
		hanoi(n, 'A', 'B', 'C');
		
		sc.close();
	}
}
