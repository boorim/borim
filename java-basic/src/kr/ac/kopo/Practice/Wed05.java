package kr.ac.kopo.Practice;

import java.util.Scanner;

public class Wed05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(fact(n));
	}
	public static long fact(long n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}
}
