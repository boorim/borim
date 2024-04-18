package kr.ac.kopo.day04;

/* 다음 수를 출력하시오
  55555
  44444
  33333
  22222
  11111
 */

public class Pra02 {

	public static void main(String[] args) {
		
		for(int i = 5; i >= 1; i-- ) {
			for(int j = 5; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
