package composite;

class Main {
    public static void main(String args[]) {
		Employee programmer1 = new Programmer("José", 900);
		Employee programmer2 = new Programmer("Pedro", 2900);
		Employee programmer3 = new Programmer("Ricardo", 3900);

		Manager manager1 = new Manager("Carlos", 5000);
		Manager manager2 = new Manager("Maria", 10000);
		Manager manager3 = new Manager("João", 15000);

		manager1.add(programmer1);
		manager1.add(programmer2);

		manager2.add(programmer3);

		manager3.add(manager1);
		manager3.add(manager2);

		manager3.print();
    }
}
