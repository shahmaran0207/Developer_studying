package method;

import java.util.Random;

/*
	※main의 배열을 활용해서 아래 문제를 풀어주세요
	1. 배열에 1~ 50중 랜덤으로 채운다.
	2. 배열을 일렬로 출력하는 메서드를 작성한다.
*/

public class Quiz3 {
	static void inputArr(int[] arr) {
		Random ran=new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i]=ran.nextInt(50)+1;
		}	
	}
	
	static String printArr(int[] arr) {
		String str="[ ";
		int i;
		for(i=0; i<arr.length-1; i++) {
			str+= arr[i]+", ";
		}
		str+=arr[i]+" ]";
		return str;
	}

	static void selectSort(int[] arr) {
		int tmp[]= new int[1]; 
		
		for(int i=0; i<arr.length-1; i++) {
		
			for(int j=i+1; j<arr.length; j++) {
			
				if(arr[i]>arr[j]) {
					tmp[0]=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp[0];
				}
			}
//			System.out.println("디버깅: "+ printArr(arr));
		}
	}
	
	public static void main(String[] args) {
		int[] arr=new int[5];

		inputArr(arr);
		System.out.println("arr= "+printArr(arr));

		//선택 정렬
		selectSort(arr);
		System.out.println("arr= "+printArr(arr));
	}
}