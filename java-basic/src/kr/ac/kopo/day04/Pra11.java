package kr.ac.kopo.day04;

/* 다음 모양을 만드시오
   *
   **
   ***
   ****
   *****
   ****
   ***
   **
   *
 */

public class Pra11 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print('*');
				}

			} else {
				for (int j = 1; j <= 10 - i; j++) {
					System.out.print('*');
				}

			}
			System.out.println();
		}
	}

}
