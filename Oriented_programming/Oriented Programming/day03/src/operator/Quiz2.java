package operator;
/*
 	1. 정수 n1이 짝수인지 판별하는 코드 작성
 	2. 정수 a,b 중에서 큰 수를 출력
 	3. 정수 n2가 3과 5의 공배수인지 판별하는 코드를 작성
 	4. 정수 n3의 절대값을 출력
 * */

public class Quiz2 {
	public static void main(String[] args) {
		int n1=10;
		String positive=(n1%2==0)?"짝수":"홀수";
		System.out.printf("%d은 %s이다.\n",n1, positive);
		System.out.println();
		
		int a=10, b=20;
		int larger=(a>=b)?a:b; //int larger=(a>b)?a:b; →여기서 a와 b가 같을 경우 거짓이 되므로 b가 선택됨 
		System.out.printf("%d와 %d중 더 큰 수는 %d이다\n", a, b, larger);
		System.out.println();

		int n2=15;
		boolean common=(n2%3==0 && n2%5==0)?true:false;
		System.out.println("n2는 3과 5의 공배수인가? : "+ common);

		String multi="공배수 ";
		boolean result=(n2%3==0 && n2%5==0);
		multi+=(result)?"맞다":"아니다";
		System.out.printf("%d는 3과 5의 %s\n", n2, multi);
		System.out.println();
		
		int n3=-9;
		int mul=(n3>=0)?1:-1;
		System.out.println("절댓값= "+(n3*mul));
		
		n3=-9;
		n3=(n3<0)?-n3:n3;
		System.out.println("절댓값= "+n3);
		
	}
}