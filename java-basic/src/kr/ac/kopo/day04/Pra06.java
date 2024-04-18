package kr.ac.kopo.day04;

/* 
  56789
  45678
  34567
  23456
  12345
 */

public class Pra06 {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {
			for (int j = i; j <= i + 4; j--) {
				System.out.print(j+i);
			}
		}
		System.out.println();
	}
}
