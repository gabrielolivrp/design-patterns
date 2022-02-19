package command;

class Sum extends Command {
	private Calculator calculator;

	private int number;

	public Sum(Calculator calculator, int number) {
		this.calculator = calculator;
		this.number = number;
	}

	public void execute() {
		this.calculator.setValue(calculator.getValue() + this.number);
		System.out.println(this.calculator.getValue());
	}

	public void undo() {
		this.calculator.setValue(calculator.getValue() - this.number);
		System.out.println(this.calculator.getValue());
	}
}
