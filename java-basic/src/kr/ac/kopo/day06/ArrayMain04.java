package kr.ac.kopo.day06;

public class ArrayMain04 {
	
	public static void main(String[] args) {

/*		int[] arr = new int[5]; // 5���� ������ �����ִ� �迭�� �������

	arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50; // arr[i] = i * 10  

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
} */
		
		int[] arr = new int[] {10, 20, 30, 40, 50}; //���� ���� ������ new int�� []�� ���� �����ϸ� X
		// int[] arr= {10, 20, 30, 40, 50}; -> new int[] �����ϰ� �̷��� �ᵵ ������� �����ϰ� ��µ�
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

