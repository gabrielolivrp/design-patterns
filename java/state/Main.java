package state;

class Main {
	public static void main(String args[]) {
		Duck duck = new Duck();

		duck.fly();
		duck.quack();

		duck.setBehaviorFly(new DontFly());

		duck.fly();
		duck.quack();
	}
}
