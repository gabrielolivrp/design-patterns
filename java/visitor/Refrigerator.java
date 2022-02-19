package visitor;

class Refrigerator extends Equipament {
	public Refrigerator(String name, double price) {
		super(name, price);
	}
	
	public void accept(EquipamentVisitor visitor) {
		visitor.visitRefrigerator(this);
	}
}
