package operator;

public class EX05 {
	public static void main(String[] args) {
		//증감 연산자: 피연산자의 값을 1증가 or 1감소
		int n=10;
		
		++n; //++가 하나의 연산자 → 연산자가 하나 → 연산자가 두 개인 복합대입연산자보다 효율성이 좋음(효과 자체는 동일함)
		System.out.println("n= "+n);
	
		--n; //전치: 연산자가 앞에 붙은 경우
		System.out.println("n= "+n);
		
		n++; //후치: 연산자가 뒤에 붙은 경우
		System.out.println("n ="+ n);
		
		n--;
		System.out.println("n= "+n+ "\n");
		
		//기본적으로 전치/후치는 차이가 없지만
		//다른 연산과 같이 사용시 우선순위가 달라짐
		int n1=10, n2, n3;
		
		n2=++n1; //전치(소괄호 제외 거의 제일 우선순위): 증감 후 다른 연산을 수행
		System.out.printf("n1= %d, n2= %d \n", n1, n2);
		
		n1=10;
		
		n3=n1++; //후치(연산자 우선순위: 가장 아래): 다른 연산 후 증감을 수행
		System.out.printf("n1= %d, n3= %d\n\n", n1, n3);
		
		//연습) "전치>산출>대입>후치"
		int a=7, b=3, c=6, d;
		
		d=++a	+ b--	+ c++;
	  //d=	7	+	3	+	6
	  //d=  8	+	3	+	6
	 //				2		7
		
		System.out.println("a= "+a);	//8
		System.out.println("b= "+b);	//2
		System.out.println("c= "+c);	//7
		System.out.println("d= "+d);	//17
	}
}
