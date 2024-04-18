package kr.ac.kopo.day04;

/*
  *****
  _****
  __***
  ___**
  ____* 5줄을 찍는 것이 목적
 */

public class Pra09 {

	public static void main(String[] args) {

	//	방법2
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) { // 16,17,18 for문이 끝났기 때문에 J를 또 사용하는 것이 가능 (=대등적 관계)
				System.out.print('*');
			}
			System.out.println();
		}
	}
} 
		
	// *방법2
		/*for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				if(j < i) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}		*/