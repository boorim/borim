package kr.ac.kopo.day06.homework;

import java.util.Random;

/*
    0 ~ 99 ������ ������ ������ 5�� �޾ƿ� ������ ���� ���
   < PRINT >
   93  5  10  57  36
   
   < REVER >
   63  75  1  50  39
 */

public class Pra02 {

	public static void main(String[] args) {

		Random r = new Random();
		int num = r.nextInt(99);
		int[] arr = new int[5]; // [0] ~ [4] ���� ���
		System.out.println("<PRINT>");

		for (int i = 0; i < arr.length; i++) { //���������� �������� �迭�� ���̷� �δ� ���� �� ȿ����
			arr[i] = r.nextInt(99);

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("<REVER>");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print((arr[i] % 10) * 10 + arr[i] / 10 + " ");
		}
		// num�� ���� 53�̶�� ������ 53/10=5 (53%10=3)*10

	}
}
