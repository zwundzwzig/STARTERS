package javawithsba;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Since go up!");
	}

	@Override
	public void down() {
		System.out.println("DOWN");
	}

	@Override
	public void left() {
		System.out.println("LEFT");
	}

	@Override
	public void right() {
		System.out.println("RIGHT");
	}

}
