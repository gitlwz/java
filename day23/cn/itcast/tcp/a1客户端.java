package cn.itcast.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 ��java������ͨѶҲ����Socket(����)ͨѶ��Ҫ��ͨѶ����̨����������Ҫ��װSocket.
 
 ��ͬ��Э����в�ͬ�Ĳ���(Socket)
 
 UDPͨѶЭ����ص㣺
	1. �����ݼ���װΪ���ݰ������������ӡ�
	2. ÿ�����ݰ���С������64K��
	3. ��Ϊ�����ӣ����Բ��ɿ�
	4. ��Ϊ����Ҫ�������ӣ������ٶȿ�
	5. udp ͨѶ�ǲ��ַ������ͻ��˵ģ�ֻ�ַ��Ͷ�����նˡ�
	
	���磺 ��ܵĶԽ���, ��Q���졢 ��Ϸ...
 
 
 
 TCPͨѶЭ���ص㣺
 	1.tcp�ǻ���IO���������ݵĴ���ģ���������
 	2.tcp�������ݴ����ʱ����û�д�С���Ƶġ�
 	3.tcp���������ӣ�ͨ���������ֵĻ��Ʊ�֤���ݵ������ԡ��ɿ�Э��
 	4.tcp���������ӵģ������ٶ�����
 	5.tcp�����ֿͻ��������˵�
 	
 	
 	���磺��绰��QQ\feiQ���ļ����䡢Ѹ������...


tcpЭ���µ�Socket:
	
	Socket        	�ͻ����� ��tcp�Ŀͻ���һ����������Ҫ�����˽�������
	ServerSocket	�������


tcp�Ŀͻ���ʹ�ò��裺
	1.����tcp�Ŀͻ��˷���
	2.��ȡ����Ӧ��������


*/


//tcp�ͻ���
public class a1�ͻ��� {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//����tcp�ķ���
		Socket socket = new Socket(InetAddress.getLocalHost(), 9091);
		
		//��ȡ��Socket�����������
		OutputStream outputStream = socket.getOutputStream();
		
		//������������������д������
		outputStream.write("��������".getBytes());
		
		
		//��ȡ��һ�����������󣬶�ȡ����˻��͵�����
		InputStream inputStream = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length = inputStream.read(buf);
		
		System.out.println(new String(buf,0,length));
		
		//�ر���Դ
		socket.close();
		
		
	}

}
