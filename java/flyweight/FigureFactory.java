package flyweight;

import java.util.HashMap;

class FigureFactory {
	private static final HashMap<String, Figure> figures = new HashMap<String, Figure>();

	public static Figure getFigure(String name) {
		Figure figure = figures.get(name);

		if (figure == null) {
			if (name.equals("oval filled")) {
				figure = new Oval(true);
			} else if (name.equals("oval not filled")) {
				figure = new Oval(false);
			} else if (name.equals("line")) {
				figure = new Line();
			}

			figures.put(name, figure);
		}

		return figure;
	}

}
