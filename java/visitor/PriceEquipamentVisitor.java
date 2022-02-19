package visitor;

class PriceEquipamentVisitor extends EquipamentVisitor {
	public void visitRefrigerator(Refrigerator refrigerator) {
		System.out.println(
			"Price refrigerator  " + refrigerator.getName() + 
			" = $ " + String.valueOf(refrigerator.getPrice()) + 
			" with 4% tax, total: $" + String.valueOf(refrigerator.getPrice() * 1.04)
		);
	}

	public void visitTv(TV tv) {
		System.out.println(
			"Price TV  " + tv.getName() + 
			" = $ " + String.valueOf(tv.getPrice()) + 
			" with 7% tax, total: $" + String.valueOf(tv.getPrice() * 1.07)
		);
	}
	
	public void visitStove(Stove stove) {
		System.out.println(
			"Price stove  " + stove.getName() + 
			" = $ " + String.valueOf(stove.getPrice()) + 
			" with 5% tax, total: $" + String.valueOf(stove.getPrice() * 1.05)
		);
	}
}
