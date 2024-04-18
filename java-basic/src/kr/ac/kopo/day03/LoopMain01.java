package kr.ac.kopo.day03;

public class LoopMain01 {

	public static void main(String[] args) {
		
		
		System.out.println("====== start ======");
		
		int cnt = 1;
		while(cnt <= 10) {
			System.out.println("안녕하세요");
			++cnt;
		}
		// System.out.println("cnt = " + cnt);  -> 실행되지 않음. CNT가 FOR문 안에서 시행되었기 때문에
		System.out.println("====== end ======");
		
		}
	}
