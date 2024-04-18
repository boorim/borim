package kr.ac.kopo.day17;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		System.out.println("add() 전 원소의 총 개수: " + set.size());
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");

		System.out.println("add() 후 원소의 총 개수: " + set.size());
		System.out.println("\"one\" 삽입여부 : " + set.add("one"));
		System.out.println("add() 후 원소의 총 개수 : " + set.size());
	}
}
