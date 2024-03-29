package method;
/*
  	버블정렬: 인접한 두 개를 비교함 → 계속해서 정렬하다가 한번도 안바뀌면 그때 반복을 종료함
  	i: 0~ 마지막 전
  	오름차순: 인접한 요소끼리 비교
  	※3대 정렬 중 가장 무식한 방법
 */

import java.util.Arrays;

public class EX02 {
	static void bubbleSort(int[] arr) {
		while(true) {
			int count=0;
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					int tmp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tmp;
					count++;	//데이터 교체가 발생 시 카운팅
				}
				if(count==0) return;	//return: 함수를 종료하는 효과, void형도 return을 쓸 수는 있음, 값만 집어넣지 않으면 됨
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {44,25,21,36,27};
		System.out.println("arr= "+Arrays.toString(arr));

		bubbleSort(arr);
		System.out.println("arr= "+Arrays.toString(arr));
	}
}