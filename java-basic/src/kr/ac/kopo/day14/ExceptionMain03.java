package kr.ac.kopo.day14;

import java.util.Arrays;
import java.util.Random;

public class ExceptionMain03 {

	public static void main(String[] args) {

		System.out.println("---------------- start ------------------");

		try {
			Random r = new Random();
			int num = r.nextInt(3);
			System.out.println("����� ���� : " + num);
			System.out.println(10 / num);

			int[] nums = new int[3];
			nums[3] = 100;
			System.out.println(Arrays.toString(nums));

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) { // ae�� �����߻��� ����ϴ� ��ü
			System.out.println("<���> ���ܰ� �߻��ߴ� !!!!!!!!!!!" + ae.getMessage());
			// ae.getMessage()�� � ������ ������ �߻��ߴ��� ģ���ϰ� �˷���
		}

		System.out.println("------------------ end ------------------");
	}
}
