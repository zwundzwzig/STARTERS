package test;

interface Volume {
	void volumeUp(int v);
	void volumeDown(int v);
	static void printing(String name) {
		System.out.println(name);
	}
	default void printy(String name) {
		System.out.println(name);
	}
}

class Speaker implements Volume {
	protected int volLevel;
	
	Speaker(int v) {
		volLevel = v; // 멤버 변수 이름 다르기 때문에 this 생략 가능.
	}

	@Override
	public void volumeUp(int v) {
		volLevel += v;
		if(volLevel > 100) volLevel = 100;
		System.out.println("Now speaker's volume is " + volLevel);
	}

	@Override
	public void volumeDown(int v) {
		volLevel -= v;
		if(volLevel < -100) volLevel = -100;
		System.out.println("Now speaker's volume is " + volLevel);
	}
	
	public void printing(String name) {
		System.out.println(name);
	}
	
}

class TV extends Speaker implements Volume {
	
	TV(int v) {
		super(v);
	}

	@Override
	public void volumeUp(int v) {
		volLevel += v;
		System.out.println("Now television's volume is " + volLevel);
	}
	
	@Override
	public void volumeDown(int v) {
		volLevel -= v;
		if(volLevel <= 0) volLevel = 0;
		System.out.println("Now television's volume is " + volLevel);
	}
	
}

class Radio extends Speaker implements Volume {
	
	Radio(int v) {
		super(v);
	}

	@Override
	public void volumeUp(int v) {
		volLevel += v;
		System.out.println("Now radio's volume is " + volLevel);
	}
	
	@Override
	public void volumeDown(int v) {
		volLevel -= v;
		System.out.println("Now radio's volume is " + volLevel);
	}
	
}

public class December_14th_VolTest {

	public static void main(String[] args) {
		Volume[] vol = {new Speaker(1), new TV(10), new Radio(50)};
		Volume[] volA = new Volume[]{new Speaker(100), new TV(119), new Radio(5000)};
		vol.getClass();
		for(Volume v : vol) {
			Volume.printing(v.getClass().getSimpleName());
			v.volumeUp(20);
			v.volumeDown(300);
		}
		
			Volume.printing("");
		
		for(Volume v : volA) {
			v.printy(v.getClass().getSimpleName());
			v.volumeUp(20);
			v.volumeDown(300);
		}
	}

}
