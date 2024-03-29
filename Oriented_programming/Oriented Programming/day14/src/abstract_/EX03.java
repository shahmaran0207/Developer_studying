package abstract_;

import other.Animal;

class Cat extends Animal{
	public Cat(String type) {
		super(type);
	}

	@Override
	public void bark() {
		System.out.println("냐옹냐옹");
	}
}

class Dog extends Animal{
	public Dog(String type) {
		super(type);
	}

	@Override
	public void bark() {
		System.out.println("멍멍");
	}
}

public class EX03 {
	public static void main(String[] args) {
		Cat cat=new Cat("페르시안");
		Dog dog=new Dog("말티즈");

		//		동물들 집합!
		Animal ani[]=new Animal[] {cat, dog};

		for(int i=0; i<ani.length; i++) {
			ani[i].bark();
		}
		
//		동물 친구들 밥먹자
		for(int i=0; i<ani.length; i++) {
			ani[i].eat("사료");
		}

//		이는 명령을 개별로 내렸으니 다형성이 아님
//		- 다형성이 아닌, 그냥 다르게 실행한 것
		ani[0].eat("츄르");
		ani[1].eat("개껌");
		
//		다형성은 한 명령어로 전부 실행이 되어야 함
//		다형성은 동일한 조건으로 실행되는데 다르게 수행되는 것을 의미
//		따라서, 상속과 오버라이드가 반드시 필요함
	}
}