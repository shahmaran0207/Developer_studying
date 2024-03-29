package method;
/*
	1. 정수를 하나 입력받는다.
	2. 입력 받은 정수만큼의 개수를 가지는 정수형 배열을 생성한다.
	3. 2번에서 생성한 배열에 랜덤으로 정수를 채운다.(1 ~ 100)
	4. 선택정렬로 오름차순 정렬 후 출력
	5. 삽입 정렬로 내림차순 정렬 후 출력
	6. 버블 정렬로 오름 차순 정렬 후 출력
 */

import java.util.*;	//*: wildcard → 만능 문자 →→→→ java.util.*하면 util 아래 모든 기능을 다 가져오게 됨 →→→단, 효율이 떨어지니 하나씩 가져오는 것이 더 좋긴함

public class Quiz1 {
	static void inputArr(int[] arr) {
		int ran2;
		for(int i=0; i<arr.length; i++) {
			double ran=Math.random()*100;
			ran2=(int)ran;
			arr[i]=ran2;
		}
	}
	
	static void selectSort(int[] arr) {
		int[] tmp=new int[1];
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[j]<arr[i]) {
					tmp[0]=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp[0];
				}
			}
		}
	}
	
	static void InsertSort(int[] arr) {
		int tmp[]=new int[1];
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i]>arr[j]) {
					tmp[0]=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp[0];
				}
			}
		}
	}
	
	static void bubbleSort(int[] arr) {
		int[] tmp=new int[1];
		while (true) {
			int count=0;
			
			for(int i=0; i<arr.length-1; i++) {
				
				for(int j=i; j<arr.length; j++) {
					
					if(arr[i]>arr[j]) {
						tmp[0]=arr[i];
						arr[i]=arr[j];
						arr[j]=tmp[0];
					}
				}
			}
			if(count==0) break;
		}
	}
	
	public static void main(String[] args) {
		//필요 변수 생성
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하세요: ");
		n=sc.nextInt();

		int[] arr=new int[n];
		
		inputArr(arr);
		System.out.println("arr= "+Arrays.toString(arr));
		
		selectSort(arr);
		System.out.println("select arr= "+Arrays.toString(arr));
		System.out.println();
		
		InsertSort(arr);
		System.out.println("insert arr= "+Arrays.toString(arr));
		System.out.println();
		
		bubbleSort(arr);
		System.out.println("bubble arr= "+Arrays.toString(arr));
		System.out.println();
		
		sc.close();
	}
}