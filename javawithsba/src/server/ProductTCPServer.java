package server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ProductTCPServer {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("[서버는 10000 포트에서 대기중입니다]");
		while (true) {
			Socket s = ss.accept();// 실행x/10/...
			String clientip = s.getInetAddress().getHostAddress();
			System.out.println("[서버는 " + clientip + " 클라이언트 접속 허용합니다. ]");
/////////////////////////////////////////////////////////////////////////
			// 클라이언트 요청받는다 = 입력스트림
			InputStream is = s.getInputStream();
			// BufferedReader br = new BufferedReader(new InputStreamReader(is));
			// String request = br.readLine();

			Scanner sc = new Scanner(is);
			String request = sc.nextLine();
			System.out.println("[서버는 클라이언트부터 " + request + " 요청을 전달받았습니다.]");
/////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////
//클라이언트 요청-처리 응답 = 출력스트림
			String response = "1번 제목1 내용1 작성자1\n";
			OutputStream os = s.getOutputStream();
			byte[] by = response.getBytes();
			os.write(by);
			System.out.println("[서버는 클라이언트로 " + "응답을 전달합니다.]");
/////////////////////////////////////////////////////////////////////////			

			s.close();
			System.out.println("[서버는 클라이언트 접속 해제합니다. ]");
		}
	}

}
