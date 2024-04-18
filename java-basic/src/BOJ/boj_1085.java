package BOJ;

import java.util.Scanner;

public class boj_1085 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();

		int min = x;
		if (min > y) {
			min = y;
		}
		if (min > h - y) {
			min = h - y;
		}
		if (min > w - x) {
			min = w - x;
		}

		System.out.println(min);
	}
}
