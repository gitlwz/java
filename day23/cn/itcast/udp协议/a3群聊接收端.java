package cn.itcast.udp协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;



//群聊接受端
public class a3群聊接收端 extends Thread {
	@Override
	public void run() {
		try {
			DatagramSocket socket = new DatagramSocket(9004);
			
			byte[] buf = new byte[1024];
			
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			boolean flag = true;
			while(flag){
				socket.receive(packet);
				System.out.println(packet.getAddress().getHostAddress()+ "说：" + new String(buf,0,packet.getLength()));
			}
			socket.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
