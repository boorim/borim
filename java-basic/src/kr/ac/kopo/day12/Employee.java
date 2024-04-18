package kr.ac.kopo.day12;

public class Employee {

	String name;
	int salary;
	static int empTotal;
	
	Employee() {
		Employee.empTotal++;
	}
}
