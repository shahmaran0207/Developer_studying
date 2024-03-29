package model.vo;

/*
 	STUDENT 테이블)
	IDX  NOT NULL NUMBER       
	NAME NOT NULL VARCHAR2(30) 
	KOR           NUMBER       
	ENG           NUMBER       
	MAT           NUMBER
	
	STD_SUM 테이블)
	total		  NUMBER			
*/

public class StudentVO {
	private int idx, kor, eng, mat, total;
	private String name;
	

	public int gettotal() {
		return total;
	}
	public void settotal(int total) {
		this.total = total;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
