package javawithsba;

interface Fly {
	void fly();
}

class Bird implements Fly {

	@Override
	public void fly() {
		System.out.println("with wings");
	}
	
}

class Airoplane implements Fly {
	
	@Override
	public void fly() {
		System.out.println("with fuel ");
	}
	
}

public class Flyable {

	public static void main(String[] args) {
		Fly[] flyingObject = { new Bird(), new Airoplane() };
		for(Fly object : flyingObject) {
			object.fly();
		}
	}

}
