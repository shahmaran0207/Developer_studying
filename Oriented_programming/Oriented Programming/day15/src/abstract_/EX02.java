package abstract_;

import other.FlyAble;
import other.Animal;

interface Machine{}

//인터페이스만 단독으로 상속이 가능함
//또, 다중 상속이 가능
class Airplain implements FlyAble, Machine{
	@Override
	public void fly() {
		System.out.println("엔진으로 날아간다");
	}
}

public class EX02 {
	public static void main(String[] args) {
		Cat cat=new Cat();
		Dog dog=new Dog();
		Bird bird=new Bird();
		
		Airplain air=new Airplain();
		
		//동물들 모여라
		Animal[] anis=new Animal[] {cat, dog, bird};
		
		//날 수 있는 녀석들 모여라
		FlyAble[] flys=new FlyAble[] {bird, air};
		
		//동물들 울음소리
		for(int i=0; i<anis.length; i++) {
			anis[i].bark();
		}
		System.out.println();
		
		//날 수 있는 녀석들의 날기
		for(int i=0; i<flys.length; i++) {
			flys[i].fly();
		}
	}
}