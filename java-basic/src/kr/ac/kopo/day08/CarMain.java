package kr.ac.kopo.day08;

public class CarMain { // 실행클래스

	public static void main(String[] args) {

		Car c = new Car(); // 인스턴스 객체를 만들기 위함
		Car c2 = new Car();

		c.name = "제네시스";
		c.price = 8500;

		c2.name = "아반떼";
		c2.price = 4000;

		System.out.println("자동차명 : " + c.name + " " + "가격 : " + c.price + "만원");
		System.out.println("자동차명 : " + c2.name + " " + "가격 : " + c2.price + "만원");
	}
}
