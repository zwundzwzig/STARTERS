package javawithsba;

class Mario implements GamingConsole {

	@Override
	public void up() {
		System.out.println("MARIO!");
	}

	@Override
	public void down() {
		System.out.println("MAY");
	}

	@Override
	public void left() {
		System.out.println("JAY");
	}

	@Override
	public void right() {
		System.out.println("LEE");

	}
}

public class MarioRunner {

	public static void main(String[] args) {
		GamingConsole[] games = { new MarioGame(), new Mario() };

		for(GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}

	}

}
