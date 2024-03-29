package static_;

public class EX04 {
	public static void main(String[] args) {
		//대표적인 static만 가지는 클래스 Math(자동 import되므로 굳이 import할 필요 없음)
		//- Math의 경우 생성자를 만들 수 없음!!! → static으로만 사용가능하게 만들어짐
		//자동완성시 ()가 있으면 메서드, 없으면 필드
		
		System.out.println("원주율: "+Math.PI);
		System.out.println("자연상수: "+Math.E);
		
		int n=Math.abs(-5);
		
		System.out.println("n= "+n);
		System.out.println("절대값: "+Math.abs(5));
		
		double m=Math.pow(2,10);
		
		System.out.println("m= "+m);
		System.out.println("3^3= "+Math.pow(3, 3));
		System.out.println();
		
		double pi=Math.PI;
		double result=Math.round(pi*100)/100.0;
		
		System.out.println("result= "+result);
		
		double root=Math.sqrt(2);
		System.out.println("root= "+root);
		
		System.out.println("√4= "+Math.sqrt(4));
		System.out.println(Math.toDegrees(pi));
		
		System.out.println("sin 90= "+Math.sin(pi/2));
		System.out.println("cos 0= "+Math.cos(0));
	}
}