package cn.itcast.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
/*



*/
import java.net.Socket;

//ģ��Tomcat������
public class a4�����������  extends Thread{
	
	Socket socket;
	
	public a4�����������(Socket socket){
		this.socket = socket;
	}
	
	
	@Override
	public void run() {
		try {
			
			
			
			
			//��ȡsocket�����������
			OutputStream outputStream = socket.getOutputStream();
			
			outputStream.write("<!DOCTYPE html><html><head><meta charset='UTF-8'><title></title></head><body>��ð������</body></html>".getBytes());
			
			//�ر���Դ
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		//����tcp�ķ�����
		ServerSocket serverSocket = new ServerSocket(5001);
		
		//���ϵĽ��ܿͻ��˵�����
		while(true){
			Socket socket = serverSocket.accept();
			new a4�����������(socket).start();
		}
		
	}

}
