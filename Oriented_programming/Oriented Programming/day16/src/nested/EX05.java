package nested;

import java.util.Arrays;
import java.util.Comparator;

public class EX05 {
	public static void main(String[] args) {
//		익명 클래스
//		- 지역 중첩 클래스와 비슷한 구조
//		- 단, 이름이 없는 클래스이며 하나의 인스턴스에만 적용하는 일회용
//		- 주로, 특정 인터페이스의 기능을 바로 구현해서 사용하는 경우에 사용함
		Integer[] arr=new Integer[] {10, 50, 40, 20, 30};
		
		//익명 중첩 클래스 - 익명이면서 클래스 안에 있는 구조임  → 익명 중첩 클래스!
		Comparator<Integer> desc=new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		};
		
		Arrays.sort(arr, desc);
		System.out.println(Arrays.toString(arr));
		
		/*
			지역 중첩 vs 익명 중첩
			1. 지역 중첩은 클래스를 통해 인스턴스를 계속 찍어낼 수 있음
			2. 익명 중첩은 하나의 인스턴스만 생성 가능
			3. 인스턴스를 여러개 만드는 이유는 필드값을 서로 다르게 저장하기 위함
				ex) 사람(Person)의 이름(name)은 서로 다르다
				
			4. 하지만 Comparator 처럼 특정 메서드만 필요하면 기능이 동일함
				따라서, 인스턴스가 어러개일 필요가 없음
				
				static → 중첩 → 익명
		 */
	}
}
