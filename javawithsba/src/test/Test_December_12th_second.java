package test;

class Bird {
	static String name;
	static String type;
	static int legs;
	static int length;
	
	void fly() {
		System.out.printf("%s는 날지 않습니다.", name).println();
	}

	void sing() {
		System.out.printf("%s가 소리내어 웁니다.", name).println();;
	}

	void setName(String name) {
		
	}
	
	void getName() {
		System.out.println(type + "의 이름은 " + name + "입니다.");
	}
}

class Duck extends Bird {
	private int web = 2;
	
	Duck(String name, String type) {
		this.type = type;
		this.name = name;
		System.out.println(this.type + this.name);
	}
	
	void swim() {
		System.out.println(name + "가 " + web + "개의 물갈퀴로 수영합니다.");
	}
}

class Sparrow extends Bird {
	private String friend;
	
	Sparrow(String name, String type) {
		this.type = type;
		this.name = name;		
	}
	
	void makeFriend() {
		this.friend = "허수아비";
		System.out.println(type + "의 친구는 " + friend + "입니다.");
	}
	
	void fly() {
		System.out.printf("%s가 날아다닙니다.", name).println();
	}
}

public class Test_December_12th_second {

	public static void main(String[] args) {
		Sparrow sparrow = new Sparrow("짹짹이", "참새");
		Duck duck = new Duck("꽥꽥이", "오리");
		
		duck.fly();
		duck.sing();
		duck.swim();
		duck.getName();
		System.out.println();

		sparrow.fly();
		sparrow.sing();
		sparrow.makeFriend();
		sparrow.getName();
	}

}
