package kr.ac.kopo.day04;

/*
  *****
  _****
  __***
  ___**
  ____* 5���� ��� ���� ����
 */

public class Pra09 {

	public static void main(String[] args) {

	//	���2
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) { // 16,17,18 for���� ������ ������ J�� �� ����ϴ� ���� ���� (=����� ����)
				System.out.print('*');
			}
			System.out.println();
		}
	}
} 
		
	// *���2
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