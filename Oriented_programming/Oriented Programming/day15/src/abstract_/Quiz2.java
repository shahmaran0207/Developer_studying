package abstract_;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
	private String name;
	private int kor;
	private int mat;
	private int eng;
	
	Student (String name, int kor, int mat, int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}

	public String getName() {
		return name;
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
	
//	int total() {
//		return kor+eng+mat;
//	}
	
	@Override
	public String toString() {
		int sum=this.getKor()+this.getEng()+this.getMat();
		return "이름: "+name+" 합계: "+sum+"점";
	}
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		//Student 클래스를 작성한 후
		//성적 합계 순으로 내림차순
		//필드 이름, 국 영 수
		Student[] stu=new Student[] {
				new Student("홍길동", 20, 88, 99),
				new Student("김길동", 20, 45, 44),
				new Student("김민지", 74, 87, 99),
				new Student("이수진", 100, 100, 100)
		};
		
		Comparator<Student> avg=(Student s1, Student s2) ->{
			int n1=s1.getEng()+s1.getMat()+s1.getKor();
			int n2=s2.getEng()+s2.getMat()+s2.getKor();
			return n2-n1;
		};
		
		System.out.println("정렬 전 학생: "+Arrays.toString(stu));
		
		Arrays.sort(stu, avg);
		System.out.println("정렬 후 학생: "+Arrays.toString(stu));
	}
}