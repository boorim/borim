package kr.ac.kopo.day08;

public class MethodMain03 {

	// ȣ���� : main(), ��ȣ���� : getSum()
	static int getSum(int a, int b) { // �Ʒ��� int a, int b�� �ٸ� ����, �������� �����̱� ������ ���� ���� ���� ������ getSum�� �����ִ� ������ ��
		int sum = 0;
		while (a <= b) { // ������ 1�� 5�� �ɶ����� �ݺ��� ������ �� ~..~
			sum = sum + a++; // ���Ϸ��� ����� a�� = ��������
		}
		return sum;
	}
	
	public static void main(String[] args) {

		int a = 1, b = 5; // ���θ޼ҵ尡 ���� �ִ� ����
		int total = getSum(a, b);
		System.out.printf("%d ~ %d ������ ���� : %d\n", a, b, total);
		
		
		/*
		  int sum = 0; for(int i = a; i <= b; i++) 
		  { 
		  sum = sum + i;
		  } 
		  System.out.println("1~5������ ���� : " + sum);
		 */
	}
}
