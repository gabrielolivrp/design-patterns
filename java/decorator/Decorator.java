package decorator;

abstract class Decorator extends Tree {
	private final Tree tree;

	public Decorator(Tree tree) {
		this.tree = tree;
	}

	public void showOrnaments() {
		this.tree.showOrnaments();
	}
}
