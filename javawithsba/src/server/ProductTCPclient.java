package server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ProductTCPclient {

	public static void main(String[] args) throws Exception {
		Socket s = new Socket("127.0.0.1", 10000);
		String serverip = s.getInetAddress().getHostAddress();

		System.out.println("==클라이언트가 " + serverip + " 서버로 접속했습니다. ==");
		// 클라이언트가 먼저 1번게시물주세요 요청 = 출력스트림
		OutputStream os = s.getOutputStream();
		String request = "1번게시물\n";
		byte[] by = request.getBytes();
		os.write(by);
		////////////////////////////////////////

		/////////////////////////////////////////////////////////////////////////
		// 서버로부터 응답 = 입력스트림
		InputStream is = s.getInputStream();
		// BufferedReader br = new BufferedReader(new InputStreamReader(is));
		// String request = br.readLine();

		Scanner sc = new Scanner(is);
		String response = sc.nextLine();
		System.out.println("[클라이언트가 서버로부터 " + response + " 응답을 전달받았습니다.]");
		/////////////////////////////////////////////////////////////////////////

		s.close();
		System.out.println("==클라이언트가 서버의 접속 해제했습니다. ==");
	}

}
