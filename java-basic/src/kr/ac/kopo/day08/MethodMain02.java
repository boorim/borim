package kr.ac.kopo.day08;

public class MethodMain02 {

	static void printStar(char ch, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();

	}

	public static void main(String[] args) {

		printStar('*', 10); // ù��° *�� �����ϱ� ���� char ���� ���, �ι�° 10�� �����ϱ� ���� int ���� ���
		System.out.println("Hello");
		printStar('!', 5);
		System.out.println("Hi");
		printStar('-', 20);
		System.out.println("Good-bye");
		printStar('@', 3);
	}
}
