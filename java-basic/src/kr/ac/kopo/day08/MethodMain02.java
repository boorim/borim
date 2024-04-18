package kr.ac.kopo.day08;

public class MethodMain02 {

	static void printStar(char ch, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();

	}

	public static void main(String[] args) {

		printStar('*', 10); // 첫번째 *을 저장하기 위해 char 변수 사용, 두번째 10을 저장하기 위해 int 변수 사용
		System.out.println("Hello");
		printStar('!', 5);
		System.out.println("Hi");
		printStar('-', 20);
		System.out.println("Good-bye");
		printStar('@', 3);
	}
}
