package composite;

import java.util.ArrayList;

class Manager extends Employee {
	private ArrayList<Employee> subordinates = new ArrayList<Employee>();

	public Manager(String name, double salary) {
		super(name, salary);
	} 

	public void print() {
		System.out.println(super.name + ", $" + super.salary);

		this.subordinates.forEach((employee) -> employee.print());
	}

	public void add(Employee employee) {
		this.subordinates.add(employee);
	}
	
	public void remove(Employee employee) {
		this.subordinates.remove(employee);
	}
}
