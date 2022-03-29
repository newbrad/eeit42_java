package tw.brad.tutor;

import java.io.BufferedInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad80 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			Socket socket = server.accept();
			
			String host = socket.getInetAddress().getHostAddress();
			System.out.println(host);
			
			BufferedInputStream bin = 
					new BufferedInputStream(socket.getInputStream());
			byte[] buf = new byte[4096];
			int len;
			while ((len = bin.read(buf)) != -1) {
				System.out.print(new String(buf,0,len));
			}
			bin.close();
			
			server.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
