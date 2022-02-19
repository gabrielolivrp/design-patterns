package command;

abstract class Command {
	public abstract void execute();

	public abstract void undo();
}
