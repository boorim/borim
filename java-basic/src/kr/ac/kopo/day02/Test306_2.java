package kr.ac.kopo.day02;

import java.util.Scanner;

public class Test306_2 {
	
	
	public static void main(String[] args) {
	
//2번문제
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("초를 입력 : ");
		int time = sc.nextInt();
		
		int hour = time/(60*60);
		int minutes = time%60;
		int second = time%60;
		
		System.out.println(hour + "시간" + minutes + "분" + second + "초");
		
	}
}

