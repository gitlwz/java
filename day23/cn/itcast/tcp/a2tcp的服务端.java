package cn.itcast.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*



ΪʲôServerSocket�����һ��getInputStream��getOutputStream�����أ�

*/

//�����
public class a2tcp�ķ���� {

	public static void main(String[] args) throws IOException {
		//����tcp�ķ���� ,���Ҽ���һ���˿�
		ServerSocket serverSocket = new ServerSocket(9091);
		
		//���ܿͻ��˵�����
		Socket socket = serverSocket.accept(); //accept() ���ܿͻ��˵Ľ������÷�����һ�������ͷ���
			
		//��ȡ���������󣬶�ȡ�ͻ��˷��͵�����
		InputStream inputStream = socket.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int length = 0;
		
		length = inputStream.read(buf);
		
		System.out.println("����˽��գ�" + new String(buf,0,length));
		
		
		//��ȡSocket�����������ͻ��˷�������
		OutputStream outputStream = socket.getOutputStream();
		
		outputStream.write("�ͻ�����Ҳ�ð�".getBytes());
		
		
		//�ر���Դ
		serverSocket.close();
		
		
	}

}
