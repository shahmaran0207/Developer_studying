package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) throws IOException {
		//단순 텍스트 파일을 읽을땐 Scanner를 사용하면 수월함
		File file=new File("E:\\filetest\\test1.txt");
		Scanner sc=new Scanner(file);
		
		String line;
		
		while(sc.hasNextLine()) {
			line=sc.nextLine();
			System.out.println(line);
		}
		
		sc.close();
	}
}