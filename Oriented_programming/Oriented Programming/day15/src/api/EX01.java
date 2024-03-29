package api;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
	Interface(※ JAVA의 Interface와 다른 의미)
	- 다른 장비나 시스템을 사용하기 위한 접점
	- ex) 자판기의 화폐 투입구 및 음료 선택 버튼 
	
	사람 <-----------> 기계
			↑
	여기서 사람과 기계를 이어주는 것이 인터페이스!
	- 사람과 사람, 사람과 기계, 기계와 기계, 프로그램과 프로그램 등
	
	UI(User Interface)
	- 사용자가 기기를 쉽게 동작시키는데 도움을 주는 시스템 등을 의미
	- 어플리케이션 사용자가 보는 화면을 의미
	- ex) 웹사이트, 어플리케이션의 화면(=메뉴), 키오스크 등

	API: Application Programming Interface
	- 프로그램 간에 수월한 정보 및 기능을 주고 받기 위해 규격화 해놓은 것
	- 프로그램을 다른 이에게 제공하거나 다른 이의 프로그램의 기능을 받아서 사용시 정한 규격을 의미
	- 프로그램 기능의 사용법을 명시한 문서를 'API 문서'라고 한다.
	- 간단히 말해서 사용설명서라고 할 수 있음
	
	JDK API
	- JAVA에서 제공하는 기본 클래스들 모음을 의미
	- 작은 단위로는 라이브러리라고 칭하기도 한다
 */

public class EX01 {
	public static void main(String[] args) {
		//기존에 import 해서 사용하던 모든 것이 JDK API임
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년  MM월 dd일 HH:mm:ss E");
		String time=sdf.format(date);
		System.out.println(time);
	}
}