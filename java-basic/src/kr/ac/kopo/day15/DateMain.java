package kr.ac.kopo.day15;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
	
		Date d = new Date();
		
		System.out.println(d);
		
		// 오늘은 2024년 3월 25일 월요일입니다
		
		int year = d.getYear() + 1900; // 1900년 부터 잘라져 있는 값이 출력되기 때문에 +1900을 해야 해당 년도가 출력됨
		int month = d.getMonth() + 1; //1을 더하는 이유는 0~11 사이의 숫자가 리턴되고, 0이 1월을 뜻하기 때문에 +1을 해야 해당 달이 출력됨
		int date = d.getDate();
		int day = d.getDay(); // 0~6까지의 숫자가 리턴, 0이 일요일로 시작
		
		String [] dateArr = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일 " + dateArr[day] + "요일입니다.");
	}
} 