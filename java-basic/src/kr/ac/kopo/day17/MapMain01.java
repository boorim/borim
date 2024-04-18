package kr.ac.kopo.day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 	Map : key�� ���� �ߺ�(X), ����(X)
 	   - HashMap
 	   - TreeMap
 */

public class MapMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> members = new HashMap<String, String>();
		
		members.put("aaa", "1111");
		members.put("bbb", "2222");
		members.put("ccc", "3333");
		members.put("ddd", "4444");
		
		System.out.println("-----------------------");
		System.out.println("  ��й�ȣ ���� ����");
		System.out.println("-----------------------");
		System.out.print("���̵� �Է� : ");
		String id = sc.nextLine();
		if(!members.containsKey(id)) {
			System.out.println("�Է��Ͻ� ���̵�["+id+"] ȸ���� �������� �ʽ��ϴ�.");
			System.out.println("���񽺸� �����մϴ�");
			System.exit(0);
		}
		
		System.out.print("���� �н����带 �Է� : ");
		String password = sc.nextLine();
		
		if(!members.get(id).equals(password)) {
			System.out.println("�н����尡 �ùٸ��� �ʽ��ϴ�");
			System.out.println("���񽺸� �����մϴ�");
			System.exit(0);
		}
		
		System.out.print("������ �н����带 �Է� : ");
		String newPassword = sc.nextLine();
		members.put(id, newPassword);
		
		System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
		
		System.out.println("-------------------------");
		System.out.println("< ��ü ȸ�� ����Ʈ >");
		System.out.println(" ID\tPASSWORD");
		System.out.println("-------------------------");

		Set<String> keys = members.keySet();
		for(String key : keys) {
			System.out.println(key + "\t" + members.get(key));
		}
		
		/*
		Set<Entry<String, String>> entry = members.entrySet();
		for(Entry<String, String> e : entry) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		*/
	}
}