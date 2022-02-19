package bridge;

class ProfessorPostGraduate extends Professor {
	public ProfessorPostGraduate(Implementer implementer) {
		super(implementer);
	}

	@Override
	public void op() {
		implementer.opImp();
	}
}
