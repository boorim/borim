package kr.ac.kopo.day02;

import java.util.Scanner;

public class Test306_2 {
	
	
	public static void main(String[] args) {
	
//2������
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("�ʸ� �Է� : ");
		int time = sc.nextInt();
		
		int hour = time/(60*60);
		int minutes = time%60;
		int second = time%60;
		
		System.out.println(hour + "�ð�" + minutes + "��" + second + "��");
		
	}
}

