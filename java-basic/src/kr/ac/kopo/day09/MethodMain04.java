package kr.ac.kopo.day09;

public class MethodMain04 {

	/*
	     키보드로 단을 입력,받아 호출자에 리턴 기능을 하고 싶음
	 */
	
	
	public static void main(String[] args) {
		
		GugudanUtil gu = new GugudanUtil();
		
		int dan = gu.inputDan();
		gu.print(dan);
		gu.print(); // boolean 
	}
}

