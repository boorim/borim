package kr.ac.kopo.day02;

import java.util.Scanner;

public class Test306_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달러를 입력하세요 : ");
		
		int doll = sc.nextInt();
		double won = 1092.5;
		
		int exch = doll*(int)won;
		
		System.out.println(exch);
	}
}
