package wrapper;
//※클래스 명으로 바로 쓰고, 기울임체  → static

public class EX02 {
	public static void main(String[] args) {
		//Wrapper는 문자열과 형변환시 사용되기도 함
		String str1="10";
		String str2="20";
		
		System.out.println(str1+str2);
		
//		int n1=(int)str1;
		
		//문자열 → 정수
		int n1=Integer.parseInt(str1);
		int n2=Integer.parseInt(str2);
		System.out.println("n1+n2= "+(n1+n2));
		
		//정수  → 문자열
		String str3=Integer.toString(157);
		String str4=Integer.toString(234);
		System.out.println("str3= "+str3);
		System.out.println("str4= "+str4);
		System.out.println(str3+str4);
		
		String str5=""+10+5;
		String str6=10+5+"";
		System.out.println("\nstr5= "+str5);
		System.out.println("str6= "+str6);
	}
}