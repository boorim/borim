package kr.ac.kopo.day06.homework;

import java.util.Scanner;

/*
  5. 1 ~ 100사이의 정수를 입력받아 입력받은 정수의 약수를 구하는 프로그램 작성

   1 ~ 100 사이의 정수 입력 : 82
   
   82 약수의 개수 : 4개
   1  2  41  82
   
   1 ~ 100사이의 정수 입력 : 48
   48 약수의 개수 : 10개
   1  2  3  4  6  8  12  16  24  48
 */

public class Pra05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1~100 사이의 정수 입력 : ");
		int num = sc.nextInt();
		int cnt = 0;

		System.out.print(num + "의 약수의 개수 : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				cnt++;
			}
		}
		System.out.println(" ");
		System.out.println("약수의 개수 : " + num);
	}
}
