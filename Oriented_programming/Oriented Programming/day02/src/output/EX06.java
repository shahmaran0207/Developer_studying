package output;

/*
//escape sequence: 이스케이프 시퀀스
//- 문자열 내에서 특수한 가능으로 사용되는 문자들
//- 백슬래시(\)와 결합되어 사용됨
   * */

public class EX06 {
	public static void main(String[] args) {
			
		//※문자열: 쌍따옴표("")로 묶인 데이터. 단어나 문장을 표현하기 위한 타입
		System.out.println("Hello\nWorld!!"); // \n: new line. 개행
		System.out.println("\n안녕\n\n하세요"); //문자열 내에서 여러개 사용 가능
											// - 또한 문자 하나당 백슬래시 한 개가 필요함 --> ex) \nn불가
		
		System.out.println("Eclipse \t\t 2019버전"); //\t: tab. 들여쓰기(간격 맞출떄에도 종종 사용함)
		
		System.out.println("저희 java 버전은 '8버전' 입니다."); 
		System.out.println("저희 java 버전은 \"8버전\" 입니다."); // (\"): 문자열을 묶는 기능을 제거 
		
		System.out.println("공유폴더 \\192.168.112.7"); 
		// (\\): 백슬래스 하나가 뒤의 백슬래시를 일반 문자여롤 바꿈 --> 주의: 백슬래시 하나당 문자 하나 --> 즉, 백슬래시 두개를 출력하고 싶으면 백슬래시 4개 써야함

		
	}
}
