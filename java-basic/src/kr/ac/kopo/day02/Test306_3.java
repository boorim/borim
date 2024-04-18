package kr.ac.kopo.day02;

import java.util.Scanner;

public class Test306_3 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("반지름 입력 : ");
	
	int rad = sc.nextInt();
	
	Double wid = rad*rad*3.141592;
	
	System.out.println(wid);
	
	}
}
