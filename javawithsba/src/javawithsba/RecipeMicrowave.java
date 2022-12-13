package javawithsba;

public class RecipeMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("get ready");
		System.out.println("switch off microwave");
	}

	@Override
	void dothedish() {
		System.out.println("get stuff ready");
		System.out.println("Put it in the microwave");
	}

	@Override
	void cleanup() {
		System.out.println("clean up");
		System.out.println("switch on microwave");
	}
	
}
