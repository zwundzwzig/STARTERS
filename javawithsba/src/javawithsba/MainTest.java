package javawithsba;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		String[] userArray = new String[args.length + 1];
		for(int i = 0; i < args.length; i++) {
			userArray[i] = args[i];
			System.out.println(userArray[i]);
		}
		System.out.println(userArray[2]);
	}

}
