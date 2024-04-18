package kr.ac.kopo.day05;

/*
   *-------*
   **-----**
   ***---***
   ****-****
   *********
   ****-****
   ***---***
   **-----**
   *-------*
   
 */
public class Operation04 {

	public static void main(String[] args) {

		int nStar = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(j <= nStar || j >= 10-nStar) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
			if(i < 5)
				nStar++;
			else
				nStar--;
		}
	}
}
