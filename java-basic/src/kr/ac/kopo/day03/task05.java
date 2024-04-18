package kr.ac.kopo.day03;

import java.util.Scanner;

public class task05 {

	public static void main(String[] args) {
		
		/* 다음의 결과를 보이는 프로그램을 작성하시오
		2 - 10사이의 정수 입력 : 6
		< 1 ~ 100사이의 6의 배수 출력 >
		6  12  18 ... 90 96
		총 XX개 */

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2-10사이의 정수 입력 : ");
		int a = sc.nextInt();
		sc.nextLine(); //정수입력 후 엔터가 남아있기 때문에 그 엔터를 지우기 위한 목적
		
		// int a = Integer.parseInt(sc.nextLine());
		
		int cnt = 0; 
		System.out.println("< 1 ~ 100사이의 " + a + "의 배수 출력 >");
		for(int i = 1; i <= 100; i++) {
			if (i % a  == 0) {
				System.out.println(i + "  ");
				++cnt; // 변수를 찍을 때마다 증가
			}
		}
		
		System.out.println(); //결과값 출력 후 한 줄 띄기
		System.out.println("총 개수 : " + cnt + "개");
	}
}
