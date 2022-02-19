package flyweight;

class Line extends Figure {
	public Line() {
		super();
	}

	public void draw(String color) {
		System.out.println("Figure line: " + color);
	}
}
