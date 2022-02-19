package strategy;

class Main {
	public static void main(String args[]) {
		Vector vector = new Vector(new BubbleSort());
		vector.sort();

		vector.setAlgorithm(new MergeSort());
		vector.sort();

		vector.setAlgorithm(new QuickSort());
		vector.sort();
	}
}
