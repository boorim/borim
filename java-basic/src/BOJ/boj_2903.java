package BOJ;

import java.util.Scanner;

public class boj_2903 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
			
		double cnt = Math.pow(Math.pow(2, n) + 1, 2);
		
		System.out.println((int)cnt);
	}
}
