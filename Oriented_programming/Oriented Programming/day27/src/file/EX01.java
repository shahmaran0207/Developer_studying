package file;

import java.io.File;

/*
	file: 파일
	- 디스크에 저장되는 데이터
	- 디스크라는 컴퓨터 보조 저장 장치에 데이터가 영구적으로 저장된 형태
	
	directory: 디렉토리
	- 다른 파일을 모아서 저장하는 특수파일
	- 윈도우의 폴더와 같은 개념
 */

public class EX01 {
	public static void main(String[] args) {
		//Java에서는 File이라는 객체 파일로 처리가능
		File f1=new File("E:\\filetest");
		
		System.out.println("f1= "+f1);
		
		System.out.println("파일인가? "+f1.isFile());
		System.out.println("디렉토리인가? "+f1.isDirectory()+"\n");
		
		System.out.println("읽기 가능? "+f1.canRead());		//이거 안되면 접근 불가
		System.out.println("쓰기 가능? "+f1.canWrite());		//이거 안되면 추가/삭제 불가
		System.out.println("실행 가능? "+f1.canExecute());		//이거 안되면 접속 불가
		System.out.println();
		
		System.out.println("존재 하는가? "+f1.exists());
		f1.delete();	//이렇게 하면 휴지통 거치지 않고 그냥 바로 완전 삭제
		System.out.println("\n삭제 되었습니다.");
		
		f1.mkdir();
		System.out.println("\n생성되었습니다.");
	}
}