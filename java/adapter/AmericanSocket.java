package adapter;

class AmericanSocket extends Socket<AmericanPlug>{
	public String connect(AmericanPlug plug) {
		return plug.pickUpElectricity() + this.getNetworkName();
	}

	public String getNetworkName() {
		return "american socket";
	}
}
