package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class EX08 {
	public static void main(String[] args) throws IOException {
		File file=new File("E:\\filetest\\test3.exe");
		FileInputStream fis=new FileInputStream(file);
		
		byte[] buf=new byte[100];
		fis.read();
		
		System.out.println(Arrays.toString(buf));
		
		fis.close();
	}
}