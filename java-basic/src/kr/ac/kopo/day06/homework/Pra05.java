package kr.ac.kopo.day06.homework;

import java.util.Scanner;

/*
  5. 1 ~ 100������ ������ �Է¹޾� �Է¹��� ������ ����� ���ϴ� ���α׷� �ۼ�

   1 ~ 100 ������ ���� �Է� : 82
   
   82 ����� ���� : 4��
   1  2  41  82
   
   1 ~ 100������ ���� �Է� : 48
   48 ����� ���� : 10��
   1  2  3  4  6  8  12  16  24  48
 */

public class Pra05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1~100 ������ ���� �Է� : ");
		int num = sc.nextInt();
		int cnt = 0;

		System.out.print(num + "�� ����� ���� : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				cnt++;
			}
		}
		System.out.println(" ");
		System.out.println("����� ���� : " + num);
	}
}
