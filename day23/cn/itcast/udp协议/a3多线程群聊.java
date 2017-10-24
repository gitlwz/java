package cn.itcast.udp协议;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;





//
public class a3多线程群聊  extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			DatagramSocket socket = new DatagramSocket();
		
		
			//准备数据
			BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
			
			String line = null;
			DatagramPacket packet = null;
			while ((line = keyReader.readLine()) != null) {
				packet = new DatagramPacket(line.getBytes(),line.getBytes().length,InetAddress.getByName("172.16.78.199"),9004);
				socket.send(packet);
			}
			socket.close();
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
