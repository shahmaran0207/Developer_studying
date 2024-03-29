package input;
/*
 	1. 이름, 나이, 주소를 저장받을 변수를 선언
 	2. 1번의 변수에 데이터를 입력받음 - 단, 주소를 가장 마지막에 입력받을 것
 	3. 결과는 아래와 같이 출력
 	
 	결과)
 	이름: 김민수 (33세)
 	주소: 부산 광역시 동래구
 */

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		String name, address;
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		name=sc.next();
		
		System.out.print("나이를 입력하세요: ");
		age=sc.nextInt();
		
		sc.nextLine(); 
		//next(): 구분자를 데이터로 인식하지 않음 → 버퍼에 엔터가 누적되어 있음
		//nextLine(): 구분자를 데이터로 인식함 → 버퍼에 누적된 데이터를 가져오게 됨 → 버퍼의 데이터가 밀려나게 되는 것! →sc.nextLine()으로 초기화하지 않으면 문제 발생!
		
		System.out.print("주소를 입력하세요: ");
		address=sc.nextLine();
		System.out.println();
		
		System.out.printf("이름: %s (%d세)\n", name, age);
		System.out.printf("주소: %s\n", address);
		sc.close();
	}
}