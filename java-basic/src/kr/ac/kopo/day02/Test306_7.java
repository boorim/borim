package kr.ac.kopo.day02;

import java.util.Scanner;

public class Test306_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է�(���ĺ�) : ");
		
		char ch = sc.nextLine().charAt(0);
	//	if((int)ch >= 65 && (int)ch <= 90);
		
		System.out.println("�Է¹��� ���� : " + ch);
		if(ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch + 32);
			// 32�� 'a' - 'A'�� ���·� ��ȯ����
		} else if(ch >= 'a' && ch <= 'z') {
			ch = (char)(ch-32);
			// 32�� 'A' - 'a'�� ���·� ��ȯ ����
		}
		
		System.out.println("����� �� : " + ch);
		
	}
}
