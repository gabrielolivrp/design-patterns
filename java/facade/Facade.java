package facade;

class Facade {
	private System1 system1;
	private System2 system2;
	private System3 system3;

	public Facade() {
		this.system1 = new System1();
		this.system2 = new System2();
		this.system3 = new System3();
	}

	public void methodA() {
		this.system1.method1();
		this.system2.method2();
		this.system3.method3();
	}

	public void methodB() {
		this.system3.method3();
		this.system2.method2();
		this.system1.method1();
	}
}
