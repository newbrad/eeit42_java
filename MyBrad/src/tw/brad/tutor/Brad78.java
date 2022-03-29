package tw.brad.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class Brad78 {

	public static void main(String[] args) {
		byte[] buf = "藕粉好".getBytes();
		String mesg2 = new String(buf,0,buf.length, 
				StandardCharsets.UTF_8);
		byte[] buf2 = mesg2.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(buf2, buf2.length, 
					InetAddress.getByName("10.0.104.154"), 8888);
			socket.send(packet);
			socket.close();
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
