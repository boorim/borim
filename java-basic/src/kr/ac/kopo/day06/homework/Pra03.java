package kr.ac.kopo.day06.homework;

import java.util.Scanner;

/*
    학생 5명의 성적을 입력받아 다음과 같이 출력
  1's 성적 : 92
  2's 성적 : 66
  3's 성적 : 10000
  4's 성적 : -34
  5's 성적 : 88
  
  --------------------------
  번호	성적		학점     
  --------------------------
  1		92		A
  2		66		D
  3		ERROR!!!
  4		ERROR!!!
  5		88		B     
  --------------------------
  5회 입력 중 [2]회 에러발생
  총점 : 246점
  평균 : 49.20점
 */

public class Pra03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] score = new int[5]; // [0] ~ [4] 즉 score.length-1

		for (int i = 0; i < score.length; i++) {
			System.out.println(i + 1 + "\'s score : ");
			score[i] = Integer.parseInt(sc.nextLine());
		}
		
		int total = 0;
		/* total = score[0]~[4]까지 더한값
		for(int i = 0; i < score.length; i++) {
			total = total + score[i]; */
		
		System.out.println("<PRINT>");
		System.out.println("-------------------------");
		System.out.println("번호\t성적\t학점");
		System.out.println("-------------------------");
		
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 0 && score[i] <= 100) {
				
				total = total + score[i];
				
				System.out.println(i + 1 + "\t" + score[i]);
				
				char grade = 'F';
				switch (score[i] / 10) {
				case 10:
				case 9:
					grade = 'A';
					break;
				case 8:
					grade = 'B';
					break;
				case 7:
					grade = 'C';
					break;
				case 6:
					grade = 'D';
				}
				System.out.println(i + 1 + "\t" + score[i] + "\t" + grade);
			} else {
				System.out.println(i + 1 + "\tERROR!!!!!");
			}
		}
		System.out.println("-------------------------");
		System.out.println("총  점 : " + total + "점");
	//	System.out.printf("평  균 : %.2f점\n", total / 5.);
		System.out.printf("평  균 : %.2f점\n", (double)total / score.length);
	}
}
