package cn.itcast.tcp;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
需求：客户端与服务端一问一答聊天。


*/


//聊天的客户端
public class a3聊天客户端 {
	
	
	
	
	public static void mian(String[] args) throws UnknownHostException, IOException {
		//建立tcp的客户端服务
		Socket socket = new Socket(InetAddress.getLocalHost(),9090);
		
		
		//获取socket的输出流对象
		OutputStreamWriter outputStreamWriter = new  OutputStreamWriter(socket.getOutputStream());
		
		
		
	}
	
}
