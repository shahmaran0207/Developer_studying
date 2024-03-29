package method;

import java.util.Arrays;

public class EX04 {
	static void test(int num, int[] array) {
		num+=5;
		array[0]=5;
	}
	
	public static void main(String[] args) {
		int n=10;
		int[] arr=new int[] {10};		//→ array는 main것도 test것도 아님!
		
		test(n, arr);	//n(일반변수)		→ call by value(※실제 데이터를 바꿀 수 없음)
						//arr(참조 변수)	→ call by reference(※실제 데이터의 위치를 알려주므로 데이터를 바꿀 수 있음)
		
		System.out.println("\nn= "+n);
		System.out.println("n= "+Arrays.toString(arr));
	}
}