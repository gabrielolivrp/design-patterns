package visitor;

abstract class EquipamentVisitor {
	public abstract void visitRefrigerator(Refrigerator refrigerator);
	public abstract void visitTv(TV tv);
	public abstract void visitStove(Stove stove);
}
