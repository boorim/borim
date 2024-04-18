package kr.ac.kopo.day05;

import java.util.Scanner;

/*
   첫번째 정수 : 23
   두번째 정수 : 15
   세번째 정수 : 83
   
   <출력>
   23  15  83
 */

public class ArrayMain01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("첫번째 정수 : "); int num = sc.nextInt();
		 * 
		 * System.out.println("두번째 정수 : "); int num2 = sc.nextInt();
		 * 
		 * System.out.println("세번째 정수 : "); int num3 = sc.nextInt();
		 * 
		 * System.out.println("<출력>"); System.out.println(num + " " + num2 + " " +
		 * num3); } }
		 */

		int[] arr = new int[3]; // int 3개짜리 변수 만들래 // arr[0] ~ arr[2] arr.length : 3

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 정수 : ");
			arr[i] = sc.nextInt();

		}
		System.out.println("출력");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}