package kr.ac.kopo.day08;

/* 
    ���������� ��� ������� �Ʒ��� ����ϼ���
     **********
     Hello
     **********
     Hi
     **********
     Good-bye
     **********
 */

public class MethodMain01  { //ȣ���� 

	static void printStar(int cnt) { //printStar���� ȣ���ڴ�MethodMatin01�̰�, int cnt = 10, 5, 20, 17���� �ʱ�ȭ�ȴٴ� ��
			// int cnt ȣ���ڰ� �Ѱ��� ���� ��ȣ���ڰ� ����ϱ� ���� �Ű�ü �뵵 = �Ű�����, �Ķ����	
		for(int i = 0; i< cnt; i++) {
			System.out.print('*');
		}
		System.out.println();
	//	System.out.println("~~~~~~~~~~~~~"); ���� 10�� ��� ���͸� ��� PrintStar��� �Լ��� ����ž� = �޼ҵ��� ���Ǻ�/�����

	}
	public static void main(String[] args) { //printStar�� ���� �ִ� �Լ��� �������� = �޼ҵ� ȣ��(��ȯ�� ����)
			
/*		printStar(); //printStar�� ���� �ִ� ������ ������ -> 16,17���� ������ ���� �� �ٽ� 22���� ��ȯ
		System.out.println("Hello");
		printStar();
		System.out.println("Hi"); // ��ȣ���� �żҵ�
		printStar();
		System.out.println("Good-bye"); 
		printStar();  
		
		*/
		
		printStar(10); 
		System.out.println("Hello");
		printStar(5);
		System.out.println("Hi"); // ��ȣ���� �żҵ�
		printStar(20);
		System.out.println("Good-bye"); 
		printStar(17);
	}
}
