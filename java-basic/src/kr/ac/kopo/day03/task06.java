package kr.ac.kopo.day03;
/*
 * �л�5���� ������ �Է¹޾� ������ ����ϴ� �ڵ带 �ۼ�
	1's ���� : 90
	90���� ������ A�Դϴ�
	
	2's ���� : 37
	37���� ������ F�Դϴ�
	
	3's ���� : 89
	89���� ������ B�Դϴ�
	
	4's ���� : 1000
	�߸��Է��ϼ̽��ϴ�
	
	5's ���� : 96
	96���� ������ A�Դϴ�
	
	������ �Է¹ް� ������ ����ϴ°��� �ݺ��ϴ� ��
 */
import java.util.Scanner;

public class task06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "\'s ���� �Է� : ");
			int sco = sc.nextInt();
			sc.nextLine();

			if (sco > 100) {
				System.out.println("Error");
			}
			if (sco >= 90) {
				System.out.printf("%d\'s ������ A\n", sco);
				System.out.println();

			} else if (sco >= 80) {
				System.out.println(sco + "\'s ������ B �Դϴ�");
				System.out.println();

			} else if (sco >= 70) {
				System.out.println(sco + "\'s ������ C �Դϴ�");
				System.out.println();

			} else if (sco >= 60) {
				System.out.println(sco + "\'s ������ D �Դϴ�");
				System.out.println();

			} else if (sco >= 0) {
				System.out.println(sco + "\'s ������ F �Դϴ�");
				System.out.println();

			} else {
				System.out.println("ERROR");

			}
		}
	}
}
