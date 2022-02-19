package decorator;

class Ball extends Decorator {
	public Ball(Tree tree) {
		super(tree);
	}

	public void showOrnaments() {
		super.showOrnaments();
		System.out.print("Ball, ");
	}
}
