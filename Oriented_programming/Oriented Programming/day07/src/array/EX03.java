package array;

import java.util.Arrays;

public class EX03 {
	public static void main(String[] args) {
		//배열 초기화 방법
		//1. 배열을 생선하며 요소를 작성
		int[] arr1= {10, 50, 30, 60, 70};
		
		//2. 공간만 미리 생성
		int[] arr2=new int[3];
		
//		※크기와 요소를 같이 쓰면 에러 개수가 같아도/달라도 무조건 에러 발생함
//		int[] arr3=new int[3] {10, 30, 40};
		
		System.out.println("arr1의 크기: "+arr1.length);
		System.out.println("arr2의 크기: "+arr2.length);
		
		
//		※일반적으로 변수는 초기화하지 않으면 아무런 값이 없어 출력이나 연산 불가능
//		단, 배열은 초기화하지 않으면 기본값으로 자동 초기화 되는 특징을 가지고 있다.
		System.out.println("arr1= "+Arrays.toString(arr1));
		System.out.println("arr2= "+Arrays.toString(arr2));
		
		arr2[1]=100;	//요소는 나중에 다시 저장 받아서 사용 가능
		System.out.println("arr2= "+Arrays.toString(arr2));
	}
}