package flyweight;

class Oval extends Figure {
	private boolean filled;

	public Oval(boolean filled) {
		super();

		this.filled = filled;
	}

	public void draw(String color) {
		if (this.filled) {
			System.out.println("Figure oval filled: " + color);
		} else {
			System.out.println("Figure oval not filled: " + color);
		}
	}
}
