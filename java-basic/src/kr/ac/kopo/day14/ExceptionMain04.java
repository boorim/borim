package kr.ac.kopo.day14;

import java.util.Arrays;
import java.util.Random;

public class ExceptionMain04 {

	public static void main(String[] args) {

		System.out.println("---------------- start ------------------");

		try {
			Random r = new Random();
			int num = r.nextInt(3);
			System.out.println("추출된 난수 : " + num);
			System.out.println(10 / num);

			int[] nums = new int[3];
			nums[3] = 100;
			System.out.println(Arrays.toString(nums));

		} catch (Exception e) { // 묵시적형변환
			System.out.println("<충격> 예외가 발생했다 !!!!!!!!!!!" + e.getMessage());
			// ae.getMessage()는 어떤 이유로 오류가 발생했는지 친절하게 알려줌
		}

		System.out.println("------------------ end ------------------");
	}
}
