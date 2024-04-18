package kr.ac.kopo.day02;

import java.util.Scanner;

public class Test306_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("첫번째 정수 : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println("두번째 정수 :");
		int b =sc.nextInt();
		sc.nextLine();
		
		System.out.println("세번째 정수 : ");
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
		System.out.println("가장 큰 수부터 작성하면 " + max + "입니다."); */
		
	}

