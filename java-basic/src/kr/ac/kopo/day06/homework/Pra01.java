package kr.ac.kopo.day06.homework;
/*
    1. �� 10���� ������ �Է¹޾� ������ ���� ����ϼ���
  num1 : 23
  num2 : 4
  num3 : 7
  num4: 11
  num5 : 64
  num6 : 82
  num7 : 22
  num8 : 62
  num9 : 22
  num10 : 91
  
  < ¦�� >
  4  64  82  22  62  22
  ¦���� ���� : XX

  < Ȧ�� >
  23  7  11  91
  Ȧ���� ���� : XX
 */

import java.util.Scanner;

public class Pra01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("num" + (i + 1) + " : ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		int even = 0;
		System.out.println("<¦��>");
		for (int i = 0; i < 10; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
				even += arr[i];
			}
		}
		System.out.println();
		System.out.println("¦���� ���� : " + even);

		int odd = 0;
		System.out.println();
		System.out.println("<Ȧ��>");
		for (int i = 0; i < 10; i++) {
			if (arr[i] % 2 == 1) {
				System.out.print(arr[i] + " ");
				odd += arr[i];
			}
		}

		System.out.println();
		System.out.println("Ȧ���� ���� : " + odd);

	}

}
