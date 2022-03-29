package tw.brad.tutor;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad82 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			Socket socket = server.accept();
			
			String host = socket.getInetAddress().getHostAddress();
			FileOutputStream fout = new FileOutputStream("dir1/" + host + ".jpg");
			
			BufferedInputStream bin = 
					new BufferedInputStream(socket.getInputStream());
			byte[] buf = new byte[4096];
			int len;
			while ((len = bin.read(buf)) != -1) {
				fout.write(buf,0,len);
			}
			bin.close();
			
			fout.flush();
			fout.close();
			server.close();
			System.out.println("Server OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
