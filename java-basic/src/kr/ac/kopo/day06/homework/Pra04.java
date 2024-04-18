package kr.ac.kopo.day06.homework;
/*
  짝수를 5개 입력받아 출력하는 코드 작성
  num1 : 24
  num2 : 95
  num2 : 67
  num2 : 68
  num3 : 12
  num4 : 78
  num5 : 3
  num5 : 1
  num5 : 125
  num5 : 34
  
  < PRINT >
  24  68  12  78  34
 */

import java.util.Scanner;

public class Pra04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = 1;
		int[] arr = new int[5];

		while (cnt < 5) {
			System.out.printf("%d번째 정수 : ", cnt);
			arr[cnt] = sc.nextInt();

			while (cnt < 5) {
				System.out.printf("%d번째 정수 : ", cnt + 1);
				arr[cnt] = sc.nextInt();
				if (arr[cnt] % 2 == 0) {
					cnt++;

				}
			}

			System.out.println();

			System.out.println("< 5개의 짝수 출력 >");

			for (int i = 0; i < 5; i++) {
				System.out.print(arr[i] + "  ");
			}

		}
	}
}