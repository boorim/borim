package kr.ac.kopo.day09;

public class MethodMain03 {

	public static void main(String[] args) {
		Method m = new Method(); // 참조변수
		m.call();  // m(주체).(메소드/멤버변수)
		m.call(10); // error가 나는 이유 = 매개변수가 없는 부분이기 떄문에 error발생. 
		m.call("hello"); 
		m.call(12.34);
		m.call('A');
		
		System.out.println();
	}
}
