package variable;

//변수
	// - 데이터를 저장하는 공간
	// - 저장한 데이터는 몇번이든 재사용 가능
	// - 다른 값을 저장시 새 값으로 덮어쓴다.

public class EX04 {
	public static void main(String[] args) {
		 int n=10;	//변수 선언 시 어떤 타입인지 자료형 명시가 필요
		 System.out.println("n= "+n);
		 
		 n=20;		//이미 만들어진 변수를 사용시 자료형은 작성하지 않음 --> 만약 작성 시 이름이 동일한 변수를 생성하는 것과 같아 에러가 발생하게 된다.
		 			// 여기서 n=20은 n을 그냥 20으로 덮어버리는 것
		 
		 System.out.println("n= "+n); 
	}
}
