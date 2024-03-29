package collection;

import java.util.LinkedList;

/*
	ArrayList	VS	LinkedList
	1. ArrayList		: 속도가 빠르지만, 중간값 추가 제거시 오버헤드 발생 가능성이 있음		→ 수정이 발생하지 않을 경우 더 빠름
	2. LinkedList		: ArrayList보단 좀 느리지만, 오버헤드가 없다.					→ 추가/제거가 빈번하게 발생 시 더 유리함
	
	※추가/제거가 빈번하게 발생하는 정보면 LinkedList가 유리함
 */
public class EX04 {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("홍길동");
		list.add("김철수");
		list.add("이수진");
		
		System.out.println("list= "+list);
		System.out.println("사용법에 차이는 없음");
	}
}