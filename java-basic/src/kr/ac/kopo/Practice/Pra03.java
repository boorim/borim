package kr.ac.kopo.Practice;
/*
   3. ����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ� 1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
      ex.
      ���� ���� : 5
      1 2 3 4 5
 */

import java.util.Scanner;

public class Pra03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� : ");
		int num = sc.nextInt();
		int [] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
	}
}
