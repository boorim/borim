package kr.ac.kopo.day16.homework;

import java.util.Scanner;

public class CalendarView {

	private Scanner sc = new Scanner(System.in);
	/*
	private CalendarUtil util;
	
	public CalendarView() {
		util = new CalendarUtil();
	}
	*/
	public int scanInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}

	public void process() {
		
		CalendarUtil util = new CalendarUtil();
		
		while (true) {
			int type = scanInt("�׸��� �����ϼ���(1.Ư���⵵  2.Ư����  3.����) => ");

			switch (type) {
			case 1:
				int year = scanInt("�⵵�� �Է��ϼ��� : ");
				util.showByYear(year);
				break;
			case 2:
				year = scanInt("�⵵�� �Է��ϼ��� : ");
				int month = scanInt("���� �Է��ϼ��� : ");
				util.showByMonth(year, month);
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
			}
		}
	}
}
