package cn.itcast.��ҵ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.naming.ldap.SortControl;

public class ͼƬ����  extends Thread{
	Socket socket;
	
	public ͼƬ����(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			
			
			
			
			//��ȡ�����������
			OutputStream outputStream = socket.getOutputStream();
			
			//��ȡͼƬ������������
			FileInputStream fileInputStream = new FileInputStream("F:\\�½��ļ���\\fileceshi\\timg.jpg");
			//����ͼƬ���ݣ�������д��
			byte[] buf = new byte[1024];
			int length = 0;
			while((length = fileInputStream.read(buf)) != -1){
				outputStream.write(buf,0,length);
			}
			
			String ip = socket.getInetAddress().getHostAddress();  //��ȡ�Է���ip��ַ����
			
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
		System.out.println("������");
		while (true) {
			//���ܿͻ�������
			Socket socket = serverSocket.accept();
			new ͼƬ����(socket).start();
			
		}
	}

}
