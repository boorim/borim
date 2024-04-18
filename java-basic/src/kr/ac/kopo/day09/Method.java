package kr.ac.kopo.day09;

public class Method {

	void call() {
		System.out.println("call() 메소드 호출..."); // 메소드 클래스가 정의되어 있는 call 메소드
		                                          // 메소드를 통해 인스턴스 객체 생성
	}
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(String s) {
		System.out.println("call(String) 메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
}
