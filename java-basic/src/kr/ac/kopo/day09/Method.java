package kr.ac.kopo.day09;

public class Method {

	void call() {
		System.out.println("call() �޼ҵ� ȣ��..."); // �޼ҵ� Ŭ������ ���ǵǾ� �ִ� call �޼ҵ�
		                                          // �޼ҵ带 ���� �ν��Ͻ� ��ü ����
	}
	
	void call(int i) {
		System.out.println("call(int) �޼ҵ� ȣ��...");
	}
	
	void call(String s) {
		System.out.println("call(String) �޼ҵ� ȣ��...");
	}
	
	void call(double d) {
		System.out.println("call(double) �޼ҵ� ȣ��...");
	}
}
