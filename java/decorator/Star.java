package decorator;

class Star extends Decorator {
	public Star(Tree tree) {
		super(tree);
	}

	public void showOrnaments() {
		super.showOrnaments();
		System.out.print("Star, ");
	}
}
