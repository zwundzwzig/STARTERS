package generics;

class Apple {
	String origin;

	public Apple(String origin) {
		this.origin = origin;
	}
}

class Paper {
	String size;
	
	public Paper(String size) {
		this.size = size;
	}
}

class Wine {
	String kind;
	
	public Wine(String kind) {
		this.kind = kind;
	}
}

class Box<T> {
	T contents;
	
	public T getContents() {
		return contents;
	}
	
	public void setContents(T contents) {
		this.contents = contents;
	}
	
	public Box(T contents) {
		this.contents = contents;
	}
	
}

public class NonGenericTest {

	public static void main(String[] args) {
		Apple a = new Apple("Daegu");
		Paper p = new Paper("A4");
		Wine w = new Wine("Decanting");
		
		Box<Apple> aBox = new Box<>(a);
		Box<Paper> pBox = new Box<>(p);
		Box<Wine> wBox = new Box<>(w);
		
		System.out.print(aBox.contents.origin);
		System.out.print(pBox.contents.size);
		System.out.print(wBox.contents.kind);
	}

}
