package kr.ac.kopo.day17;

import java.util.ArrayList;
import java.util.List;

/*
 	LIST Ư¡ - �ߺ�(O), ����(O)
 		- ArrayList
 		- LinkedList
 */
public class ListMain02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
//		List<String> list = new LinkedList<String>();
		
		System.out.println("add() �� ������ �� ���� : " + list.size());
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println("add() �� ������ �� ���� : " + list.size());
		list.add("one");
		System.out.println("add() �� ������ �� ���� : " + list.size());
		
		System.out.println("< ��ü ������ ��� >");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("\"seven\" ���翩�� : " + list.contains("seven"));
		System.out.println("\"two\" ���翩�� : " + list.contains("two"));
		list.remove("two");
		System.out.println("\"two\" ���翩�� : " + list.contains("two"));
		
		System.out.println("0������ ������ : " + list.get(0));
		list.add(0, "zero");
		System.out.println("0������ ������ : " + list.get(0));
		System.out.println("1������ ������ : " + list.get(1));
		
		if(list.isEmpty()) {
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�");
		}else {
			System.out.println("�����Ͱ� �����մϴ�");
		}
		
		list.clear();
		
		if(list.isEmpty()) {
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�");
		}else {
			System.out.println("�����Ͱ� �����մϴ�");
		}
	}
}
