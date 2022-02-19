package composite;

class Programmer extends Employee {
	public Programmer(String name, double salary) {
		super(name, salary);
	} 

	public void print() {
		System.out.println(super.name + ", $" + super.salary);
	}

	public void add(Employee employee) {
		System.out.print("Programmer's subordinate employee cannot be added");
	}
	
	public void remove(Employee employee) {
		System.out.print("Programmer's subordinate employee cannot be removed");
	}
}
