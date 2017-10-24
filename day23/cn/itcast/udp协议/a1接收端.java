package cn.itcast.udp协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/*
 
 接受端的使用步骤
 	1.建立udp的服务
 	2.准备空的数据包接受数据
 	3.调用udp的服务接受数据
 	4.关闭资源
 
 
 
 
 */


public class a1接收端 {

	public static void main(String[] args) throws IOException {
		
		//建立udp的服务  、并且监听一个端口号
		DatagramSocket datagramSocket = new DatagramSocket(9090);
		
		//准备空的数据包用于存放数据。
		byte[] buf = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
		
		//调用udp的服务接受数据
		datagramSocket.receive(datagramPacket); //receive是一个阻塞性的方法
		
		
		System.out.println(new String(buf,0,datagramPacket.getLength())); //getLength获取数据包存储了多少个资源
		
		//关闭资源
		datagramSocket.close();
	}

}
