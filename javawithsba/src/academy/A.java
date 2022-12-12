package academy;

class B extends C {
	int j;
	B() {
		super("");
		j = 20;
		System.out.println(j + " : WOW");
	}
}

class C {
	int i;
//	C() {}
	C(String s) {
		i = 10;
		System.out.println("call constructor A ");
	}
}

public class A {

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}

}
