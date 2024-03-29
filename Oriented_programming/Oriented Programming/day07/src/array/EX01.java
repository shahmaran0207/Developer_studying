package array;

/*
	변수: 값을 저장하는 공간, 단일 값
	배열: 같은 자료형으로 '메모리상 연속'된 공간. 복수값
 */

public class EX01 {
	public static void main(String[] args) { 
		//변수
		int n=10;
		
		//배열				  0   1   2	(=index, 순서번호)
		int[] arr=new int[] {10, 20, 30};
		
		//※일반 타입 변수는 출력시 저장된 값이 출력되며
		System.out.println("n= "+n);
		
		//※참조타입(배열, 객체)의 변수는 추력시 해시 코드가 출력된다
		//※해시코드는 자바 프로그램에서 객체를 구분하기 위한 값
		System.out.println("arr= "+arr+"\n");
		
		//해시코드를 가진 참조변수와 index의 조합으로 배열의 데이터에 접근 가능
		System.out.println("arr[0]= "+arr[0]);
		System.out.println("arr[0]= "+arr[1]);
		System.out.println("arr[0]= "+arr[2]);
		
//		System.out.println("arr[0]= "+arr[3]);	→ 범위를 초과하는 참조는 에러를 발생시킴
		
	}
}