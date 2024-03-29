package file;

import quiz.Controller;

/*
	학생 관리 프로그램
	1. 학생 목록 → 이름, 국, 영, 수, 합게 출력
	2. 학생 정보 추가
	3. 학생 정보 수정
	4. 학생 정보 삭제
	5. 저장 
	6. 불러오기
	7. 종료
 */

public class Quiz {


	public static void main(String[] args) {
		new Controller().run();
	}
}