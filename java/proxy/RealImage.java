package proxy;

class RealImage extends Image {
	private String filename;

	public RealImage(String filename) {
		this.filename = filename;
		this.loadImageFromDisk();
	}

	private void loadImageFromDisk() {
		System.out.println("Loading " + this.filename);
	}

	public void displayImage() {
		System.out.println("Displaying " + this.filename);
	}
}
