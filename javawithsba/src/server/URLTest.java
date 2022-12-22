package chap16;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) {
		try {
		//URL url = new URL("http://www.google.com/index.html");
			URL url = new URL("https://1.2.3.4/js/boardlist.html?seq=1&title=제목");
		System.out.println("url.getAuthority()="+ url.getAuthority());
		System.out.println("url.getDefaultPort()="+ url.getDefaultPort());
		System.out.println("url.getPort()="+ url.getPort());
		System.out.println("url.getHost()="+ url.getHost());
		System.out.println("url.getProtocol()="+ url.getProtocol());
		System.out.println("url.getQuery()="+ url.getQuery());
		System.out.println("url.TOURI()="+ url.toURI());		
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(URISyntaxException e) {
			e.printStackTrace();
		}

	}

}
