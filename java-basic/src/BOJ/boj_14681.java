package BOJ;

import java.util.Scanner;

public class boj_14681 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		if (X > 0 && Y > 0) {
			System.out.println(1);
		}
		if (X > 0 && Y < 0) {
			System.out.println(4);
		}
		if (X < 0 && Y < 0) {
			System.out.println(3);
		}
		if (X < 0 && Y > 0) {
			System.out.println(2);
		}
	}
}
