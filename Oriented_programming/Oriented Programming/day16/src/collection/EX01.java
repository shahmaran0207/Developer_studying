package collection;
/*
	Collection	: 모음
	Framework	: 규격이 정해진 도구
	
	Collection Framework
	- JAVA에서 제공하는 자료구조 및 알고리즘
	
	종류)
	1. List	: 순서가 있고, 중복이 허용되는 구조
	2. Set	: 순서가 없고, 중복이 없는 구조
	3. Map	: key와 value의 쌍으로 이루어진 구조
	
	※ 위의 3가지는 모두 interface로 작성되어 있다.
	따라서, 저 interface를 상속받아 구현한 클래스를 사용해야 한다
	List → ArrayList, LinkedList, Vector, Stack, Queue 등
	Set	 → HashSet, TreeSet 등
	Map	 → HashMap, HashTable, TreeMap 등
	
	프로그램 조건
	C: create
	R: read
	U: update
	D: delete
 */

import java.util.ArrayList;

public class EX01 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();	//인스턴스 생성시 <>안의 내용을 지워도 되지만, <>자체는 지워서는 안됨
		
//		대부분의 collection은 toString()을 오버라이드 하고 있다.
		System.out.println("list= "+list);
		
//		배열의 경우 미리 크기를 정해두어야 하며 추후 크기의 변경이 불가함 + 메모리 낭비도 심했음		→		이러한 문제를 해결하기 위한 것이 ArrayList
//		리스트의 경우 크기가 유연하게 조절됨
		
		//1. add(data)			: 지정 데이터를 리스트 가장 뒤에 추가함
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		System.out.println("list= "+list);
		
		//2. add(index, data)	: 지정위치에 데이터 '추가', 기존 데이터는 뒤로 밀려남
		list.add(1, 200);
		System.out.println("list= "+list);
		
		//3. set(index, data)	: 지정 위치의 데이터를 '변경'
		list.set(1, 20);
		System.out.println("list= "+list);
		
		//4. get(index)			: 지정 위치의 데이터를 반환
		System.out.println("list[0]= "+list.get(0));
		
		//5. remove(index)		: 지정 위치의 데이터를 삭제, 남은 데이터는 앞으로 땡겨옴
		list.remove(2);
		System.out.println("list= "+list);
		
		//6. size():			: 데이터 개수를 반환
		System.out.println("list개수: "+list.size());
		
		//7. indexOf(data)		: 지정 데이터의 위치를 반환, 겹칠 경우 앞에 것만 나옴
		System.out.println("20의 위치: "+list.indexOf(20));
		
		//8. isEmpty()			: 데이터가 하나도 없으면 true반환
		System.out.println("리스트가 비었는가? "+list.isEmpty());
		
		//9. clear()			: 모든 데이터를 제거
		list.clear();
		System.out.println("list= "+list);
	}
}