package switch_;

import java.util.Scanner;

/*
 	control.Quiz2의 문제를 switch로 해결
 */

public class Quiz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kor, eng, mat, result;
		char grade;
		
		System.out.print("세 과목의 점수를 입력하세요: ");
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		
		result=(kor+eng+mat)/30;
		System.out.println("result= "+result);
		
		switch (result) {
		case 9: case 10:
			grade='A';
			break;
		case 8: 
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6: 
			grade='D';
			break;
		default:
			grade='F';
		}
		
		System.out.printf("성적은 %c입니다.\n", grade);
		sc.close();
	}
}
