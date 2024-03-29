package collection;

import java.util.LinkedList;
import java.util.Scanner;

class Controller {
	LinkedList<Object> list = new LinkedList<Object>();
	Scanner sc = new Scanner(System.in);

	private void showMenu() {
		System.out.println("--학생 정보 관리 프로그램--");
		System.out.println("1. 학생 정보");
		System.out.println("2. 학생 정보 추가");
		System.out.println("3. 학생 정보 검색");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
	}

	void StudentInfo() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

	void delete() {
		System.out.print("제거하려는 학생의 학번을 입력하세요: ");
		int search = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			Student student = (Student) list.get(i);
			if (student.getNum() == search) {
				list.remove(i);
				System.out.println("삭제 완료");
				return;
			}
		}
		System.out.println("해당 학생을 찾을 수 없습니다.");
	}

	void search() {
		System.out.print("검색하려는 학생의 학번을 입력하세요: ");
		int search2 = sc.nextInt();
		String msg = "해당학생 없음";

		for (int i = 0; i < list.size(); i++) {
			Student st = (Student) list.get(i);
			if (st.getNum() == search2) {
				msg = "이름: %s, 학번: %d, 국어: %d, 수학: %d, 영어: %d";
				msg = String.format(msg, st.getName(), st.getNum(), st.getKor(), st.getEng(), st.getMat());
				System.out.println(msg);
				return;
			}
		}
		System.out.println(msg);
	}

	void add() {
		System.out.print("이름, 학번, 국, 영, 수 입력: ");
		String n = sc.next();
		int nu = sc.nextInt();
		int k = sc.nextInt();
		int e = sc.nextInt();
		int m = sc.nextInt();
		Student stu = new Student(n, nu, k, e, m);
		
		for(int i=0; i<list.size(); i++) {
			Student student = (Student) list.get(i);
			if (student.getNum()==nu) {
				System.out.println("이미 존재하는 학번입니다.");
				return;
			}
		}
		list.add(stu);
		System.out.println("추가 완료");
	}

	void re() {
		System.out.print("수정하려는 학생의 학번을 입력하세요: ");
		int search = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			Student student = (Student) list.get(i);
			if (student.getNum() == search) {
				list.remove(i);
				System.out.print("수정할 이름, 학번, 국, 영, 수 입력: ");
				String n = sc.next();
				int nu = sc.nextInt();
				int k = sc.nextInt();
				int e = sc.nextInt();
				int m = sc.nextInt();
				Student updatedStudent = new Student(n, nu, k, e, m);
				list.add(updatedStudent);
				System.out.println("수정 완료");
				return;
			}
		}
		System.out.println("해당 학생을 찾을 수 없습니다.");
	}

	void run() {
		int menu;
		do {
			showMenu();
			System.out.print(">> ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				StudentInfo();
				break;
			case 2:
				add();
				break;
			case 3:
				search();
				break;
			case 4:
				re();
				break;
			case 5:
				delete();
				break;
			case 0:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 정보입니다.");
			}
		} while (menu != 0);

		sc.close();
	}
}

class Student {
	private String name;
	private int num;
	private int kor;
	private int mat;
	private int eng;

	public Student() {}

	public Student(String name, int num, int kor, int mat, int eng) {
		this.name = name;
		this.num = num;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}

	public int getKor() {
		return kor;
	}

	public int getMat() {
		return mat;
	}

	public int getEng() {
		return eng;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		String msg = "이름: %s, 학번: %d 합계: %d\n";
		int total = getKor() + getMat() + getEng();
		msg = String.format(msg, name, num, total);
		return msg;
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		new Controller().run();
	}
}