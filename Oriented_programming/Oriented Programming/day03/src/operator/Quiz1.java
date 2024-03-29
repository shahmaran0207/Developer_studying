package operator;

/*
1. 이름, 국영수 저장할 변수를 선언 - 국영수는 정수로
		2. 1.번에 선언한 값을 대입
		3. 아래와 같이 출력
		결과) 
		이름: 홍길동 (국 70, 영 80, 수 98)
		합계: 248(82.67)
*/
		
public class Quiz1 {
	public static void main(String[] args) {
		String name="홍길동";
		int kor=70, eng=80, math=98;
		int sum=kor+eng+math;
		
		String result="이름: %s (국 %d, 영: %d, 수: %d) \n";
		
		System.out.printf(result , name, kor, eng, math);
		System.out.printf("합계: %d (%.2f)\n", sum, (sum/3.0));
	}
}
