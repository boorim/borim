package kr.ac.kopo.day09;

public class Member {
	String name;
	int age;
	String bloodType;

	Member() {
		this.name = "알수없음";
		this.age = -1;
		this.bloodType = "알수없음";
	}

	Member(String name) {
		this.name = name;
		this.age = -1;
		this.bloodType = "알수없음";
	}

	Member(String name, int age) {
		this(name, age, "알수없음"); // this 생성자 - 위의 this생성자들 전체 변경 가능
	}

	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}

	void info() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 혈액형 : " + bloodType);
	}
}
