package adapter;

class BrazilianSocket extends Socket<BrazilianPlug>{
	public String connect(BrazilianPlug plug) {
		return plug.pickUpElectricity() + this.getNetworkName();
	}

	public String getNetworkName() {
		return "brazilian socket";
	}
}
