package kr.ac.kopo.day12;


	import java.util.Random;
import java.util.Scanner;

	public class BB{
		

		public static void main(String[] args) {
			
			Random random = new Random();
			Scanner scanner = new Scanner(System.in);
			
			//���ӿ��� ����� ����
			int com1, com2, com3;		
			int user1, user2, user3;
			int randomCnt = 0;//�������� ī��Ʈ
			int gameCount = 0;//���� ī��Ʈ
			int strikeCnt=0, ballCnt=0;//��ũ����ũ,�� ī��Ʈ
			
			//������ü�ݺ�	
			while(true) {		
				//�ߺ����� �ʴ� 3���� ��������
				while(true) {
					//������� ������ �����Ǵ��� Ȯ��
					randomCnt++;				
					//1~9������ ��������
					com1 = random.nextInt(100) % 9 + 1;
					com2 = random.nextInt(100) % 9 + 1;
					com3 = random.nextInt(100) % 9 + 1;
					if(!(com1==com2 || com2==com3 || com3==com1)) {				
						//�ߺ����� �ʴ� ���� ������ �����ϸ� ����Ż��
						break;
					}
				}////while end
				
				//����Ȯ��
				System.out.println(randomCnt+"ȸ:"+com1+" "+com2+" "+com3);
				
				while(true) {
					//����ڷκ��� 3���� ������ �Է¹޴´�.
					System.out.println("3���������� �Է��ϼ���(1~9)");
					System.out.println("�����̽��� �����Ͻð� �������� Enter�� �����ּ���");				
					user1 = scanner.nextInt();
					user2 = scanner.nextInt();
					user3 = scanner.nextInt();
					
					//����ī��Ʈ 1ȸ ����
					gameCount++;
					
					//�Ǵ�1 - ��ũ����ũ(���ڿ� ��ġ���� ��ġ)
					if(com1==user1) strikeCnt++;
					if(com2==user2) strikeCnt++;
					if(com3==user3) strikeCnt++;
					
					//�Ǵ�2 - ��(���ڴ� ��ġ�ϳ� ��ġ�� �ٸ���)
					if(com1==user2 || com1==user3) ballCnt++;
					if(com2==user1 || com2==user3) ballCnt++;
					if(com3==user1 || com3==user2) ballCnt++;
					
					//���������Ǵ�
					if(strikeCnt==3) {
						System.out.println("3��Ʈ����ũ ��������");
						System.out.println(gameCount+"������ ���߼̽��ϴ�.");
						break;//����Ż��
					}
					else {
						//�ϳ��� �����ߴ� ���
						if(strikeCnt==0 && ballCnt==0) {
							System.out.println("�ƿ��Դϴ�");
						}
						else {
							System.out.printf("%d��Ʈ����ũ, %d��\n",
									strikeCnt, ballCnt);
						}
						//��Ʈ����ũ, �� ī��Ʈ �ʱ�ȭ
						strikeCnt = 0;
						ballCnt = 0;
						//continue���� �ʿ����.
					}
				}////while end
				
				System.out.println("�Ѱ��� �� �Ͻðڽ��ϱ�?(0:����,1:�����)");
				int restart = scanner.nextInt();
				if(restart==0) {
					//��������
					System.out.println("\n==������ ����Ǿ����ϴ�.==\n");
					//����Ǵ� ��� main�Լ��� ����ȴ�.
					System.exit(0);
				}
				else if(restart==1){
					//������ ������ϱ� ���� ī��Ʈ���� �ʱ�ȭ
					strikeCnt = 0;
					ballCnt = 0;
					gameCount = 0;
					System.out.println("\n==������ ������մϴ�.==\n");
				}
			}//���� ��ü �ݺ� while end
		}//main �޼��� end
	}//class ��

