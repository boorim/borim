package kr.ac.kopo.day02;

import java.util.Scanner;

public class Test306_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영문자 모음의 아스키 코드 값 : ");
		char ch = sc.nextLine().charAt(0);
		int num = (int)ch;
		
		System.out.println(num);
		
	}
}
