package kr.ac.kopo.day05;

import java.util.Scanner;

/*
   ù��° ���� : 23
   �ι�° ���� : 15
   ����° ���� : 83
   
   <���>
   23  15  83
 */

public class ArrayMain01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("ù��° ���� : "); int num = sc.nextInt();
		 * 
		 * System.out.println("�ι�° ���� : "); int num2 = sc.nextInt();
		 * 
		 * System.out.println("����° ���� : "); int num3 = sc.nextInt();
		 * 
		 * System.out.println("<���>"); System.out.println(num + " " + num2 + " " +
		 * num3); } }
		 */

		int[] arr = new int[3]; // int 3��¥�� ���� ���鷡 // arr[0] ~ arr[2] arr.length : 3

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "��° ���� : ");
			arr[i] = sc.nextInt();

		}
		System.out.println("���");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}