package kr.ac.kopo.day03;

import java.util.Random;

/*
 * 1 �Է½� -> "ONE"
 * 2 �Է½� -> "TWO"
 * 3 �Է½� -> "THREE"
 * �� �� -> "ERROR"
 */

public class SwithchMain01 {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(5) + 1; // 0+1 ~ 4+1 => 1 ~ 5
		//r.nextInt( �� �κ��� ���ڰ� ����Ǹ� switch num�� ���� ����)
		
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
