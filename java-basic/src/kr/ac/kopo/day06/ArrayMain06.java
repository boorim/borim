package kr.ac.kopo.day06;

import java.util.Arrays;

public class ArrayMain06 {

	public static void main(String[] args) {

		String[] strArr = { "��", "����" };
		String[] strArr2 = { "����", "�ܿ�" };

		// String[] strArr3 = strArr + strArr; // �ϰ��� �ϴ� �� but �ּҸ� 2�� ��ĥ �� ���� / 
		// 4���� ���Ұ� �ʿ�

		String[] strArr3 = new String[strArr.length + strArr2.length];
		// System.out.println(Arrays.toString(strArr3));

		/*
		 * strArr3[0] = strArr[0]; 
		 * strArr3[1] = strArr[1]; 
		 * strArr3[2] = strArr2[0];
		 * strArr3[3] = strArr2[1]; System.out.println(Arrays.toString(strArr3));
		 */

		int loc = 0;
		for (int i = 0; i < strArr.length; i++) {
			strArr3[loc++] = strArr[i];
		}
		for (String season : strArr2) {
			strArr3[loc++] = season;
		}
		System.out.println(Arrays.toString(strArr3));

	}
}
