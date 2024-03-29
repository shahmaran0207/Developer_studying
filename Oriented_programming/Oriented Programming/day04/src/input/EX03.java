package input;

import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {
		//문자열 처리를 지원하는 String 클래스는 char의 배열로 이루어짐
		//			 01234(=Index, 순서번호)
		String word="Hello";
		System.out.println("word = "+word);
		System.out.println("word[0]= "+word.charAt(0));
		System.out.println("word[4]= "+word.charAt(4));
		
//		System.out.println("word[5= "+word.charAt(5)); → 인덱스의 범위를 초과한 값을 요구하니 당연히 에러가 발생하게 됨
		
		Scanner sc=new Scanner(System.in);
		char ch;
		
		System.out.print("\n문자 하나 입력: ");
		ch=sc.next().charAt(0);
		//ex) Apple입력 시
		// 1. sc.next() → "Apple"
		// 2. chatAt(0) → 'A'
		
		System.out.println("ch= "+ch);
		
		sc.close();
	}
}