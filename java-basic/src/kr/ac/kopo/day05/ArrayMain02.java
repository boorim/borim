package kr.ac.kopo.day05;

public class ArrayMain02 {

	public static void main(String[] args) {

		int[] arr = new int[5]; // [0] ~[4]������ ������ ����

		// System.out.println("arr : " + arr); �迭�� �ּҰ��� �������� �ʱ� ������ arr�� ��ȭ�ϴ� �ּҰ��� ��µȴ�
		System.out.println("arr[0] : " + arr[0]);
		// System.out.println("arr[5] : " + arr[5]); ���� �߻�-> �ε����� ������ ����ٴ� ���� �߻�
		System.out.println("�迭�� ũ�� : " + arr.length + "��");
		
		arr = new int[3];
		System.out.println("length : " + arr.length);
	}
}