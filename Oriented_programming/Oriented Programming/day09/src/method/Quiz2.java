package method;
/*
	1. 60,000개 크기의 정수형 배열을 생성 후 랜덤으로 값을 채운다 → 범위는 1 ~120,000
	
	2. 삽입 정렬 구현해서 소요시간을 출력 - 단, 오름/내림 차순 관계 없이 아무거나
 */

import java.util.Random;

public class Quiz2 {
	static void InputArr(int[] arr) {
		Random ran=new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i]=ran.nextInt(120000);
		}
	}
	
	static void InsertArr(int[] arr) {
		int[] tmp=new int[1];	//자주 사용되는 변수는 바깥에 만들어 두는 것이 더 효율적임
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					tmp[0]=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp[0];
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] =new int[60000];

		InputArr(arr);
		long start=System.currentTimeMillis();
		InsertArr(arr);
		long end=System.currentTimeMillis();
		double time= end-start;
		System.out.println(time/1000.0+"초\n");
	}
}