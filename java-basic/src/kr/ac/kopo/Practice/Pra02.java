package kr.ac.kopo.Practice;

/*
    2. ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ� �������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
       ex.
       10 9 8 7 6 5 4 3 2 1
 */
public class Pra02 {

	public static void main(String[] args) {
		
		int [] arr = new int [10];
		
		int num = arr.length;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num;
			num--;
			
		} for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
