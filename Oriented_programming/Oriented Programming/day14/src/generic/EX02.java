package generic;

public class EX02 {
//	1. 일단 전달 인자를 Object로 받는다.
//	2. 호출 시 전달된 인자의 자료형을 T에 저장
//	3. 종속문 실행시 T에 저장한 타입으로 다운캐스팅 수행
	static <T> void printArr(T[] arr) {			//T에서 자식 클래스를 기억했다가 업캐스팅으로 받았다가 내부 실행시 강제로 다운캐스팅 시킴
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] arr1=new Integer[] {10, 20, 30, 40, 50};
		Double[] arr2=new Double[] {3.14, 5.1};
		String[] arr3=new String[] {"java", "C++"};
		
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
	}
}