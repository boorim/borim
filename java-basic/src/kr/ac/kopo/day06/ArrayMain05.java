package kr.ac.kopo.day06;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
		
		// "2024년" "java" "교육" 문자열을 저장 <- 변수가 3개 필요
		
		String str = "2024년"; // 실제 동작은 String str = new String("2024년");이 올바른 방식
		String str2 = "java";
		String str3 = "교육";
		
		String[] strArr = {str, str2, str3};
		System.out.println("원소의 총 개수 : " + str.length());
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println("--------------------");
		
		for(String s : strArr) {
			System.out.println(s);
		}
		System.out.println("--------------------");
		System.out.println(Arrays.toString(strArr));
	}
}
