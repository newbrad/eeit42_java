package tw.brad.tutor;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class Brad79 {

	public static void main(String[] args) {
		byte[] buf = new byte[4096];
		while (true) {
			try {
				DatagramSocket socket = new DatagramSocket(8888);
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				socket.close();
				
				String who = packet.getAddress().getHostAddress();
				byte[] rec = packet.getData();
				int len = packet.getLength();
				String mesg = new String(rec,0,len, StandardCharsets.UTF_8);
				System.out.println(who + " : " + mesg);
				if (mesg.equals("bye")) {
					break;
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
	}

}
