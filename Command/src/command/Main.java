package command;

public class Main {
	public static void main(String[] args) {
		Screen screen = new Screen();
		Command rollUpCommand = new RollUpCommand(screen);
		Command rollDownCommand = new RollDownCommand(screen);

		WallButton rollUpButton = new WallButton(rollUpCommand);
		WallButton rollDownButton = new WallButton(rollDownCommand);

		rollUpButton.push();
		rollDownButton.push();
	}
}