package kr.ac.kopo.day03;

import java.util.Scanner;

public class task05 {

	public static void main(String[] args) {
		
		/* ������ ����� ���̴� ���α׷��� �ۼ��Ͻÿ�
		2 - 10������ ���� �Է� : 6
		< 1 ~ 100������ 6�� ��� ��� >
		6  12  18 ... 90 96
		�� XX�� */

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2-10������ ���� �Է� : ");
		int a = sc.nextInt();
		sc.nextLine(); //�����Է� �� ���Ͱ� �����ֱ� ������ �� ���͸� ����� ���� ����
		
		// int a = Integer.parseInt(sc.nextLine());
		
		int cnt = 0; 
		System.out.println("< 1 ~ 100������ " + a + "�� ��� ��� >");
		for(int i = 1; i <= 100; i++) {
			if (i % a  == 0) {
				System.out.println(i + "  ");
				++cnt; // ������ ���� ������ ����
			}
		}
		
		System.out.println(); //����� ��� �� �� �� ���
		System.out.println("�� ���� : " + cnt + "��");
	}
}
