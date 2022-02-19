package decorator;

class Main {
    public static void main(String args[]) {
		Tree christmasTree = new ChristmasTree();

		christmasTree = new Star(christmasTree);
		christmasTree = new Ball(christmasTree);
		christmasTree = new Ball(christmasTree);
		christmasTree = new Ball(christmasTree);
		christmasTree = new Ball(christmasTree);
		christmasTree = new Ball(christmasTree);
		christmasTree = new BlinkingLights(christmasTree);

		christmasTree.showOrnaments();
    }
}
