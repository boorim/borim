package kr.ac.kopo.day09;

public class Member02 {

public class Member2 {
	String 	name;
	int 	age;
	String 	bloodType;
	
	Member2() {
		name 	  = "�˼�����";
		age 	  = -1;
		bloodType = "�˼�����";
	}
	
	Member2(String name) {
		this.name = name;
		this.age = -1;
		this.bloodType = "�˼�����";
	}
	
	Member2(String name, int age) {
		this.name = name;
		this.age = age;
		this.bloodType = "�˼�����";
	}
	
	Member2(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("�̸� : " + name 
				+ ", ���� : " + age + ", ������ : " + bloodType);
	}
}
}
