package kr.ac.kopo.day02;

import java.util.Scanner;

public class Test306_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("ù��° ���� : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println("�ι�° ���� :");
		int b =sc.nextInt();
		sc.nextLine();
		
		System.out.println("����° ���� : ");
		int c = sc.nextInt();
		sc.nextLine();
		
		int max = a;
		int min = b;
		if(b > a) { 
			max = b;
			min = a;
		}
		if(c > max) {
			System.out.printf("%d > %d > %d\n", c, max, min);
		} else if (c > min) {
			System.out.printf("%d > %d > %d\n", max, c, min);
			} else {
				System.out.printf("%d > %d > %d\n", max, min, c);
			}
			}
		
	//	if(a > b && b > c)
		
		
		
		
/*		int max;
		if(a >= b && a >= c) { max = a;
		} 
		else if(b >= a && b >= c) { max = b;
		}
		else max = c;
		System.out.println("���� ū ������ �ۼ��ϸ� " + max + "�Դϴ�."); */
		
	}

