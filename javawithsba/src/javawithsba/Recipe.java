package javawithsba;

public class Recipe extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("get ready");
	}

	@Override
	void dothedish() {
		System.out.println("do the dish");
	}

	@Override
	void cleanup() {
		System.out.println("clean up");
	}
	
}
