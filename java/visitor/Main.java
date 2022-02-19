package visitor;

class Main {
	public static void main(String args[]) {
		Store store = new Store();

		PriceEquipamentVisitor visitor = new PriceEquipamentVisitor();

		store.addEquipament(new Refrigerator("Refrigerator ABC", 1000.0));
		store.addEquipament(new Refrigerator("Refrigerator Duplex XZY", 2500.0));
		store.addEquipament(new TV("TV LED 58 pol. ZZZ", 4000.0));
		store.addEquipament(new Stove("6-burner stove ABC", 1500.0));

		for (Equipament equipament: store.getEquipments()) {
			equipament.accept(visitor);
		}
	}
}
