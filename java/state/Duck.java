package state;

class Duck extends Bird {
	private Behavior behaviorFly;
	private Behavior behaviorQuack;

	public Duck() {
		this.behaviorFly = new Fly();
		this.behaviorQuack = new Quack();
	}

	public void setBehaviorFly(Behavior behavior) {
		this.behaviorFly = behavior;
	}

	public void fly() {
		this.behaviorFly.exec();
	}

	public void setBehaviorQuack(Behavior behavior) {
		this.behaviorQuack = behavior;
	}

	public void quack() {
		this.behaviorQuack.exec();
	}
}
