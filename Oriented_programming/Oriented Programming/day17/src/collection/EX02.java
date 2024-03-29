package collection;
//Set: 순서와 중복이 없는 구조

import java.util.ArrayList;
import java.util.HashSet;

public class EX02 {
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(30);	//중복 데이터는 무시됨 →  →  →  → 주로 중복값을 제거할 때 사용함
		
		System.out.println("set= "+set);
		
		//-순서(=index)가 없기 때문에 indexing 불가!
//		System.out.println("set[0]= "+set(0));
		
		set.remove(10);	//값을 제거할 수는 있지만 인덱스로 지우는 것이 아닌 값으로 지움
		System.out.println("set= "+set);
		
		//collection 들은 보통 다른 collection 간에 생성자로 변환이 가능함(안되는 것이 있지만 대체로 가능하다고 생각하면 됨)
		ArrayList<Integer> list=new ArrayList<Integer>(set);
		
		System.out.println("\nlist= "+list);
		System.out.println("list[0]= "+list.get(0));
	}
}