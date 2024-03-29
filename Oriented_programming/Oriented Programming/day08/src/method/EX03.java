package method;
/*
	참조 변수는 복사시 실제 공간이 아닌
	가리키는 방향이 복사된다. (= call by reference)
 */

import java.util.Arrays;

public class EX03 {
	public static void main(String[] args) {
		int[] arr1=new int[] {10, 50, 40}; // 실제 배열 하나를 만듦 → arr1을 통해 만들 배열을 가리킴
		int[] arr2=arr1;				  //  arr2를 통해 arr1이 가리키는 배열을 같이 가리킴
		
		System.out.println("arr1= "+Arrays.toString(arr1));
		System.out.println("arr2= "+Arrays.toString(arr2));
		
		arr2[1]=500;											//참조: arr1과 arr2모두 같은 것을 참조 함 → arr2만 바꿔도 arr1도 바뀌는 것
		System.out.println("arr1= "+Arrays.toString(arr1)); 
		System.out.println("arr2= "+Arrays.toString(arr2));
	}
}