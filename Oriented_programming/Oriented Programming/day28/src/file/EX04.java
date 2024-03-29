package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EX04 {
	public static void main(String[] args) throws IOException {
		
		//없는 파일은 만들 수 있지만, 경로를 만들 수는 없음
		File dir=new File("E:\\filetest2");
		File file=new File(dir, "test2.txt");
		
		if(dir.exists()==false) {
			dir.mkdir();
		}
		
		//단순히 문자열로 Writer의 경로를 지정해도 되지만, file 개겣를 활용하는 것이 권장됨
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("보조 스트림을 활용한 출력입니다.\n");
		bw.write("반갑습니다.");
		
		System.out.println("출력 종료");
		
		//이 코드를 실행하고 삭제를 해야함
		bw.close();
		
//		file.delete();
//		dir.delete();

	}
}