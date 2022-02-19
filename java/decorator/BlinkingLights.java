package decorator;

class BlinkingLights extends Decorator {
	public BlinkingLights(Tree tree) {
		super(tree);
	}

	public void showOrnaments() {
		super.showOrnaments();
		System.out.print("Blinking lights, ");
	}
}
