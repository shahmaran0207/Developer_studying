package file;

import java.io.File;
import java.io.IOException;

//최상위부터 경로를 적으면 절대경로
//경로를 지정하지 않고 내 위치에 경로를 적으면 상대경로

//입출력의 기준: 프로그램
//프로그램에서 나가면 output
//프로그램으로 들어오면 input
//표준입출력: 콘솔을 통해 입출력 받는것 → 콘솔을 끄면 날아감
//파일 출력: 쓰기임!
//파일 입력: 불러오기, 읽기!

//예외 처리를 무조건 try ~ catch로 하면 코드 더러워짐 → 간단한 예외의 경우 조건문으로 처리하는게 더 나음
public class EX02 {
	public static void main(String[] args) throws IOException {
		File f1=new File("E:\\filetest");
		
		//해당 폴더가 있으면 생성
		if(!f1.exists()) {
			f1.mkdir();
			System.out.println("폴더 생성");
		}
		
		//E:\\filetest\test1.txt
		File f2=new File(f1, "test1.txt");
		
		if(!f2.exists()) {
			f2.createNewFile();	//파일 생성 시 중간 경로가 없으면 예외가 발생할 수 있음
								//따라서, 파일 과련 메서드는 예외 전가가 많이 되는 편이다.
			System.out.println("새 파일 생성");
		}
	}
}