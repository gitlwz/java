package cn.itcast.udpЭ��;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/*
 
 ���ܶ˵�ʹ�ò���
 	1.����udp�ķ���
 	2.׼���յ����ݰ���������
 	3.����udp�ķ����������
 	4.�ر���Դ
 
 
 
 
 */


public class a1���ն� {

	public static void main(String[] args) throws IOException {
		
		//����udp�ķ���  �����Ҽ���һ���˿ں�
		DatagramSocket datagramSocket = new DatagramSocket(9090);
		
		//׼���յ����ݰ����ڴ�����ݡ�
		byte[] buf = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
		
		//����udp�ķ����������
		datagramSocket.receive(datagramPacket); //receive��һ�������Եķ���
		
		
		System.out.println(new String(buf,0,datagramPacket.getLength())); //getLength��ȡ���ݰ��洢�˶��ٸ���Դ
		
		//�ر���Դ
		datagramSocket.close();
	}

}
