package kr.ac.kopo.day04;

/*
  다음을 출력하시오
  *****
  ****
  ***
  **
  *
  **
  ***
  ****
  *****
 */

public class Pra12 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			if(i >= 3); {
				for(int j = 1; j <= i-2; j++) {
					System.out.print('*');
				} 
				
			}	 {
					for(int j = 1; j <= i-4; j++) {
							System.out.print('*');		
					}
				}
			} System.out.println();
		}

}
