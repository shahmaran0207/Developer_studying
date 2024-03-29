package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class EX06 {
	public static void main(String[] args) {
//		TreeMap은 key 순으로 정렬해 저장
//		※ map에서 key는 String, value는 Object를 주로 사용함
//		- String은 사람이 판별하기 가장 좋은 타입이고,
//		- Object는 java의 어떤 타입이든 저장 가능

		TreeMap<String, Object> map=new TreeMap<>();
		map.put("name", "홍길동");
		map.put("age", 33);
		map.put("height", 170.5);
		
		List<String> hobby=new ArrayList<String>();
		
		hobby.add("게임");
		hobby.add("소설");
		hobby.add("영상");
		
		map.put("hobby", hobby); //※배열로 넣어서 출력하면 해시코드 출력됨 주의!
		System.out.println("map= "+map);
		System.out.println();
		
		Comparator<String> desc;
		desc=(String o1, String o2)->{
			return o2.compareTo(o1);
		};
		
		TreeMap<String, Object> map2=new TreeMap<>(desc);
		map.put("name", "홍길동");
		map.put("age", 33);
		map.put("height", 170.5);
		
		hobby.add("게임");
		hobby.add("소설");
		hobby.add("영상");
		
		
		//이렇게 하면 배열로 해도 한글로 출력되긴 함
		String[] hobby2= {"게임", "소설", "영상"};
		map2.put("hobby",  Arrays.asList(hobby2));
		map2.forEach((String k, Object v) -> System.out.printf("%s : %s\n", k, v));
	}
}