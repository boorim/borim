package kr.ac.kopo.day09;

import java.util.Scanner;

public class GugudanUtil { // Util�� �ٿ��� -> ��ɵ鸸 ��Ƴ��� ���Ŭ���� = �ٸ� ���� ��ƿŬ����

	/**
	      ȣ���ڰ� �Ѱ��� �� ����(���۴�, �����) ������ �������� ����ϴ� ����� ����� ����
	      @param startDan  ���۴�
	      @param endDan    �����
	**/
	void print(int startDan, int endDan) {
		for(int dan = startDan; dan <= endDan; dan++) {
			print(dan);
		}
	}

	/**
	 * 2 ~ 9�ܱ����� �������� ����ϴ� ���
	 */
	void print() {
		for(int dan = 2; dan <= 9; dan++) {
			this.print(dan);
			}
		}
/*		void print() {
			print(2, 9);
			
	} */
	
	/**
	 * ȣ���ڰ� �Ѱ��� ���� �̿��Ͽ� �������� ����ϴ� ���
	 */
	void print(int dan) {
		System.out.println("***" + dan + "�� ***");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
	
	/**
	 * Ű����� ���� �Է¹޾� ȣ���ڿ��� �����ϴ� ���
	 */
	int inputDan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		return dan;
	}
	int inputDan(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int dan = Integer.parseInt(sc.nextLine());
		
		return dan;
	}
}
