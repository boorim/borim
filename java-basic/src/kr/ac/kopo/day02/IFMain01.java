package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 보유하고 있는 책권수 입력 : 1
 * 1 book
 * 
 * 보유하고 있는 책권수 입력 : 4
 * 4 books
 * 
 * 보유하고 있는 책권수 입력 : 0
 * 보유하고 있는 책 없음
 */
public class IFMain01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보유하고 있는 책 권수 : " );
		int book = sc.nextInt();
		
		
		if(book == -34){System.out.println("잘못입력했습니다.");}
		else if(book == 0) {System.out.println("보유하고 있는 책 없음");}
		else if(book <= 1){System.out.println(book + " book"); } 
		else if(book > 1) {
			System.out.println(book + " books");
				}
			}
		}





