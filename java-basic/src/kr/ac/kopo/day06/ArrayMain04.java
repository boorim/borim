package kr.ac.kopo.day06;

public class ArrayMain04 {
	
	public static void main(String[] args) {

/*		int[] arr = new int[5]; // 5개의 정수를 갖고있는 배열이 만들어짐

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
		
		int[] arr = new int[] {10, 20, 30, 40, 50}; //뒤의 값을 지정시 new int뒤 []의 값을 지정하면 X
		// int[] arr= {10, 20, 30, 40, 50}; -> new int[] 생략하고 이렇게 써도 결과값은 동일하게 출력됨
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

