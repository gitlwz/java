package cn.itcast.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*



为什么ServerSocket不设计一个getInputStream和getOutputStream方法呢？

*/

//服务端
public class a2tcp的服务端 {

	public static void main(String[] args) throws IOException {
		//建立tcp的服务端 ,并且监听一个端口
		ServerSocket serverSocket = new ServerSocket(9091);
		
		//接受客户端的链接
		Socket socket = serverSocket.accept(); //accept() 接受客户端的接连，该方法是一个阻塞型方法
			
		//获取输入流对象，读取客户端发送的内容
		InputStream inputStream = socket.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int length = 0;
		
		length = inputStream.read(buf);
		
		System.out.println("服务端接收：" + new String(buf,0,length));
		
		
		//获取Socket输出流对象，向客户端发送数据
		OutputStream outputStream = socket.getOutputStream();
		
		outputStream.write("客户端你也好啊".getBytes());
		
		
		//关闭资源
		serverSocket.close();
		
		
	}

}
