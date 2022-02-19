package command;

import java.util.ArrayList;

class Invoker {
	private ArrayList<Command> commands = new ArrayList<Command>();

	private int current;

	public void compute(Command command) {
		command.execute();
		this.commands.add(command);
		this.current++;
	}

	public void undo(int levels) {
		for (int i = 0; i < levels; i++) {
			if (current > 0) {
				Command command = this.commands.remove(--this.current);
				command.undo();
			}
		}
	}
}
