package input;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //스캐너는 입력도구가 아닌, 입력된 값을 읽어오는 도구!
		
		String name;
		System.out.print("이름 입력: ");
		name=sc.next();
		System.out.println("당신의 이름은 "+name+"입니다.");
		
		sc.close();
	}
}