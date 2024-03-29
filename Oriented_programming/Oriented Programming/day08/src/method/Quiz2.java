package method;

/*
 	※main의 배열을 활용해서 아래 문제를 풀어주세요
 	1. 배열에 10, 20, 30, 40, 50까지 순서대로 채운다.
 	2. 배열을 일렬로 출력하는 메서드를 작성한다.
 	3. 배열의 합계를 반환하는 메서드를 작성한다.
 */

public class Quiz2 {
	static void inputArr(int[] arr) {
//		int n=10;
		for(int i=1; i<=arr.length; i++) {
			arr[i-1]=i*10;
//			arr[i]=n;
//			i+=10;
		}
	}
	
	static void printArr(int[] arr) {
		for(int i=1; i<=arr.length; i++) {
			System.out.print(arr[i-1]+" ");
		}
	}
	
	static int totalArr(int[] arr) {
		int total=0;
		for(int i=1; i<=arr.length; i++) {
			total+=arr[i-1];
		}
		return total;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[5];
		
		//1번)
		inputArr(arr);
		
		//2번)
		printArr(arr);
		
		//3번
		int sum=totalArr(arr);
		
		System.out.println("\n\nsum= "+sum);
	}
}