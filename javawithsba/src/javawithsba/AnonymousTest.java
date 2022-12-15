package javawithsba;


//class Ano {
//
	interface I1 {
		void m1();
	}
	
	interface I2 {
		void m2();
	}
//
////	public void m1() {
////		System.out.println("get m1 method");
////	}
////
////	public void m2() {
////		System.out.println("get m2 method");
////	}
//	
//}

public class AnonymousTest {

	public static void main(String[] args) {
		I1 i1 = new I1() {
			public void m1() {
				System.out.println("m1");
			}
		};
		
		I2 i2 = new I2() {
			public void m2() {
				System.out.println("m2");
			}
		};
		
		i2.m2();
		i1.m1();
	}

}
