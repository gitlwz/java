package cn.itcast.udpЭ��;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
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
 
 
 
udpЭ���µ�Socket

	DatagramSocket(udp��������)
	DatagramPacket(���ݰ�)
		DatagramPacket(buf, length, address, port)
		buf:���͵���������
		length�����͵���������
		address:���͵�Ŀ�ĵص�IP��ַ����
		port:�˿ں�
���Ͷ˵�ʹ�ò���

	1.����udp�ķ���
	2.׼�����ݣ������ݷ�װ�����ݰ��з��͡����Ͷ˵����ݰ�Ҫ����ip��ַ��˿ں�
	3.����udp�ķ��񣬷�������
	4,���ر���Դ

 */
public class a1���Ͷ� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Demo1Sender();
	}
	
	//���Ͷ�
	public static void Demo1Sender() throws IOException {
		//����udp�ķ���
		DatagramSocket datagramSocket = new DatagramSocket();
		
		//׼�����ݣ������ݷ�װ�����ݰ��С�
		String data = "������ҵ�һ��udp������..";
		
		//����һ�����ݰ�
		DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length,InetAddress.getLocalHost() , 9090);
		
		//����udp�ķ��������ݰ�
		datagramSocket.send(datagramPacket);
		
		//�ر���Դ---ʵ���Ͼ����ͷ�ռ�õĶ˿ں�
		datagramSocket.close();
	}
	
	
}
