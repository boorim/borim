package kr.ac.kopo.day05;

public class ContinueMain {

	public static void main(String[] args) {

	/*	for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("A");
				if (j > i) {
					break;
				}
				System.out.print("B");
			}
			System.out.println();
		}
	}
} */
		
		
/*		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("A");
				if (j > i) {
					continue;
				}
				System.out.print("B");
			}
			System.out.println();
		}
	}
} */
		
		
		loop01 : for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("A");
				if (j > i) {
					break loop01; //loop01이라는 이름의 블록을 벗어난다.
				}
				System.out.print("B");
			}
			System.out.println();
		}
	}
}
