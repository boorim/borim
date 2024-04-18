package kr.ac.kopo.day08;

/* 
    절차지향적 사고 방식으로 아래를 출력하세요
     **********
     Hello
     **********
     Hi
     **********
     Good-bye
     **********
 */

public class MethodMain01  { //호출자 

	static void printStar(int cnt) { //printStar한테 호출자는MethodMatin01이고, int cnt = 10, 5, 20, 17으로 초기화된다는 뜻
			// int cnt 호출자가 넘겨준 값을 피호출자가 사용하기 위한 매개체 용도 = 매개변수, 파라미터	
		for(int i = 0; i< cnt; i++) {
			System.out.print('*');
		}
		System.out.println();
	//	System.out.println("~~~~~~~~~~~~~"); 별을 10개 찍고 엔터를 찍는 PrintStar라는 함수를 만들거야 = 메소드의 정의부/선언부

	}
	public static void main(String[] args) { //printStar가 갖고 있는 함수를 수행해줘 = 메소드 호출(반환형 없애)
			
/*		printStar(); //printStar가 갖고 있는 문장을 수행해 -> 16,17열의 문장을 수행 후 다시 22열로 반환
		System.out.println("Hello");
		printStar();
		System.out.println("Hi"); // 피호출자 매소드
		printStar();
		System.out.println("Good-bye"); 
		printStar();  
		
		*/
		
		printStar(10); 
		System.out.println("Hello");
		printStar(5);
		System.out.println("Hi"); // 피호출자 매소드
		printStar(20);
		System.out.println("Good-bye"); 
		printStar(17);
	}
}
