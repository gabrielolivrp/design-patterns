package bridge;

abstract class Professor {
	protected Implementer implementer = null;

	public Professor(Implementer implementer) {
		this.implementer = implementer;
	}

	public abstract void op ();
}
