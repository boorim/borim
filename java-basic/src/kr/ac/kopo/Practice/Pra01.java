package kr.ac.kopo.Practice;

/*
   1. ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ� ������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
   ex.
   1 2 3 4 5 6 7 8 9 10
 */

public class Pra01 {

	public static void main(String[] args) {
		
		int [] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
