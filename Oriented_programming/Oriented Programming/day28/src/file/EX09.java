package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX09 {
	public static void main(String[] args) throws IOException {
		//실제 실행파일을 읽어서 복사
		File src=new File("E:\\filetest\\eclipsec.exe");
		File dst=new File("E:\\filetest\\copy.exe");
		
		//1. 원본을 읽는다(=입력)
		FileInputStream fis=new FileInputStream(src);
		
		//2. 대상에 쓴다(=출력)
		FileOutputStream fos=new FileOutputStream(dst);
		int data;
		
		while((data=fis.read()) !=-1) {
			fos.write(data);
		}
		
		System.out.println("복사 완료");
		//※버퍼 없이 기계어를 복사하면 오래 걸림
		
		fis.close();
		fos.close();
	}
}