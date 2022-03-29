package tw.brad.tutor;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad81 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(
					InetAddress.getByName("10.0.104.154"), 7777);
			socket.close();
			System.out.println("client OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
