package kr.ac.kopo.day09;

public class Member {
	String name;
	int age;
	String bloodType;

	Member() {
		this.name = "�˼�����";
		this.age = -1;
		this.bloodType = "�˼�����";
	}

	Member(String name) {
		this.name = name;
		this.age = -1;
		this.bloodType = "�˼�����";
	}

	Member(String name, int age) {
		this(name, age, "�˼�����"); // this ������ - ���� this�����ڵ� ��ü ���� ����
	}

	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}

	void info() {
		System.out.println("�̸� : " + name + " ���� : " + age + " ������ : " + bloodType);
	}
}
