package cn.itcsat.lwz;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class �ͻ��� {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//����tcp�ķ���
		Socket socket = new Socket(InetAddress.getLocalHost(),6060);
		//��ȡsocket������������
		InputStream inputStream = socket.getInputStream();
		//��ȡ�ļ������������
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\5.jpg");
		//�߶���д
		byte[] buf = new byte[1024];
		int length = 0 ; 
		while((length = inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//�ر���Դ
		fileOutputStream.close();
		socket.close();
		
		
	}

}
