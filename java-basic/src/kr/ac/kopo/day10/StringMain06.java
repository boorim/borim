package kr.ac.kopo.day10;

public class StringMain06 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		String str = "";
		for (int i = 1; i < 100000; i++) {
			str += i;
		}
		long end = System.currentTimeMillis();

		System.out.println("�ҿ�ð� : " + (end - start) / 1000. + "��");

		System.out.println("------------------------");

		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < 100000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("�ҿ�ð� : " + (end - start) / 1000. + "��");

	}
	
}
