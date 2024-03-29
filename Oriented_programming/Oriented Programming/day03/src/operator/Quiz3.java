package operator;
/*
 	현재 건물에 엘레베이터 2대가 존재 A는 7층, B는 9층에 있음
 	엘리베이터는 1~15층까지 있음
 	현재 사용자의 위치에 따라서 가까운 엘리베이터를 호출
 	단, 거리가 같으면 A를 호출
 	 ex) 현재 5층 --> A를 호출
 	 ex) 현재 10층 --> B를 호출
*/

//※디버깅: 코드가 제대로 작동하는지 체크하는 모든 과정 → 단순히 에러를 찾는 과정이 아님!
//★디버깅이 중요한 이유: GIGO(Garbage In Garbage out)
	//☆프로그램이 잘 만들어져 있어도, 부정확한 데이터가 입력되면 잘못된 결과를 얻게된다  → 입력값 검증이 중요함!!!

public class Quiz3 {
	public static void main(String[] args) {
		int A=7, B=9, cur=5;
		
		int A1=(A-cur<0)?-(A-cur):A-cur;
		int B1=(B-cur<0)?-(B-cur):B-cur;
		
		char elev=(A1<=B1)?'A':'B';
		System.out.println("A와의 거리 "+A1);
		System.out.println("B와의 거리 "+B1);
		System.out.printf("호출되는 엘리베이터는 %c입니다.\n", elev);
	}
}