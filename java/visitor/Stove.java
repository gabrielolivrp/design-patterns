package visitor;

class Stove extends Equipament {
	public Stove(String name, double price) {
		super(name, price);
	}
	
	public void accept(EquipamentVisitor visitor) {
		visitor.visitStove(this);
	}
}
