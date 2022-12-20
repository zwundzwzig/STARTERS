package MultiThreading;

import javax.swing.JOptionPane;

class ThreadExp extends Thread {
	String input;
	
	public ThreadExp(String input) {
		this.input = input;	
	}

	public void run() {
		System.out.println("value2 = " + input);
		for (int i = Integer.parseInt(input); i > 0; i/=2) {
			System.out.println(i);
			try {
				sleep(1000);
			}
			catch (InterruptedException err) {
				err.printStackTrace();
			}
		}
	}
}

public class MultieThreadWithJOption {
	static String input = JOptionPane.showInputDialog("fill input value");
	
	public static void main(String[] args) {
		System.out.println("value1 = " + input);

		for (int i = Integer.parseInt(input); i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException err) {
				err.printStackTrace();
			}
		}
		
		System.out.println("==========================");

		new ThreadExp(input).start();
	}

}
