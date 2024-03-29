package nested;

import java.util.Arrays;
import java.util.Comparator;

public class EX04 {
	public static void main(String[] args) {

		
		Integer[] arr=new Integer[] {10, 50, 40, 20, 30};

		class DescInt implements Comparator<Integer>{
			public int compare (Integer o1, Integer o2) {
				return o2-o1;
			}

		}
		
		DescInt desc=new DescInt();
		
		Arrays.sort(arr); 	//comparable이 이미 정의되어 있으면 내가 굳이 해줄 필요가 없음
							//만약 comparator같이 추가적인 기능을 사용해야 하면 만들어 줘야 함
		System.out.println(Arrays.toString(arr));
	}	
}