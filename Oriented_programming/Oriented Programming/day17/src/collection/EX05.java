package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class EX05 {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();

		map.put("java", 80);
		map.put("python", 40);
		map.put("html", 30);
		
		//map은 순환이 불가능한 구조(=Not Iterable)
		Set<String> keys= map.keySet();
		System.out.println("keys= "+keys);
		System.out.println();
		
		//1. for-each문
		for(String key: keys) {
			int value=map.get(key);
			System.out.printf("%s: %d\n", key, value);
		}
		System.out.println("\n");
		
		//2. iterator
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext()) {
			String key=it.next();
			System.out.printf("%s: %d\n", key, map.get(key));
//			System.out.printf("%s: %d\n", it.next(), map.get(it.next())); → 이렇게 하면 it.next에서 한번, map.get(it.next())에서 한번 총 두번 next를 실행함 
		}
		
		map.forEach((String k, Integer v) -> System.out.printf("%s: %d\n", k, v));
	}
}