package control;

/*
if ~ else와 if ~if 차이는?
	1. if ~ else: 조건문을 한번만 검사, 무조건 둘 중 하나만 실행됨
		- if: O, else: X
		- if: X, else: O
		
	2. if ~ if	: 조건문을 두번 검사, 조건에 따라 둘 다 실행될 수 도/ 둘 다 실행되지 않을 수 도 있음
		- if: O, else: O
		- if: O, else: X
		- if: X, else: O
		- if: X, else: X
*/
import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		String adult="";
		int age;
		
		System.out.print("나이 입력: ");
		age=sc.nextInt();
		
		if(age>=19) {
			adult+="성인";
		}
		if(age<19) {
			adult+="미성년자";
		}
		
		System.out.println(adult+" 입니다.");
		
		sc.close();

		//흐름) 
		//이전 → if_1 →if_2 → 다음
	}
}