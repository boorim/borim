package kr.ac.kopo.day04;

import java.util.Scanner;

/*
  단을 입력받아 해당 구구단을 출력하는 코드를 작성
  2 - 9 : 7
  *** 7단 ***
  7 * 1 = 7
  7 * 2 = 14
  7 * 3 = 21
  ...
  7 * 9 = 63
 */

public class Pra20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요 : ");
		int i = sc.nextInt();
		System.out.println("-----" + i + "단-----" );
		
		for(int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i*j));
			} 
	}
}
	

