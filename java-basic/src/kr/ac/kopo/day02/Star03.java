package kr.ac.kopo.day02;

import java.util.Scanner;

public class Star03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= 2*n - 2*i + 1; j++) { 
				System.out.print('*');
			}
		
			System.out.println();
		}
	}
}