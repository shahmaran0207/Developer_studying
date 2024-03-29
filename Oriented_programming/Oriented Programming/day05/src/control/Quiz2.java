package control;

import java.util.Scanner;

/*
	점수 등급)
	학생의 3과목 성적을 입력받는다
	성적의 합계와 평균을 출력하고 평균에 따른 등급을 출력하라
	
	등급표)
	100 ~ 90	: A
	89 ~ 80		: B
	79 ~ 70		: C
	69 ~ 60		: D
	59 ~ 0		: E
	
	2. 엘리베이터 호출
	현재 건물에 엘리베이터 3대가 있다
	각 엘리베이터는 A: 5,B: 7, C: 9층에 머물러 있다
	이떄, 현재 층을 입력받아서 가장 가까운 엘리베이터를 초루한다
	만약, 동일한 층 수 차이면 앞의 엘리베이터를 호출한다
*/

public class Quiz2 {
	public static void main(String[] args) {
		//1. 
		Scanner sc=new Scanner(System.in);
		int kor, eng, mat, result;
		char grade='F';
		
		//점수 입력
		System.out.print("세 과목의 점수를 입력하세요: ");
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
		
		result=(kor+eng+mat)/3;
		
		if(result>=90) grade='A';		
		else if(result>=80)	grade='B';
		else if(result>=70) grade='C';
		else if(result>=60) grade='D';

		System.out.printf("성적은 %c입니다.\n\n", grade);
		
		//2. 
		int A=5, B=7, C=9;
		int cur;
		char call='C';
		
		System.out.print("현재 층 수를 입력하세요: ");
		cur=sc.nextInt();
		
		//거리 차 구하기 + 절대값 처리
		int A1=(A-cur<0)?-(A-cur):(A-cur);
		int B1=(B-cur<0)?-(B-cur):(B-cur);
		int C1=(C-cur<0)?-(C-cur):(C-cur);

		if (A1<=B1 && A<=C1) call='A';
		else if (B1<A1 && B1<=C1) call='B';
		else if (C1<A1 && C1<B1) call='C';
		
		System.out.println(C1);
		System.out.printf("%c 엘리베이터를 호출합니다.", call);
		
		sc.close();
	}
}