package kr.ac.kopo.Practice;

import java.util.Scanner;

/*
 
 ����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ� 
 �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���. 
 �׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ����ϼ���

 */

public class Pra07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : " );
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
		System.out.printf("�迭 %d��° �ε����� ���� �� : ",i);
		arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("�� �� : " + sum);
	}
	

}

