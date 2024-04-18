package kr.ac.kopo.Practice;

import java.util.Scanner;

public class New02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[8];
		for (int i = 0; i <= 8; i++) {
			num[i] = sc.nextInt();
		}

		int Max = num[0];
		int n = 1;
		for (int i = 0; i <= 8; i++) {
			if (num[i] > Max) {
				Max = num[i];
				n = i + 1;
			}
		}
		System.out.println(Max);
		System.out.println(num);
	}
}