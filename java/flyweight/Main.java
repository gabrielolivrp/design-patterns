package flyweight;

class Main {
    public static void main(String args[]) {
		Figure figure = FigureFactory.getFigure("line");

		figure.draw("blue"); 
	}
}
