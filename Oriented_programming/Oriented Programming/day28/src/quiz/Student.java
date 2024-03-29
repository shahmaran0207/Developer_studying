package quiz;

public class Student {
	private String name;
	private int kor, mat, eng, total;

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

	public int getTotal() {
		return total;
	}
	
	public void update(String name, int kor, int eng, int mat) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}

	Student(String name, int kor, int mat, int eng){
		this.name=name;
		this.kor=kor;
		this.mat=mat;
		this.eng=eng;
	}

	public Student() {
	}

	@Override
	public String toString() {
		total=kor+mat+eng;
		String msg="%s  %d %d %d";

		msg=String.format(msg,  name, kor, eng, mat, total);

		return msg;
	}
}
