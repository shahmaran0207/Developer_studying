package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class EX02 {
	public static void main(String[] args) {
//		List는 바로 초기화해서 사용하지는 않음
//		- 새로운 데이터는 그떄그떄 추가 및 제거해서 사용함 
		Integer[] arr=new Integer[] {10, 50, 60, 30, 40};
		List<Integer> list=Arrays.asList(arr);
		
		System.out.println("list= "+list);
		
		//list는 순서(index)가 있으므로 반복이 가능함
		//1. 일반 for문		: index로 반복
		for(int i=0; i<list.size(); i++) {
			System.out.printf("list[%d]= %d\n", i, list.get(i));
		}
		System.out.println();
		
		//2. for - each문
		for(int n: list) {
			System.out.println("n= "+n);
		}
		System.out.println();
		
		//3. iterator: 순환자
		Iterator<Integer> it= list.iterator();
		
		while(it.hasNext()) {		//hasNext(): 커서는 이동하지 안고, 다음 데이터가 있는지 확인 → 다음 데이터가 있으면 true, 없으면 false 반환
			int n=it.next();		//next(): 커서를 다음으로 이동 후 그 데이터를 반환
			System.out.println("n= "+n);
		}
		
		//순환을 마친 it참조 변수는 다시 앞으로 오지 않는다
		System.out.println(it.hasNext());
		
		//다시 앞으로 돌리려면 해당 컬렉션으로부터 iterator를 다시 받는다
		it=list.iterator();
		System.out.println(it.hasNext());
		
		//※ 이건 참고만!
		//람다식을 전달인자로 사용시 {}는 작성하면 안됨
		list.forEach((Integer t) -> System.out.println("t= "+t));
	}
}