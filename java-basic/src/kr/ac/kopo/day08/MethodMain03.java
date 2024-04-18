package kr.ac.kopo.day08;

public class MethodMain03 {

	// 호출자 : main(), 피호출자 : getSum()
	static int getSum(int a, int b) { // 아래의 int a, int b와 다른 변수, 독립적인 변수이기 때문에 값이 같지 않음 위에는 getSum이 갖고있는 변수의 값
		int sum = 0;
		while (a <= b) { // 변수값 1이 5가 될때까지 반복문 돌리는 중 ~..~
			sum = sum + a++; // 더하려는 대상이 a값 = 후위증가
		}
		return sum;
	}
	
	public static void main(String[] args) {

		int a = 1, b = 5; // 메인메소드가 갖고 있는 변수
		int total = getSum(a, b);
		System.out.printf("%d ~ %d 사이의 총합 : %d\n", a, b, total);
		
		
		/*
		  int sum = 0; for(int i = a; i <= b; i++) 
		  { 
		  sum = sum + i;
		  } 
		  System.out.println("1~5사이의 총합 : " + sum);
		 */
	}
}
