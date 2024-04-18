package kr.ac.kopo.day09;

public class MethodMain04_1 {

	// 시작단과 종료단이 있는 구구단 출력하기
	
	
	public static void main(String[] args) {
		
		GugudanUtil gu = new GugudanUtil();
		
		int startDan = gu.inputDan("시작단을 입력 : ");
		int endDan = gu.inputDan("종료단을 입력 : ");
	//	gu.print(startDan, endDan);
		
		int dan = gu.inputDan();
		gu.print(dan);
		gu.print(); // boolean 
		
	}
}

