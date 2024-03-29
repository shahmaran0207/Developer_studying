package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
	정수를 입력 받아서 출력하는 프로그램

	단, 정수가 아닌 데이터가 입력되면 다시 입력받을 수 있게 구성

	※buffer가 뭔데?
 */

public class Quiz1 {
	public static void main(String[] args) throws PositiveException {
		Scanner sc=new Scanner(System.in);

		int n;

		while(true) {

			try {
				System.out.print("정수 입력: ");
				n=sc.nextInt();
				System.out.println("n= "+n);
				break;

			} catch(InputMismatchException e) {
				sc.nextLine();	//이걸 안써주면  10.0의 경우 버퍼가 비지 않으니 10.0을 계속 가져와서 밑에 코드가 무한반복으로 발생하게 됨 → 이 코드를 작성해서 버퍼를 비워줘야 함
				System.out.println();
				System.err.println("정수가 아닙니다. 다시 입력해주세요");
			}
			
		}	
		sc.close();
	}
}