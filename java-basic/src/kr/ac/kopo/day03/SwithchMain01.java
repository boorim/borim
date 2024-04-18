package kr.ac.kopo.day03;

import java.util.Random;

/*
 * 1 입력시 -> "ONE"
 * 2 입력시 -> "TWO"
 * 3 입력시 -> "THREE"
 * 그 외 -> "ERROR"
 */

public class SwithchMain01 {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(5) + 1; // 0+1 ~ 4+1 => 1 ~ 5
		//r.nextInt( 이 부분의 숫자가 변경되면 switch num의 값이 변경)
		
		switch(num) {
		case 1 : 
			System.out.println("ONE");
			break;
			
		case 2 :
			System.out.println("TWO");
			break;
			
		case 3 :
			System.out.println("THREE");
			break;
			
		default:
			System.out.println("ERROR");
			break;
		}
	}

}
