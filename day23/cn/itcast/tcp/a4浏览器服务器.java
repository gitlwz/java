package cn.itcast.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
/*



*/
import java.net.Socket;

//模拟Tomcat服务器
public class a4浏览器服务器  extends Thread{
	
	Socket socket;
	
	public a4浏览器服务器(Socket socket){
		this.socket = socket;
	}
	
	
	@Override
	public void run() {
		try {
			
			
			
			
			//获取socket的输出流对象
			OutputStream outputStream = socket.getOutputStream();
			
			outputStream.write("<!DOCTYPE html><html><head><meta charset='UTF-8'><title></title></head><body>你好啊浏览器</body></html>".getBytes());
			
			//关闭资源
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		//建立tcp的服务器
		ServerSocket serverSocket = new ServerSocket(5001);
		
		//不断的接受客户端的链接
		while(true){
			Socket socket = serverSocket.accept();
			new a4浏览器服务器(socket).start();
		}
		
	}

}
