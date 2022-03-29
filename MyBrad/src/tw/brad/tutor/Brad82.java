package tw.brad.tutor;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad82 {

	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(7777)){
			
			while(true) {
				Socket socket = server.accept();
				System.out.println(socket.getInetAddress().getHostAddress());
				if (socket == null) break;
				
				new Thread() {
					public void run() {
						try {
							
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
						}catch(Exception e) {
							System.out.println(e.toString());
						}
						
					};
				}.start();
			}
			
			server.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
