package switch_;
/*
	java의 switch는 문자열도 사용 가능
	
*/

import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String menu;
		
		System.out.println("-----------------메뉴------------------");
		System.out.println("\t\t1. 짜장면");
		System.out.println("\t\t2. 짬뽕");
		System.out.println("\t\t3. 볶음밥");
		System.out.println("\t\t4. 탕수육");

		System.out.println(">>> ");
		menu=sc.next();
		
		switch(menu) {
		case "짜장면": case "1":
			System.out.println("짜장면 주문이요");
			break;
		case "짬뽕": case "2": 
			System.out.println("짬뽕 주문이요");
			break;
		case "볶음밥":case "3":
			System.out.println("볶음밥 주문이요");
			break;
		case "탕수육":case "4":
			System.out.println("탕수육 주문이요");
			break;
		default:
				System.out.println("없는 메뉴입니다");
		}
		
		sc.close();
	}
}
