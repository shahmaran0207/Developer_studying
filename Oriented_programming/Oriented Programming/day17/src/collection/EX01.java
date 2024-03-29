package collection;

import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class EX01 {
	public static void main(String[] args) {
		//그 외 나머지 List를 구현한 클래스
		//1. Vector는 java 초기 버전에서 사용하던 클래스
		Vector<Integer> vec=new Vector<Integer>();
		
		vec.add(10);
		vec.add(30);
		System.out.println("vec= "+vec);
		//다른 사용법도 동일함. remove 등
		
		//2. Stack →  →  →  → 가장 최근 것을 실행할 때 사용 ex) 인터넷 뒤로가기 버튼
		//- LIFO: 후입 선출, 나중에 들어간 데이터가 먼저 꺼내지는 구조
		Stack<Integer> stack=new Stack<Integer>();

		//push(n): 스택의 대표적인 입력형태 →  →  →  → 가장 아래부터 차곡차곡 쌓아가는 형태
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("stack= "+stack);
		
		//pop(): 가장 위에것부터 하나씩 꺼내는 형태
		int n=stack.pop();
		
		System.out.println("\nn= "+n);
		System.out.println("stack= "+stack);
		
		//3. Queue →  →  →  →  → 주로 실행 순서를 맞출떄 주로 사용함
		//- FIFO: 선입선출, 먼저 들어간 데이터가 먼저 빠져나오는 구조
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println("queue= "+queue);
		
		n=queue.poll();
		System.out.println("\nn= "+n);
		System.out.println("queue= "+queue);
		
	}
}