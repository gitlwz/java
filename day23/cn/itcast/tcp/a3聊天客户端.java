package cn.itcast.tcp;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
���󣺿ͻ���������һ��һ�����졣


*/


//����Ŀͻ���
public class a3����ͻ��� {
	
	
	
	
	public static void mian(String[] args) throws UnknownHostException, IOException {
		//����tcp�Ŀͻ��˷���
		Socket socket = new Socket(InetAddress.getLocalHost(),9090);
		
		
		//��ȡsocket�����������
		OutputStreamWriter outputStreamWriter = new  OutputStreamWriter(socket.getOutputStream());
		
		
		
	}
	
}
