package cn.itcsat.lwz;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class 客户端 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//建立tcp的服务
		Socket socket = new Socket(InetAddress.getLocalHost(),6060);
		//获取socket的输入流对象
		InputStream inputStream = socket.getInputStream();
		//获取文件的输出流对象
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\5.jpg");
		//边读边写
		byte[] buf = new byte[1024];
		int length = 0 ; 
		while((length = inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//关闭资源
		fileOutputStream.close();
		socket.close();
		
		
	}

}
