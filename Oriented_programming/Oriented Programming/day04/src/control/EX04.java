package control;
/*
보조 조건문 else if
	- 다중 조건을 처리하기 위한 구문
	- 보조이므로 단독으로 사용은 불가!
	- 위의 조건이 거짓이면 조건을 검사
	- 참이면 종속문을 수행
	- 흐름을 건너뛰면 안됨
	- 개수 제한 없음
*/

import java.util.Scanner;

public class EX04 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age;
		String adult="";
		
		System.out.print("나이 입력: ");
		age=sc.nextInt();
	
		if (age>=19) {
			adult+="성인";
		}
		else if(age>=16) {
			adult+="고등학생";
		} else if(age>=13) {
			adult+="중학생";
		}
		else {
			adult+="초등학생 이하";
		}
		System.out.println(adult+" 입니다.\n");
		sc.close();
		
	}
}
