package static_;

class Student{
	private String name;
	private static int total;
	
	public static int getTotal() {
		return total;
	}

	static void remove(int n) {
		total-=n;
	}
	
	Student(String name){
		this.name=name;
		total++;
	}
	
	void showInfo() {
		String msg="%s (학급: %d명)\n\n";
		System.out.printf(msg, this.name, total);	
		//name=this.name, total=Student.total
		//★static에는 this가 붙을 수 없음!
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		System.out.println("학급 수: "+Student.getTotal()+"명\n");		//0명
		
		Student hong=new Student("홍길동");
		System.out.println("학급 수: "+Student.getTotal()+"명\n");		//1명
		
		Student kim=new Student("김민지");
		Student lee=new Student("이진호");
		System.out.println("학급 수: "+Student.getTotal()+"명\n");		//3명
		
		hong.showInfo();		//홍길동 (학급: 3명)
		kim.showInfo();			//김민지 (학급: 3명)
		lee.showInfo();			//이진호 (학급: 3명)
		
//		★※인스턴스의 참조가 사라지면 인스턴스는 메모리에서 제거됨 → garbage collector!!!!
//		- 가비지 컬렉터라는 녀석이 위의 역할을 수행함
		
		hong=null;
		Student.remove(2);
		System.out.println("학급 수: "+Student.getTotal()+"명\n");		
//		학생 한명이 제거되었지만 학생 수는 변함이 없음
//		- 자바에는 소멸자가 없기 떄문 → 사용자가 직접 코드를 작성해야 함
//		- 소멸자: 인스턴스가 제거될 때 실행되는 것
//		- 소멸자를 잘못쓰면 오류가 발생할 수 있음 → ex) 아이템 제거했는데 계정이 삭제됨 →→이러한 오류때문에 자바에서는 현재 소멸자가 제거된 상태
		
	}
}