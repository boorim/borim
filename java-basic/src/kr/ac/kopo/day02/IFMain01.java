package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * �����ϰ� �ִ� å�Ǽ� �Է� : 1
 * 1 book
 * 
 * �����ϰ� �ִ� å�Ǽ� �Է� : 4
 * 4 books
 * 
 * �����ϰ� �ִ� å�Ǽ� �Է� : 0
 * �����ϰ� �ִ� å ����
 */
public class IFMain01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ϰ� �ִ� å �Ǽ� : " );
		int book = sc.nextInt();
		
		
		if(book == -34){System.out.println("�߸��Է��߽��ϴ�.");}
		else if(book == 0) {System.out.println("�����ϰ� �ִ� å ����");}
		else if(book <= 1){System.out.println(book + " book"); } 
		else if(book > 1) {
			System.out.println(book + " books");
				}
			}
		}





