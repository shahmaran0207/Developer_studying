package variable;

public class EX09 {
	public static void main(String[] args) {
		//변수 선언 방법
		//1. 선언 후 바로 초기화
		int n1=10;
		
		//2. 선언만
		int n2;
		
		//3. 같은 타입 한번에 생성
		String name, address;
		
		//※선언만 한 변수는 나중에 데이터를 채울 수 있다.
		System.out.println("n1= "+n1);
//		System.out.println("n2= "+n2);
//		System.out.println("name= "+name);
//		System.out.println("address= "+address);
		//n2, name, address의 경우 값이 초기화 되지 않은 것을 출력하려 하기 때문에 에러가 발생함
		
		n2=20;
		name="홍길동";
		address="서울 특별시 종로구";
		System.out.println("n2= "+n2);
		System.out.println("name= "+name);
		System.out.println("address= "+address);
	}
}
