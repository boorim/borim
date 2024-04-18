package kr.ac.kopo.day06.homework;
/*
    1. ÃÑ 10°³ÀÇ Á¤¼ö¸¦ ÀÔ·Â¹Þ¾Æ ´ÙÀ½°ú °°ÀÌ Ãâ·ÂÇÏ¼¼¿ä
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
  
  < Â¦¼ö >
  4  64  82  22  62  22
  Â¦¼öÀÇ ÃÑÇÕ : XX

  < È¦¼ö >
  23  7  11  91
  È¦¼öÀÇ ÃÑÇÕ : XX
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
		System.out.println("<Â¦¼ö>");
		for (int i = 0; i < 10; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
				even += arr[i];
			}
		}
		System.out.println();
		System.out.println("Â¦¼öÀÇ ÃÑÇÕ : " + even);

		int odd = 0;
		System.out.println();
		System.out.println("<È¦¼ö>");
		for (int i = 0; i < 10; i++) {
			if (arr[i] % 2 == 1) {
				System.out.print(arr[i] + " ");
				odd += arr[i];
			}
		}

		System.out.println();
		System.out.println("È¦¼öÀÇ ÃÑÇÕ : " + odd);

	}

}
