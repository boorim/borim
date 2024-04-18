package BOJ;

import java.util.Scanner;

public class boj_1978_sec {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int tmp;
		int cnt = 0;

		for (int i = 0; i < num; i++) {
			tmp = sc.nextInt();

			for (int s = 2; s <= tmp; s++) {

				if (s == tmp) {
					cnt++;
				}
				if (tmp % s == 0) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}

