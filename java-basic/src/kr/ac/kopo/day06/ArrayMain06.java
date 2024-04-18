package kr.ac.kopo.day06;

import java.util.Arrays;

public class ArrayMain06 {

	public static void main(String[] args) {

		String[] strArr = { "봄", "여름" };
		String[] strArr2 = { "가을", "겨울" };

		// String[] strArr3 = strArr + strArr; // 하고자 하는 것 but 주소를 2개 합칠 순 없음 / 
		// 4개의 원소가 필요

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
