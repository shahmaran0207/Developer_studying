package collection;
/*
   로또 추첨기
   1 ~45사이의 숫자를 무작위로 출력
   단, 중복없이 6개
   결과는 항상 오름차순
 */

//import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
//Treeset: 처음부터 요소를 정렬해서 저장함
//역순 정렬하고 싶으면
//Comparator<Integer> desc;
//desc=(Integer o1, Integer o2)->{
//return o2-o1;
//};
//이 코드를 추가해서 바꿔줘야 함, Treeset<Integer>(desc)로 해주면 됨

class Tree{
   static void run(){
      Random ran=new Random();
      int toto;
      TreeSet<Integer> lotto=new TreeSet<Integer>();
      while(lotto.size()<6) {
         toto=ran.nextInt(45)+1;
         lotto.add(toto);
      }
      System.out.println("로또 번호: "+lotto);
   };
}

//class Tree{
//	Random ran=new Random();
//	private int toto;
//	TreeSet<Integer> lotto=new TreeSet<Integer>();
//
//	void run() {
//		while(lotto.size()<6) {
//			toto=ran.nextInt(45)+1; --> 이렇게 하면 toto의 값은 고정되므로 andom을 내부에 만들어줘야 함
//			lotto.add(toto);
//		}
//		System.out.println("로또 번호: "+lotto);
//	};
//}

public class Quiz1 {
   public static void main(String[] args) throws InterruptedException {
      Tree tree=new Tree();
      int num;
      
      Scanner sc=new Scanner(System.in);
      System.out.print("로또 장 수를 입력하세요: ");
      num=sc.nextInt();
      
      while(num>0) {
         TreeSet<Integer> lotto=new TreeSet<Integer>();
         Tree.run();
         num--;
         Thread.sleep(100);
      }
      sc.close();
   }
}