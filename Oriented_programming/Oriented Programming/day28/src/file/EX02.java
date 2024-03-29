package file;

import java.io.FileReader;
import java.io.IOException;

public class EX02 {
	public static void main(String[] args) throws IOException {
		//파일 입력
		FileReader fr=new FileReader("E:\\filetest\\test1.txt");	//쓰기는 없으면 만들면 되지만, 읽기는 없으면 오류 뜨게 됨 → 예외처리 해 줘야 함
		char[] buf=new char[100];
		
		fr.read(buf);
		
		System.out.println(buf);
		System.out.println("파일 입력 완료");
		
		//파일을 일거나 쓰는 경우 마지막에 닫는 기능을 실행해야 함 아니면 제대로 안될 수도 있음
		fr.close();
	}
}