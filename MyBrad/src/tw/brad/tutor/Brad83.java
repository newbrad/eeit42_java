package tw.brad.tutor;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad83 {

	public static void main(String[] args) {
		try {
			File source = new File("");
			byte[] buf = new byte[(int)source.length()];
			FileInputStream fin = new FileInputStream(source);
			fin.read(buf);
			fin.close();
			
			Socket socket = new Socket(
					InetAddress.getByName("10.0.104.154"), 7777);
			
			BufferedOutputStream bout = new BufferedOutputStream(
					socket.getOutputStream());
			bout.write(buf);
			bout.flush();
			bout.close();
			
			socket.close();
			System.out.println("Client OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
