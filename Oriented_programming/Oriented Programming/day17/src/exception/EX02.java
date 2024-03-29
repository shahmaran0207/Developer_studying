package exception;
/*
	다중 예외 처리
	- catch는 여러개 작성이 가능하고 다양한 예외를 처리할 수 있다.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		try {
			int[] arr=new int[] {10, 20, 30, 40, 50};
			
			System.out.print("정수 입력: ");
			n=sc.nextInt();
			
			System.out.println("n= "+n);
			System.out.printf("arr[%d]= %d\n", n, arr[n]);
			System.out.println(10/0);
			
		} catch(InputMismatchException e) {
			System.err.println("정수가 아님");
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage()+"번 index는 없습니다.");
		} catch (Exception  e) { //exception은 최상위 예외 처리이므로 가장 마지막에 써야함 , 그렇지 않을 경우 아래 예외 처리의 경우 실행이 안되므로 오류가 발생하게 됨
			e.printStackTrace();
			return;
		} finally {
			//finally: 예외 발생 여부에 관계없이 '무조건'실행되는 구문
			//- 주로 사용된 자원 해제 코드가 작성된다. ex) 데이터베이스 연결 해제 코드
			//- 필수구문이 아니라 보조옵션임!
		}
		sc.close();
	}
}