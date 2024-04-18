package kr.ac.kopo.day09;

public class ConstructorMain01 {


/*
 		생성자 특징
 		1. 클래스명 동일
 		2. 반환형 없음
 		3. 디폴트생성자 지원
 		   class내에 선언된 생성자가 없는경우 JVM 자동으로 지원해주는 생성자
 		   클래스명() {}
 		4. 생성자 오버로딩 지원
 		5. 속성 초기화
 */

public class ContructorMain01 {

	public static void main(String[] args) {
		
		new Car();
		new Car("소나타");
	}
}
}
