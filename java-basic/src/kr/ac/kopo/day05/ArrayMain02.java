package kr.ac.kopo.day05;

public class ArrayMain02 {

	public static void main(String[] args) {

		int[] arr = new int[5]; // [0] ~[4]까지만 접근이 가능

		// System.out.println("arr : " + arr); 배열의 주소값이 나와있지 않기 때문에 arr의 변화하는 주소값만 출력된다
		System.out.println("arr[0] : " + arr[0]);
		// System.out.println("arr[5] : " + arr[5]); 예외 발생-> 인덱스의 범위가 벗어났다는 예외 발생
		System.out.println("배열의 크기 : " + arr.length + "개");
		
		arr = new int[3];
		System.out.println("length : " + arr.length);
	}
}