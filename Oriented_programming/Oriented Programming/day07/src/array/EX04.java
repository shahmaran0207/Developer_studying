package array;
/*
 	배열은 초기화하지 않으면 기본값으로 초기화 됨
 	각 타입의 기본 값은 아래와 같다.
 	
 	1. boolean: false
 	2. char: '\0'
 	3. 정수: 0
 	4. 실수: 0.0
 	5. 클래스: null
 */

import java.util.Arrays;

public class EX04 {
	public static void main(String[] args) {
		boolean[] bos=new boolean[3];
		char[] chs=new char[4];
		int[] its=new int[6];
		double[] dbs=new double[2];
		String[] sts=new String[3];
		
		System.out.println("bos= "+Arrays.toString(bos));
		System.out.println("chs= "+Arrays.toString(chs));
		System.out.println("its= "+Arrays.toString(its));
		System.out.println("dbs= "+Arrays.toString(dbs));
		System.out.println("sts= "+Arrays.toString(sts));
	}
}