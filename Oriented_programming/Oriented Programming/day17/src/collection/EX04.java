package collection;
/*
	Map: key와 value 한 쌍으로 구성된 구조
*/

import java.util.HashMap;

public class EX04 {
	public static void main(String[] args) {
		//key: 데이터를 접근하기 위한 index	(중복 불가)
		//value: 실제 저장할 데이터			(중복 가능 →  중복 값을 입력하면 value값이 바뀜)
		HashMap<String, Integer> map=new HashMap<>();
		//key의 경우 String을 주로 사용함
		//value의 경우 Object를 주로 씀
		
		map.put("java", 80);
		map.put("python", 40);
		map.put("html", 30);
		
		System.out.println("map= "+map);
		
		System.out.println("map['java']= "+map.get("java"));
		map.put("java", 90);
		System.out.println("\nmap= "+map);
	}
}