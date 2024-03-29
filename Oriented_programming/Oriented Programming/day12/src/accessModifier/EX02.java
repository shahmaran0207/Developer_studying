package accessModifier;

/*
	public 클래스는 import로 불러와서 언제든 사용 가능
	패키지를 만드는 이유: 공통된 클래스를 묶어서 사용하기 위함	+	클래스의 이름충돌을 막기 위함
*/

import other.Animal;

public class EX02 {
	public static void main(String[] args) {
		Animal an=new Animal();
		
		System.out.println("an= "+an);
		
		
	}
}