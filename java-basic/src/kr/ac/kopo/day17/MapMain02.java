package kr.ac.kopo.day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Car {
	private String no;
	private String model;
	
	public Car(String no, String model) {
		this.no = no;
		this.model = model;
	}
}

class Person extends Object {
	private String name;
	private String phone;

	public Person(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	

	/*
	@Override
	public boolean equals(Object obj) {
		
		if(this.name == null || this.phone == null)
			return false;
		
		Person p = (Person)obj;
		
		if(this.name.equals(p.name) 
				&& this.phone.equals(p.phone)) {
			return true;
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		return 9999999;
	}
	*/
	
	
}

public class MapMain02 {

	public static void main(String[] args) {

		Map<Person, Car> map = new HashMap<Person, Car>();
		
		map.put(new Person("ȫ�浿", "010-1111-2222"),
					new Car("12��3456", "�ҳ�Ÿ"));
		
		map.put(new Person("ȫ���", "010-3333-4444"), 
					new Car("34��5678", "��Ÿ��"));
		
		map.put(new Person("ȫ�浿", "010-5555-6666"), 
					new Car("55��2763", "���"));
		
		map.put(new Person("ȫ�浿", "010-1111-2222"),
					new Car("11��3333", "���׽ý�"));
		
		System.out.println("��ϵ� �������� : " + map.size());
	}
}
