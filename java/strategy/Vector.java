package strategy;

class Vector {
	private SortAlgorithm algorithm;

	public Vector(SortAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	public void setAlgorithm(SortAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	public void sort() {
		this.algorithm.sort();
	}
}
