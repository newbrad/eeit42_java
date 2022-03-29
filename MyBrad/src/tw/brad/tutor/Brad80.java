package tw.brad.tutor;

import java.io.IOException;
import java.net.ServerSocket;

public class Brad80 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			server.accept();
			server.close();
			System.out.println("Server OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
