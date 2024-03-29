package final_;

public class EX02 {
	public static void main(String[] args) {
//		final 변수에 값을 초기화 하지 않으면 최초 1번 값을 할당 가능	→ 같은 값이라도 입력할 수 없음
//		안쓴다고 해서 문제는 없음, 단, 사용하면 도움이 됨
		final int fn;
		fn=10;
		System.out.println("fn= "+fn);
		
//		상수로 주로 사용되는 원주율 PI
//		- 이 값이 변경(=훼손)되면 원에 관한 모든 연산이 잘못됨
//		- 따라서, 변경 불가능하게 잠금을 거는 역할
//		Math.PI=3.14;
		
		double r=6.7;
		double cir=Math.pow(r, 2)*Math.PI;
		System.out.println("cir= "+cir);
	}
}