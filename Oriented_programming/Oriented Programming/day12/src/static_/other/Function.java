package static_.other;

public class Function {
	public static void printNumber(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	//1.
	public static int total(int n) {
		int sum=0;
		
		for(int i=1; i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	
	//2.
	public static int absolute(int n) {
		int abs=(n<0)?-n:n;
		return abs;
	}
	
	//3.
	public static void selectSort(int[] arr) {
		int[] tmp=new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<=arr[j]) {
					tmp[i]=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp[i];
				}
			}
		}
	}
	
	//n의 최대약수= n/2
	//4.
	public static boolean isPrime(int num) {
		boolean bo=true;
		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) return false;
		}	
		return bo;
	}
}