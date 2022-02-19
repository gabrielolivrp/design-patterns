package visitor;

class TV extends Equipament {
	public TV(String name, double price) {
		super(name, price);
	}

	public void accept(EquipamentVisitor visitor) {
		visitor.visitTv(this);
	}
}
