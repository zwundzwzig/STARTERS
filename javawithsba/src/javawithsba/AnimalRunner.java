package javawithsba;

abstract class Animal {
	abstract void bark();
}

class Dogs extends Animal {
	
	@Override
	void bark() {
		System.out.println("BOW WOW");
	}
	
}

class Cats extends Animal {
	
	@Override
	void bark() {
		System.out.println("Mi YAU");
	}
	
}

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = {new Dogs(), new Cats()};
		
		for(Animal animal : animals) {
			animal.bark();
		}
	}

}
