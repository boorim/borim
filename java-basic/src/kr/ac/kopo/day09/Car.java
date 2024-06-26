package kr.ac.kopo.day09;

public class Car {
 /* 
   생성자 특징
   1. 클래스명 동일
   2. 반환형 없음
   3. 디폴트 생성자 지원
   class내에 선언된 생성자가 없는 경우 JVM 자동으로 지원해주는 생성자
   
  */
		
		Car() {
			System.out.println("디폴트 생성자 Car() 호출...");
		}
		
		Car(String s) {
			System.out.println("Car(String) 생성자 호출...");
		}
}
