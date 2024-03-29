package quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Controller {
	private Scanner std=new Scanner(System.in);
	Scanner fileOut;
	LinkedList<Student> stus=new LinkedList<Student>();

	private void showMenu() {
		System.out.println("메뉴를 입력하세요: ");
		System.out.println("1: 목록");
		System.out.println("2: 추가");
		System.out.println("3: 수정");
		System.out.println("4: 삭제");
		System.out.println("5: 저장");
		System.out.println("6: 불러오기");
		System.out.println("7: 종료");
	}

	void delete() {
		System.out.print("제거할 학생의 이름을 입력하세요: ");
		String whoame=std.next();

		for(int i=0; i<stus.size(); i++) {
			String cur=stus.get(i).getName();
			if(cur.equals(whoame)) {
				stus.remove(i);

				System.out.println("삭제 완료");
				return;
			}
		}

	}

	private void save() throws IOException {
		FileWriter fw=new FileWriter("stuSave.txt");
		BufferedWriter bw=new BufferedWriter(fw);

		for(int i=0; i<stus.size(); i++) {
			bw.write(stus.get(i)+"\n");
		}

		System.out.println("저장 완료");
		bw.close();
	}

	private void add() {
		String name;
		int kor, mat, eng;

		System.out.print("이름, 국, 영, 수 점수를 입력하세요: ");
		name=std.next();
		kor=std.nextInt();
		mat=std.nextInt();
		eng=std.nextInt();

		stus.add(new Student(name, kor, mat, eng));


		System.out.println("추가 완료");
	}

	private void showStus() {
		System.out.println("이름    국,  영,  수");
		System.out.println("-----------------------");
		for(int i=0; i<stus.size(); i++) {
			System.out.println(stus.get(i));
		}
	}

	void re() {	
		System.out.print("수정할 학생의 이름을 입력하세요: ");
		String whoame=std.next();

		for(int i=0; i<stus.size(); i++) {
			Student stu=stus.get(i);
			String cur=stus.get(i).getName();

			if(cur.equals(whoame)) {
				String newName;
				int kor, eng, mat;

				System.out.print("이름: ");
				newName=std.next();

				System.out.print("국, 영, 수: ");
				kor=std.nextInt();
				eng=std.nextInt();
				mat=std.nextInt();

				stu.update(newName, kor, eng, mat);
				stus.set(i, stu);

				System.out.println("수정 완료");
				return;
			}
		}

	}

	private void load() throws IOException{
		File save=new File("stusave.txt");
		fileOut=new Scanner(save);

		String name;
		int kor, eng, mat;

		while(fileOut.hasNext()) {
			name=fileOut.next();
			kor=fileOut.nextInt();
			eng=fileOut.nextInt();
			mat=fileOut.nextInt();

			stus.add(new Student(name, kor, eng, mat));
		}
		System.out.println("불러오기 성공");
	}

	public void run() {
		try {
			int menu;

			do {
				showMenu();
				menu=std.nextInt();

				switch(menu) {
				case 1:showStus(); break;

				case 2:	add(); break;

				case 3: re(); break;

				case 4:	delete(); break;

				case 5:	save();	break;

				case 6:	load();	break;

				default: System.out.println("없는 메뉴입니다.");
				}

			} while(menu != 7);

		} catch(IOException e) {
			System.err.println("예외 메세지: "+e.getMessage());
		} finally {
			std.close();
			System.out.println("\n 프로그램 종료");
		}
	}
}
