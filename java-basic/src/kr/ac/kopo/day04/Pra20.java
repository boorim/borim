package kr.ac.kopo.day04;

import java.util.Scanner;

/*
  ���� �Է¹޾� �ش� �������� ����ϴ� �ڵ带 �ۼ�
  2 - 9 : 7
  *** 7�� ***
  7 * 1 = 7
  7 * 2 = 14
  7 * 3 = 21
  ...
  7 * 9 = 63
 */

public class Pra20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� : ");
		int i = sc.nextInt();
		System.out.println("-----" + i + "��-----" );
		
		for(int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i*j));
			} 
	}
}
	

