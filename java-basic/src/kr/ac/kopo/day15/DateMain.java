package kr.ac.kopo.day15;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
	
		Date d = new Date();
		
		System.out.println(d);
		
		// ������ 2024�� 3�� 25�� �������Դϴ�
		
		int year = d.getYear() + 1900; // 1900�� ���� �߶��� �ִ� ���� ��µǱ� ������ +1900�� �ؾ� �ش� �⵵�� ��µ�
		int month = d.getMonth() + 1; //1�� ���ϴ� ������ 0~11 ������ ���ڰ� ���ϵǰ�, 0�� 1���� ���ϱ� ������ +1�� �ؾ� �ش� ���� ��µ�
		int date = d.getDate();
		int day = d.getDay(); // 0~6������ ���ڰ� ����, 0�� �Ͽ��Ϸ� ����
		
		String [] dateArr = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		System.out.println("������ " + year + "�� " + month + "�� " + date + "�� " + dateArr[day] + "�����Դϴ�.");
	}
} 