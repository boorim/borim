package kr.ac.kopo.day04;

import java.util.Scanner;

public class Pra22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���۴� : ");
		int start = sc.nextInt();
		
		System.out.println("����� : ");
		int end = sc.nextInt();
		
		System.out.println("-----" + start +  "�� -----");
	
		for(int i = start; i <= end; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
		}
	}
	
}
