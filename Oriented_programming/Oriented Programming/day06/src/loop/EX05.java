package loop;

/*
※지역변수(local variable)
	- 특정 영역에서 선언된 변수를 의미
	- 해당 영역에서 생성되며 해당 영역이 끝나면 메모리에서 제거됨
	- 즉, 해당 영역에서만 사용 가능함
	
	★지역변수의 존재 이유: 효율성을 위함
*/

public class EX05 {
	public static void main(String[] args) {
		
		//1. for문의 지역변수
		for(int i=1; i<=3; i++) {
			System.out.println(i+": Hello world");
		}
		System.out.println();
//		System.out.println("반복 후 i: "+i); → i를 정의하긴 했으나 for문 안에서 정의함 → for문이 끝나면 i는 제거가 된 것 →→→ 최종적으로 i는 사라졌으니 출력이 불가한 것
//		i는 for문에서 생성된 지역변수 → for문이 끝나고 나면 제거되고 없음
		
		//2. main의 지역변수
		int i;
		for(i=1; i<=3; i++) {
			System.out.println(i+": Hello world");
		}
		
		System.out.println("반복후 i= "+i);
	}
}