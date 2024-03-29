package input;
/*
Scanner 함수
1. next(): 문자열을 읽어온다.
2. next자료형(): 지정 자료형으로 읽어온다. 
*/

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		boolean bo;
		byte by;
		short sh;
		int it;
		long lo;
		float fl;
		double db;
		
		System.out.print("true / false: ");
		bo = sc.nextBoolean();
		System.out.println("bo = "+bo+"\n");

		System.out.print("byte: ");
		by = sc.nextByte();
		System.out.println("by = "+by+"\n");
		
		System.out.print("short: ");
		sh=sc.nextShort();
		System.out.println("sh = "+sh+"\n");

		System.out.print("int: ");
		it=sc.nextInt();
		System.out.println("in = "+it+"\n");
		
		System.out.print("long: ");
		lo=sc.nextLong();
		System.out.println("lo = "+lo+"\n");
		
		System.out.print("float: ");
		fl=sc.nextFloat();
		System.out.println("fl = "+fl+"\n");

		System.out.print("double: ");
		db=sc.nextDouble();
		System.out.println("db = "+db+"\n");
		
		sc.close();
	}
}
