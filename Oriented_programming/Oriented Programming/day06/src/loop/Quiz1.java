package loop;
/*
	1. 정수를 입력받아서 1 ~ n까지 출력
	2. 정수를 입력받아서 n ~ 1까지 출력
	3. 정수를 입력받아서 1 ~ n까지 누적합 출력
	4. 정수를 입력받아서 1 ~ n까지 누적곱 출력
	5. 0을 입력받을 떄까지 정수를 계속 입력받고, 0을 누르면 이때까지 입력한 정수의 합계, 평균을 출력
	6. 정수를 입력받아서 거꾸로 수를 출력
*/

/*
	나머지 용도
	1. 배수 판별
	2. 숫자의 자리 추출
	3. 숫자 범위 제어
		ex) n%3 → 0 ~ 2
				  5 ~ 97 → n%92 +  5
				  나머지는 0에서 시작하는 것이 기본 → 앞의 숫자를 조정하고 싶다면 n~ m중, n을 0으로 만들도록 빼주고, 그것을 나중에 더해주면 됨 →→→→→ 5 ~ 97 → n%92 +  5
	
 * */
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n, index=1;
		
		//1.
		System.out.print("정수를 입력하세요: ");
		n=sc.nextInt();
		
		while(index<=n) {
			System.out.print(index+" ");
			index++;
		}
		System.out.println();
		System.out.println();
		
		//2. 
		System.out.print("정수를 입력하세요: ");
		n=sc.nextInt();
		
		while(n>=1) {
			System.out.print(n+" ");
			n--;
		}
		System.out.println();
		System.out.println();
		
		//3. 
		index=1;
		int num=0;
		System.out.print("정수를 입력하세요: ");
		n=sc.nextInt();
		
		while(index<=n) {
			num+=index;
			index++;
		}
		System.out.println("누적 합= "+num+"\n");
		System.out.println();
		
		//4. 
		index=1; num=1;
		System.out.print("정수를 입력하세요: ");
		n=sc.nextInt();
		
		while(index<=n) {
			num*=index;
			index++;
		}
		System.out.println("누적 곱= "+num+"\n");
		System.out.println();
		
		//5. 
		int count=0, num2=0;
		index=1; num=1; n=1;
		double avg;
		
		while(n !=0) {
			System.out.print("정수를 입력하세요: ");
			n=sc.nextInt();
			count+=1;
			num2+=n;
		}
		
		avg=(double)(num2)/(count-1);
		
		System.out.println("\n누적 합: "+num2);
		System.out.printf("평균은 %.1f입니다. \n", avg);
		System.out.println();
		
		//6. 
		String num3, result="";
		char ch;
		System.out.print("정수를 입력하세요: ");
		num3=sc.next();
		
		n=num3.length();
		
		index=n;
		while(n>0) {
			ch=num3.toString().charAt(index-1);
			result+=ch;
			index--;
			n--;
		}
		System.out.println("출력: "+result);
		
		//다른 풀이
		int rev=0;
		System.out.print("정수 입력: ");
		n=sc.nextInt();
		while(n != 0) {
			rev=rev*10+n%10;
			System.out.print(n%10);
			n/=10;
		}
		
		System.out.println();
		System.out.println("rev= "+rev);
		System.out.println("rev*2= "+rev*2);
		
		
		sc.close();
	}
}