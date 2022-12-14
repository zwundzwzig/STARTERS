package test;

abstract class ShapeTest {
	abstract void area();
	abstract void circum();
	void print() {
		System.out.println("shy");
	};
}

class Rectangle extends ShapeTest {
	int width, height;
	Rectangle(String width, String height) {
		this.width = Integer.parseInt(width);
		this.height = Integer.parseInt(height);
	}
	
	@Override
	void area() {
		System.out.printf("height = %d, width = %d", height, width);
	}
	
	@Override
	void circum() {
		System.out.println(2 * (height + width));
	}
}

class Circle extends ShapeTest {
	int radius;
	final static float pi = 3.14f;
	
	Circle(String radius) {
		this.radius = Integer.parseInt(radius);
	}
	
	@Override 
	void area() {
		System.out.println(radius * radius * pi);
	}
	
	@Override
	void circum() {
		System.out.println(2 * radius * pi);
	}
	
}

public class Shape {

	public static void main(String[] args) {
		ShapeTest test = null;
		if(args.length == 3 && args[0].equals("rect")) {
			test = new Rectangle(args[1], args[2]);
		}
		if(args.length == 2 && args[0].equals("cir")) {
			test = new Circle(args[1]);
		} 
//		else {
//			System.out.println("NOT FOUND!");
//		}
		
//		test.area();
//		test.circum();
	}

}
