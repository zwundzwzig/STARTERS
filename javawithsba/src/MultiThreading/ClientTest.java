package MultiThreading;

import java.util.Date;

class LoginClient extends Thread {
	
	String id;
	String pw;
	
	LoginClient(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public void run() {
		System.out.printf("로그인 아이디 %s를 입력 받습니다.", id).println();
		try {
			Thread.sleep(100);
			System.out.println("로그인 암호를 확인합니다.");
			Thread.sleep(200);
			if(!pw.equals("java")) {
				System.out.println("올바르지 않은 로그인 암호입니다.");
			}
			else System.out.println("로그인 암호 맞습니다.");
		}
		catch(InterruptedException err) {
			err.printStackTrace();
		}
	}
	
}

class RegisterClient extends Thread {
	
	Date date;
	
	RegisterClient(Date date) {
		this.date = date;
	}
	
	public void run() {
		try {
			Thread.sleep(300);
			System.out.println((date.getYear() + 1900) + "년도 " + (date.getMonth() + 1) + "월 " + date.getDate() + "일에 회원 가입 요청합니다.");
			Thread.sleep(3000);
			System.out.println("회원 가입 요청 처리 완료입니다.");
		}
		catch(InterruptedException err) {
			err.printStackTrace();
		}
	}
	
}
class BoardClient extends Thread {
	
	int feeds;
	
	BoardClient(int feeds) {
		this.feeds = feeds;
	}
	
	public void run() {
		
		for (int i = 1; i <= feeds; i++) {
			try {
				System.out.printf("게시물 %d 번 작성합니다.", i).println();
				Thread.sleep(500);
			}
			catch (InterruptedException err) {
				err.printStackTrace();
			}
		}
	}
}

public class ClientTest {

	public static void main(String[] args) {
		LoginClient c1 = new LoginClient("java", "java");
		LoginClient c2 = new LoginClient("java", "1234");
		RegisterClient c3 = new RegisterClient(new Date());
		BoardClient c4 = new BoardClient(5);
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}

}

/*
 * 로그인아이디java를 입력받습니다 
 * 로그인암호를 확인합니다 
 * 게시물 1 번작성합니다 
 * 로그인아이디java를 입력받습니다 
 * 로그인암호를 확인합니다 
 * 로그인암호 올바르지 않습니다 
 * 2022년도 12월 20일에 회원가입요청받았습니다 
 * 게시물 2 번작성합니다 
 * 로그인암호 맞습니다 
 * 게시물 3 번작성합니다 
 * 회원가입요청 처리중입니다 
 * 게시물 4 번작성합니다 
 * 게시물 5 번작성합니다 
 * 게시물 5개 작성 종료합니다. 
 * 회원가입요청처리완료입니다
 */