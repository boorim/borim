package kr.ac.kopo.day08;

class Handphone { //접근제한자가 없음. 다른 class 안에 다른 class 생성은 접근제한자 붙이면 오류
	String name;
	String phoneNumber;
	String company;
}

public class HandphoneMain {

	public static void main(String[] args) {

		Handphone hp = new Handphone();
		hp.name = "김길동";
		hp.phoneNumber = "010-1111-1111";
		hp.company = "아이폰";

		Handphone hp2 = new Handphone();
		hp2.name = "김둘리";
		hp2.phoneNumber = "010-2222-2222";
		hp2.company = "모토로라";

		/*
		 * System.out.println("사용자명 : " + hp.name); System.out.println("전화번호 : " +
		 * hp.phoneNumber); System.out.println("기종 : " + hp.company);
		 * System.out.println();
		 * 
		 * System.out.println("사용자명 : " + hp2.name); System.out.println("전화번호 : " +
		 * hp2.phoneNumber); System.out.println("기종 : " + hp2.company);
		 */

		Handphone[] hpArr = { hp, hp2 };

		for (int i = 0; i < hpArr.length; i++) {
			System.out.println(
					"사용자명 : " + hpArr[i].name + " 전화번호 : " + hpArr[i].phoneNumber + " 기종 : " + hpArr[i].company);
		}

	}
}

