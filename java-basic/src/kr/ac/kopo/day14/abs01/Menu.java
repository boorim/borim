package kr.ac.kopo.day14.abs01;

import java.util.Scanner;

public class Menu {

	public void process() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �����͸� �����ϼ���(1. LG    2. �Ｚ) => ");
		String type = sc.nextLine();
		
		switch(type) {
		case "1" :
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case "2" :
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
			break;
		default:
			System.out.println("�߸������ϼ̽��ϴ�");
		}
		
	}
}