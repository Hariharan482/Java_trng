package Patterns;

public class CommandDemo {
	public static void main(String[] args) {
		UniversalRemote remote = new UniversalRemote();

		TV tv = new TV();
		AC ac = new AC();
		Lights lights = new Lights();

		remote.assignCommand(0, tv);
		remote.assignCommand(1, ac);
		remote.assignCommand(2, lights);

		remote.executeCommand(1);
		remote.executeCommand(3);
	}
}

class UniversalRemote {
	Command commands[] = new Command[4];

	public UniversalRemote() {
		for (int i = 0; i < 4; i++) {
			commands[i] = new DummyCommand();
		}
	}

	public void executeCommand(int slot) {
		commands[slot].execute();
	}

	public void assignCommand(int slot, Command command) {
		commands[slot] = command;
	}
}

abstract class Command {
	public abstract void execute();
}

class DummyCommand extends Command {
	@Override
	public void execute() {
		System.out.println("Dummy Slot");
	}
}

class TV extends Command {
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("TV Mode Switched");
	}
}

class AC extends Command {
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("AC switched on");
	}
}

class Lights extends Command {
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Lights Switched on");
	}
}