package kr.ac.kopo.day08;

class Handphone { //���������ڰ� ����. �ٸ� class �ȿ� �ٸ� class ������ ���������� ���̸� ����
	String name;
	String phoneNumber;
	String company;
}

public class HandphoneMain {

	public static void main(String[] args) {

		Handphone hp = new Handphone();
		hp.name = "��浿";
		hp.phoneNumber = "010-1111-1111";
		hp.company = "������";

		Handphone hp2 = new Handphone();
		hp2.name = "��Ѹ�";
		hp2.phoneNumber = "010-2222-2222";
		hp2.company = "����ζ�";

		/*
		 * System.out.println("����ڸ� : " + hp.name); System.out.println("��ȭ��ȣ : " +
		 * hp.phoneNumber); System.out.println("���� : " + hp.company);
		 * System.out.println();
		 * 
		 * System.out.println("����ڸ� : " + hp2.name); System.out.println("��ȭ��ȣ : " +
		 * hp2.phoneNumber); System.out.println("���� : " + hp2.company);
		 */

		Handphone[] hpArr = { hp, hp2 };

		for (int i = 0; i < hpArr.length; i++) {
			System.out.println(
					"����ڸ� : " + hpArr[i].name + " ��ȭ��ȣ : " + hpArr[i].phoneNumber + " ���� : " + hpArr[i].company);
		}

	}
}

