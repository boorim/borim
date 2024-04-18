package kr.ac.kopo.Practice;

import java.util.Scanner;

public class Wed04 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			
			for(int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + (i*j));
				} 
		}
	}

