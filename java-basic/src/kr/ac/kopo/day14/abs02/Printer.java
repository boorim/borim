package kr.ac.kopo.day14.abs02;

public abstract class Printer {

	public void copyright() {
		System.out.println("모든 저작권은 프린터협회에 있습니다.");
	}
	public abstract void print(); // 추상메소드
}
