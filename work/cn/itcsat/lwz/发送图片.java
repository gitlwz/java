package cn.itcsat.lwz;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


class SendImg{
	
}



public class 发送图片 {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(7070);
		
		
		System.out.println("服务端启动");
		Socket socket = serverSocket.accept();
		
		
		OutputStream outputStream = socket.getOutputStream();
		
		File file = new File("F:\\新建文件夹\\fileceshi\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		
		int content = 0;
		while((content = bufferedInputStream.read()) != -1){
			outputStream.write(content);
		}
		
		
		bufferedInputStream.close();
		serverSocket.close();
		
	}
	
	
}
