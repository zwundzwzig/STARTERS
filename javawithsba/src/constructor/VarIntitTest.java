package constructor;

public class VarIntitTest {
	// 객체 내부에 변수를 선언하면 자동으로 초기화됨.
	int a;
	double b;
	String c;
	
	VarIntitTest()
	{c = "initialized";} // 초기화 블록;
	
	VarIntitTest(int a, double b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		int d; // 지역 변수, 자동 초기화 안됨, 사용자가 직접 초기화해야한다.
//		System.out.println(d);
		VarIntitTest test = new VarIntitTest();
		VarIntitTest test2 = new VarIntitTest(2, 4.99);
		System.out.printf("a = %d\nb = %f\nc = %s\n", test.a, test.b, test.c);
		System.out.printf("a = %d\nb = %f\nc = %s\n", test2.a, test2.b, test2.c);
	}

}
