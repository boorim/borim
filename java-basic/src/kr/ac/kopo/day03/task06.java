package kr.ac.kopo.day03;
/*
 * 학생5명의 성적을 입력받아 학점을 출력하는 코드를 작성
	1's 성적 : 90
	90점의 학점은 A입니다
	
	2's 성적 : 37
	37점의 학점은 F입니다
	
	3's 성적 : 89
	89점의 학점은 B입니다
	
	4's 성적 : 1000
	잘못입력하셨습니다
	
	5's 성적 : 96
	96점의 학점은 A입니다
	
	성적을 입력받고 학점을 출력하는것이 반복하는 중
 */
import java.util.Scanner;

public class task06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "\'s 성적 입력 : ");
			int sco = sc.nextInt();
			sc.nextLine();

			if (sco > 100) {
				System.out.println("Error");
			}
			if (sco >= 90) {
				System.out.printf("%d\'s 학점은 A\n", sco);
				System.out.println();

			} else if (sco >= 80) {
				System.out.println(sco + "\'s 학점은 B 입니다");
				System.out.println();

			} else if (sco >= 70) {
				System.out.println(sco + "\'s 학점은 C 입니다");
				System.out.println();

			} else if (sco >= 60) {
				System.out.println(sco + "\'s 학점은 D 입니다");
				System.out.println();

			} else if (sco >= 0) {
				System.out.println(sco + "\'s 학점은 F 입니다");
				System.out.println();

			} else {
				System.out.println("ERROR");

			}
		}
	}
}
