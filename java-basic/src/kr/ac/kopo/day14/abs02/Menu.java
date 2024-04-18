package kr.ac.kopo.day14.abs02;

import java.util.Scanner;

public class Menu {

	public void process() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("v2. ����� �����͸� �����ϼ���(1. LG  2. �Ｚ) => ");
		String type = sc.nextLine();
		
		Printer p = null;
		switch(type) {
		case "1" :
			p = new LGPrinter();
			break;
		case "2" :
			p = new SamsungPrinter();
			break;
		case "3" :
			p = new HPPrinter();
			break;
		default:
			System.out.println("�߸������ϼ̽��ϴ�");
		}
		if(p != null) {
			p.print();
		}
	}
}