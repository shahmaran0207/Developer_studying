package method;

public class EX03 {
	//매개변수 작성은 콤마로 구분해서 작성 가능
	static void test(int n1, int n2) {
		System.out.printf("n1 =%d, n2= %d\n", n1, n2);
		System.out.printf("%d + %d= %d\n", n1, n2, n1+n2);
		//※메서드를 만들고 사용하려면 반드시 실행을 해줘야 함
		System.out.println();
	}
	
	public static void main(String[] args) {
		test(5,4);
		test(4,5);
		
//		타입이나 개수를 맞추지 않으면 에러발생!
//		test(4, 5.0);	//타입 불일치
//		test(4);		//개수 불일치 - 개수가 적어도 안됨
//		test(4,5,6);	//개수 불일치 - 개수가 많아도 안됨 - 이건 언어마다 다름( c언어에서는 가능함)
	}
}