package kr.ac.kopo.day06.homework;

import java.util.Random;

/*
    0 ~ 99 사이의 임의의 정수를 5개 받아와 다음과 같이 출력
   < PRINT >
   93  5  10  57  36
   
   < REVER >
   63  75  1  50  39
 */

public class Pra02 {

	public static void main(String[] args) {

		Random r = new Random();
		int num = r.nextInt(99);
		int[] arr = new int[5]; // [0] ~ [4] 까지 출력
		System.out.println("<PRINT>");

		for (int i = 0; i < arr.length; i++) { //종료조건을 정수보단 배열의 길이로 두는 것이 더 효과적
			arr[i] = r.nextInt(99);

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("<REVER>");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print((arr[i] % 10) * 10 + arr[i] / 10 + " ");
		}
		// num의 값을 53이라고 가정시 53/10=5 (53%10=3)*10

	}
}
