package visitor;

import java.util.List;
import java.util.ArrayList;

class Store {
	private List<Equipament> eqList = new ArrayList<Equipament>();

	public void addEquipament(Equipament equipament) {
		this.eqList.add(equipament);
	}

	public List<Equipament> getEquipments() {
		return this.eqList;
	}
}
