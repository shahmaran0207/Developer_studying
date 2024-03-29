package input;

import java.util.Scanner;

/*
  1. 이름, 나이, 신장, 성별 정보를 저장할 변수를 선언 - 단, 성별은 cahr로 
  2. 1번의 변수에  Scanner 를 활용해서 입력받는다
  3. 아래와 같이 출력
  	결과) 
  	이름: 홍길동 (남, 30세)
  	신장: 170.5cm
 */

public class Quiz1 {
	public static void main(String[] args) {
		String name;
		int age;
		Float height;
		char gender;
		String result="이름: %s (%c, %d세)\n";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		name=sc.next();
		
		System.out.print("나이를 입력하세요: ");
		age=sc.nextInt();
		
		System.out.print("키를 입력하세요: ");
		height=sc.nextFloat();
		
		System.out.print("성별을 입력하세요: ");
		gender=sc.next().charAt(0);
		System.out.println();
		
		System.out.printf(result, name, gender, age);
		System.out.printf("신장: %.1fcm\n", height);
		
		sc.close();
	}
}