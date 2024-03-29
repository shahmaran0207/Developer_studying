package method;
/*
 	1. 전달한 두 정수를 비교 후 큰수를 반환 단, 같으면 아무거나
 	
 	2. 전달한 실수(=반지름)의 원 넓이를 반환 단, pi=3.14
 	
 	3. 전달한 정수의 절대값을 반환
 	
 	4. 전달한 정수의 1~n까지의 합계를 반환
 	
 	5. 전달한 정수가 소수인지 반환

 	6. 5번의 메서드를 활용해서 1~100사이의 소수를 모두 출력
 */

public class Quiz1 {
	static int compare(int n1, int n2) {
		int max=0;
		if(n1>=n2) max=n1;
		else max=n2;
		return max;
	}
	
	static double circle(double n1) {
		double cir=0;
		double pi=3.14;
		cir=((n1*n1)*pi);	
		//※return 값은 오직 하나만 가능함 		ex)return n1, n2; → 이런거 안됨!
		//※ 수식을 작성해도 됨  → ex) return 3.14*r*r;  →  이런 경우 연산 후 리턴됨
		return cir;
	}
	
	static int absolute(int n1) {
		int abs=(n1>=0)?n1:-n1;
		return abs;
	}
	
	static int total(int n1) {
		int t=0;
		
		for(int i=1; i<=n1; i++) {
			t+=i;
		}
		return t;
	}
	
	static boolean isPrime(int n1) {
		boolean bo=false;
		int count=0;
		
		for(int i=1; i<=n1; i++) {
			if(n1%i==0) count+=1;
		}
		if (count==2) bo=true;
		
		return bo;
	}
	
	public static void main(String[] args) {
		//1. 1번)
		int n=compare(5,3);	
		System.out.printf("%d와 %d중 더 큰 수는 %d이다.\n\n", 5, 3, n);
		
		//2. 2번
		double cir=circle(3.5);
		System.out.printf("원의 반지름은 %.1f이다.\n\n",cir);
		
		//3. 3번
		int abs=absolute(-5);
		System.out.printf("절대값은 %d이다.\n\n",abs);
		
		//4. 
		int sum=total(10);
		System.out.printf("1 ~ n까지의 합계는 %d이다.\n\n",sum);
		
		//5.
		boolean prime=isPrime(997);
		System.out.println("해당 숫자는 소수인가?: "+prime+"\n\n");
		
		//6. 
		int count=0;
		for(int i=1; i<=1000; i++) {
			if(isPrime(i)) {
				System.out.printf("%3d ",i);
				count++;
				if(count%10==0) System.out.println();
			}
		}
	}
}