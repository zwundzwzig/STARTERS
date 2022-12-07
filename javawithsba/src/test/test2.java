package test;

public class test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 10_000;
		int hour = time / 60 / 60;
		int minutes = (time - (hour * 60 * 60)) / 60;
		int second = time - minutes * 60 - hour * 60 * 60;
		
		System.out.printf("Time은 %d시간 %d분 %d초 입니다.", hour, minutes , second );
	}

}
