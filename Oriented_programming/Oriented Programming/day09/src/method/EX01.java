package method;
/*
  	정렬: 데이터를 순서대로 정리하는 알고리즘
  	- 정렬 후 데이터 가독성 및 검색(=탐색)속도 향상
  	
  	3대 정렬: 실무에선 사용되지 않고 주로 알고리즘 학습용으로 사용
  	1. 선택 정렬(select sort)
  	2. 삽입 정렬(insert sort)
  	3. 버블 정렬(bubble sort)
  	
  	i: 1~마지막
  	j: 0~i 전까지
 */

import java.util.Arrays;

public class EX01 {
	static void InsertSort(int[] arr) {	//삽입정렬: 3대 정렬 중 그나마 빠름
		int tmp[]=new int[1];
		
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[i]) {
					tmp[0]=arr[j];
					arr[j]=arr[i];
					arr[i]=tmp[0];
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {44,25,21,36,27};
		System.out.println("arr= "+Arrays.toString(arr));

		InsertSort(arr);
		System.out.println("arr= "+Arrays.toString(arr));
	}
}