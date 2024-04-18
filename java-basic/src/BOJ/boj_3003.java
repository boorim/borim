package BOJ;

import java.util.Scanner;

public class boj_3003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	

		int K = 1;
		int Q = 1;
		int R = 2;
		int B = 2;
		int N = 2;
		int P = 8;
		
		K = K - sc.nextInt();
		Q = Q - sc.nextInt();
		R = R - sc.nextInt();
		B = B - sc.nextInt();
		N = N - sc.nextInt();
		P = P - sc.nextInt();
		
		System.out.print(K + " ");
		System.out.print(Q + " ");
		System.out.print(R + " ");
		System.out.print(B + " ");
		System.out.print(N + " ");
		System.out.print(P);
		
	}
}
