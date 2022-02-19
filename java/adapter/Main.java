package adapter;

class Main {
    public static void main(String args[]) {
		BrazilianSocket brazilianSocket = new BrazilianSocket();

		AmericanPlug americanPlug = new AmericanPlug();
		
		AdapterEuaToBrazil adapter = new AdapterEuaToBrazil();

		// Error
		// brazilianSocket.connect(americanPlug);

		System.out.print(adapter.connect(americanPlug));
	}
}
