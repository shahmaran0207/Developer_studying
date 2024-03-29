package control;

import java.util.Scanner;

/*
	else if는 사실 else안의 if문이다.
	
*/

public class EX06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String adult="";
		int age;
		
		System.out.print("나이 입력: ");
		age=sc.nextInt();
		
		if(age>=19) {
			adult="성인";
		}
		else {
			if(age>=16) {
				adult="중학생";
			}
			else {
				if(age>=13) {
					adult="초등학생 이하";
				}
			}
		}
		System.out.println(adult+" 입니다.");
		
		sc.close();
	}
}