package tw.brad.tutor;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad77 {

	public static void main(String[] args) {
		
			try {
				InetAddress[] ips = InetAddress.getAllByName("www.bradchao.com");
				for(InetAddress ip : ips) {
					System.out.println(ip.getHostAddress());
				}
			} catch (UnknownHostException e) {
				System.out.println(e.toString());
			}
		
	}

}
