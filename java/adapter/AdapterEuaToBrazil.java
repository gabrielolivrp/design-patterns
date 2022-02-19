package adapter;

class AdapterEuaToBrazil extends BrazilianSocket {
	public String connect(AmericanPlug plug) {
		return plug.pickUpElectricity() + this.getNetworkName();
	}
}
