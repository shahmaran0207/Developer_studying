package array;
import java.util.Arrays;

public class EX06 {
	public static void main(String[] args) {
		//1차 배열: 지정 자료형의 데이터를 일렬로 저장
		int[] arr1= new int[] {10, 20, 30, 40};
		System.out.println("arr1= "+arr1);
		
		//2차 배열: 1차 배열을 '요소'로 가지는 배열 → 가독성을 이유로 행과열을 나누어 적어주는 것이 좋음
		int[][] arr2=new int[][] {
			{10, 20, 30, 40},	//0행
			{11,21,31,41},		//1행
			{12,22,32,42}		//2행
		//    0, 1, 2, 3열 
		};
		
		System.out.println("\narr2= "+arr2);
		System.out.println("\narr2= "+Arrays.deepToString(arr2));
		//- n차 배열은 deepToString()을 사용하면 문자열로 받을 수 있다. 그냥 toString쓰면 안됨
		
		System.out.println("\narr[0]= "+arr2[0]); //해시코드에서 대괄호 하나만 나오면 1차 배열, 2개 나오면 2차 배열....
		System.out.println("arr2= "+Arrays.toString(arr2[0]));
		System.out.println("\narr2= "+arr2[0][2]);
	}
}