package operator;

public class EX06 {
	public static void main(String[] args) {
		//비교 연산자: 데이터의 대소관계를 비교하는 연산자
		// - 비교의 결과는 boolean 타입(true/false)
		
		//※ 전치 > 산술 > 비교 > 대입 > 후치
		int n=10;
		
		System.out.println("n > 10결과: "+ (n > 10));
		System.out.println("n >= 10결과 : "+(n>=10));
		System.out.println("n< 20결과: "+(n<20));
		System.out.println("n<=20결과: "+(n<=20));
		System.out.println("n==10의 결과: "+(n==10));
		System.out.println("n != 10의 결과: "+(n !=10));
		
		//true / false는 boolean 타입에 저장 가능
		boolean result= n ==11;
//		boolean result= false;
		
		System.out.println("\nresult = "+result);
	}
}
