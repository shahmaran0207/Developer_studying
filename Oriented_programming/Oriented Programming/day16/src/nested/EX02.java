package nested;

class Outer_{
	private int nout=10;	
	private static int sout=10;
	
	static class Inner_{
		void inMethod() {
//			정적 멤버(Inner)는 일반멤버 (nout)을 참조할 수 없음
//			- 정적 멤버는 일반 멤버가 생성되기 전부터 존재하기 때문
//			System.out.println("nout= "+nout);
			System.out.println("sout= "+sout);
		}
	}
}

public class EX02 {
	public static void main(String[] args) {
		Outer_.Inner_ in = new Outer_.Inner_();
		
		in.inMethod();
	}
}