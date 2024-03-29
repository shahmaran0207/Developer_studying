package array;

import java.util.Arrays;

public class EX02 {
	public static void main(String[] args) {
		int[] arr=new int[] {10, 20, 30, 40, 50};
		
		//java의 배열은 내부에 크기 값(=개수)를 가진다.
		System.out.println("arr의 크기: "+arr.length);
		
		//1. 일반 for문: index로 반복
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]= %d\n", i, arr[i]);
		}
		System.out.println();
		
		//2. for - each문: 요소를 하나씩 변수에 대입하여 반복
		for(int n: arr) {				//index가 없는 경우 사용
			System.out.println("n= "+n);
		}
		System.out.println();
		
		//3. 배열과 사용하면 유용한 클래스. Arrays
		//String toString(배열): 배열을 전달하면 배열의 모든 요소를 문자열로 반환
		
		System.out.println("arr= "+Arrays.toString(arr));
	}
}