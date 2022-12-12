package javawithsba;

public abstract class AbstractRecipe {
	
	public void execute() {
		getReady();
		dothedish();
		cleanup();
	}
	
	abstract void getReady();
	abstract void dothedish();
	abstract void cleanup();
}
