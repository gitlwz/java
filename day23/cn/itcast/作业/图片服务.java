package cn.itcast.作业;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.naming.ldap.SortControl;

public class 图片服务  extends Thread{
	Socket socket;
	
	public 图片服务(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			
			
			
			
			//获取到输出流对象
			OutputStream outputStream = socket.getOutputStream();
			
			//获取图片的输入流对象
			FileInputStream fileInputStream = new FileInputStream("F:\\新建文件夹\\fileceshi\\timg.jpg");
			//服务图片数据，把数据写出
			byte[] buf = new byte[1024];
			int length = 0;
			while((length = fileInputStream.read(buf)) != -1){
				outputStream.write(buf,0,length);
			}
			
			String ip = socket.getInetAddress().getHostAddress();  //获取对方的ip地址对象
			
			System.out.println(ip);
			
			fileInputStream.close();
			socket.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(6060);
		System.out.println("启动了");
		while (true) {
			//接受客户端链接
			Socket socket = serverSocket.accept();
			new 图片服务(socket).start();
			
		}
	}

}
