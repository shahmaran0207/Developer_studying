package com.itbank.file;

import java.io.File;

import org.junit.Test;

public class test2 {
	
	@Test
	public void test2() {
		File dir=new File("FileFolder");
		File file=new File(dir, "test1.txt");			// 디렉토리도 건드리고, 파일도 건드리는 경우
//		File file=new File("FileFolder/test1.txt");		// 파일만 건드릴 수 있음
		
		
		System.out.println("dir유무? : "+dir.exists());
		System.out.println("file유무? : "+file.exists()+"\n");
		
		System.out.println("디렉토리? : "+dir.isDirectory());
		System.out.println("파일? : "+file.isFile()+"\n");
		
		dir.listFiles();
		
		for(File f: dir.listFiles()) {
			String name=f.getName();
			int dot=name.indexOf(".");
			String pre=f.getName().substring(0, dot);
			String ext=f.getName().substring(dot, name.length());
			
			System.out.println("파일명: "+pre);
			System.out.println("- 타입: "+ext+"\n");
		}
	}
}