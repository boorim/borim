package BOJ;

import java.util.Scanner;

public class boj_1978 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0;
		int cnt2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1) {
				for (int j = 2; j <= arr[i]; j++) {
					if (arr[i] % j == 0) {
						cnt++;
					}
					if (cnt == 1) {
						cnt2++;
						cnt = 0;
					}
				}
			}
		}
		System.out.println(cnt2);
	}
}
