package array;
import java.util.Arrays;
import java.util.Scanner;
/*
 	문제)
 	1. 학생 5명 점수를 저장할 정수형 배열을 선언
 	2. 반복과 입력을 활용해서 배열에 순서대로 학생 점수를 입력받는다.
 	3. 입력받은 점수를 일렬로 모두 출력
 	4. 학생들의 점수 합계/평균을 출력
 	5. 1등의 점수와 꼴등의 점수를 출력
 	
	3대 정렬) → 실무에서는 거의 사용하지 않음 , 그냥 학습용, 오래 걸림(중첩 for문 쓰기 때문)
	1. 선택 정렬	(select sort)
	2. 삽입 정렬	(insert sort)
	3. 버블 정렬	(bubble sort)
	
	상위 정렬)
	1. 병합	정렬	(merge sort) → 가장 많이 사용함
	2. 퀵	정렬	(quick sort) → 가장 빠름. 단, 이미 정렬 된 것을 정렬하려 시도하면 최저의 성능을 보여줌 ex) 오름차순 → 내림차순 정렬 시도
	3. 셀	정렬	(cell sort)
	4. 기수	정렬
 */

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[5];
		double sum=0.0;
		int max=0, min=100;
		String conse="학생들의 %s: %.1f\n";
		
		for(int i=0; i<5; i++) {
			System.out.print("학생의 점수를 입력하세요: ");
			arr[i]=sc.nextInt();
			sum+=arr[i];
			if(max<arr[i]) max=arr[i];
			if(min>arr[i]) min=arr[i];
		}
		
		System.out.print("\n"+Arrays.toString(arr)+"\n");
		System.out.printf(conse, "점수 합",sum);
		System.out.printf(conse,"평균",sum/5);
		System.out.printf(conse, "최대값",(double)max);
		System.out.printf(conse, "최소값",(double)min);
		
		sc.close();
	}
}