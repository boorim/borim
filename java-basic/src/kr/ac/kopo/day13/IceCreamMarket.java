package kr.ac.kopo.day13;

import java.util.Scanner;

public class IceCreamMarket {

	private IceCream[] iceList;
	private Scanner sc = new Scanner(System.in);
	
	public int scanInt() {
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	public void open() {
		
		System.out.print("���̽�ũ�� � �����ҷ�? => ");
		int cnt = scanInt();
		
		iceList = new IceCream[cnt];
		
		for(int i = 0; i < iceList.length; i++) {
			System.out.println("** " + (i+1) + "��° ���̽�ũ�� �������� �Է� **");
			System.out.print("���̽�ũ���� : ");
			String name = sc.nextLine();
			System.out.print("���̽�ũ������ : ");
			int price = scanInt();
			
			iceList[i] = new IceCream(name, price);
		}
		
		printReceipt();
	}
	
	public void printReceipt() {
		System.out.println("---------------------------------------");
		System.out.println("\t�� " + iceList.length + "�� ���̽�ũ�� �������� ���");
		System.out.println("---------------------------------------");
		System.out.println("��ȣ\t���̽�ũ����\t���̽�ũ������");
		System.out.println("---------------------------------------");
		for(int i = 0; i < iceList.length; i++) {
			IceCream ice = this.iceList[i];
			System.out.printf("%3d\t%-10s\t%5d\n",
						i+1, ice.getName(), ice.getPrice());
		}
		System.out.println("---------------------------------------");
		
	}
}

