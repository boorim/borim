package kr.ac.kopo.day02;

import java.util.Scanner;

public class Test306_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력(알파벳) : ");
		
		char ch = sc.nextLine().charAt(0);
	//	if((int)ch >= 65 && (int)ch <= 90);
		
		System.out.println("입력받은 문자 : " + ch);
		if(ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch + 32);
			// 32를 'a' - 'A'의 형태로 변환가능
		} else if(ch >= 'a' && ch <= 'z') {
			ch = (char)(ch-32);
			// 32를 'A' - 'a'의 형태로 변환 가능
		}
		
		System.out.println("변경된 값 : " + ch);
		
	}
}
