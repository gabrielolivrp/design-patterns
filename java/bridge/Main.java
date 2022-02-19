package bridge;

class Main {
    public static void main(String args[]) {
		Professor graduate = new ProfessorGraduate(new ProfessorImplGraduate());
		graduate.op();
		
		Professor postgraduate = new ProfessorPostGraduate(new ProfessorImplPostGraduate());
		postgraduate.op();
	}
}
