package wrapper;

public class EX03 {
	public static void main(String[] args) {
//		String은 wrapper는 아니지만 비슷한 구조
//		
//		class String{
//			char[] word=new char[n];
//		
//		그외 메서드
//		}
		String str1="apple";
		String str2="apple";
		String str3=new String("apple");
		
		System.out.println("str1= "+str1);
		System.out.println("str2= "+str2);
		System.out.println("str3= "+str3+"\n");
		
//		※상수 무낮열은 같은 대상이 참조됨
//		- 인스턴스(new)로 만들어진 무낮열은 별도의 공간에 생성됨
		System.out.println("str1 == str2의 결과: "+(str1==str2));
		System.out.println("str1 == str3의 결과: "+(str1==str3)+"\n");
		
//		String은 이미 내부 문자열이 같면 참을 반환하게 equals()를 오버라이딩이 되어 있음
		System.out.println("str1.equals(str2)결과: "+str1.equals(str2));
		System.out.println("str1.equals(str3)결과: "+str1.equals(str3));
		
//		※문자열은 사전순으로 앞에 있는 문자가 작은 문자열
//		application VS banana  →  a로 시작하는 문자열이 작은 문자열
//		글자를 비교할때는 앞에서부터 하나씩 비교하게 됨
		
//		결과
//		-1	: 앞의 문자열이 크다
//		1	: 뒤의 문자열이 크다
//		0	: 같다 
		System.out.println("\n결과1: "+"application".compareTo("banana"));
		System.out.println("결과1: "+"banaba".compareTo("application"));
		System.out.println("결과1: "+"banaba".compareTo("banana"));
		
		
	}
}