package input;

import java.util.Scanner;

/*
 	next(): space와 enter를 구분자로 인식. 구분자는 데이터로 인식하지 않음  → 띄어쓰기를 포함한 입력값을 입력받을 수 없게 됨
 	nextLine(): enter만 구분자로 인식. 구분자도 데이터로 인식  → 띄어쓰기를 포함한 입력값을 입력받을 수 있음
 	
 	즉, nextLien()은 버퍼를 비우는 용도나
 	space를 문자열로 인식해서 띄어쓰기 포함한 데이터를 읽을 때 사용
*/

public class EX05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String address;
		
		System.out.print("주소를 입력하세요: ");
//		address=sc.next();
		address=sc.nextLine();
		
		System.out.println("주소: "+address);
		
		sc.nextLine();
		sc.close();
	}
}
