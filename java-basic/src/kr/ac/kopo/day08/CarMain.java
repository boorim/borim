package kr.ac.kopo.day08;

public class CarMain { // ����Ŭ����

	public static void main(String[] args) {

		Car c = new Car(); // �ν��Ͻ� ��ü�� ����� ����
		Car c2 = new Car();

		c.name = "���׽ý�";
		c.price = 8500;

		c2.name = "�ƹݶ�";
		c2.price = 4000;

		System.out.println("�ڵ����� : " + c.name + " " + "���� : " + c.price + "����");
		System.out.println("�ڵ����� : " + c2.name + " " + "���� : " + c2.price + "����");
	}
}
