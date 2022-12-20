package MultiThreading;

import java.util.*;

class Data {
	int value;
	
	synchronized void saveValue(int value) {
		this.value += value;
		System.out.println(Thread.currentThread().getName() + " Thread is " + value + " after " + this.value);
	}
}

class DataThread1 extends Thread {
	Data data;
	int value;
	
	public DataThread1(String name, Data data, int value) {
		super(name);
		this.data = data;
		this.value = value;
	}
	
	public void run() {
		data.saveValue(value);
	}
}

class DataThread2 extends Thread {
	Data data;
	int value;
	
	public DataThread2(String name, Data data, int value) {
		super(name);
		this.data = data;
		this.value = value;
	}
	
	public void run() {
		data.saveValue(value);
	}
}

public class Synchronized {

	public static void main(String[] args) {
		Data data = new Data();
		DataThread1 dataThread1 = new DataThread1("dt1", data, 100);
		DataThread2 dataThread2 = new DataThread2("dt2", data, 200);
		DataThread1 dataThread3 = new DataThread1("dt3", data, 300);
		DataThread2 dataThread4 = new DataThread2("dt4", data, 400);
		
		dataThread1.start();
		dataThread2.start();
		dataThread3.start();
		dataThread4.start();
		
	}

}
