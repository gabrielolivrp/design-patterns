package bridge;

class ProfessorGraduate extends Professor {
	public ProfessorGraduate(Implementer implementer) {
		super(implementer);
	}

	@Override
	public void op() {
		implementer.opImp();
	}
}
