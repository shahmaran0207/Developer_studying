package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 	입출력 보조 스트림
 	- 입출력을 좀 더 효율적으로 돕는 객체

 	바이트 단위(2진수)	: BufferedInputStream, BufferedOutputStream
 	문자 단위			: BufferedReader, BufferedWriter
 */

public class EX03 {
	public static void main(String[] args) throws IOException   {
		
		FileReader fr=new FileReader("E:\\filetest\\test1.txt");
		BufferedReader br=new BufferedReader(fr);
		
		char[] cbuf=new char[100];
		
		br.read(cbuf);
		
		System.out.println(cbuf);
		
		String line;
		
		//readLine()은 문서의 마지막 줄에 도달하면 null을 반환
		//이를 활용해서 문서 전체를 읽을 수 있음
		while((line=br.readLine()) !=null) {
			System.out.println(line);
		}
		
		br.close();
	}
}