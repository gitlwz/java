package cn.itcast.��ҵ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 
 * 
 * 
 * 
 * 
 * 
 */



public class ��¼ע��ͻ��� {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(),9090);
		//��ȡ��socket�����������
		OutputStreamWriter socketout = new OutputStreamWriter(socket.getOutputStream());
		
		//��ȡ��socket������������
		BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		//��ȡ�����̵�����������
		BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true){
			System.out.println("��ѡ���� A����¼��    B��ע�ᣩ");
			String option = keyReader.readLine();
			if("a".equalsIgnoreCase(option)){
				getInfo(socketout,keyReader, option);
				//��ȡ��������������Ϣ
			 String line =	socketReader.readLine();
			 System.out.println(line);
			}else if("b".equalsIgnoreCase(option)){
				getInfo(socketout,keyReader, option);	
				//��ȡ��������������Ϣ
				 String line =	socketReader.readLine();
				 System.out.println(line);
			}
		}
	}

	private static void getInfo(OutputStreamWriter socketout,BufferedReader keyReader, String option)
			throws IOException {
		System.out.println("�������û���"); 
		String userName = keyReader.readLine();
		
		System.out.println("����������");
		String password = keyReader.readLine();
		String info = option+ " " + userName+" " + password + "\r\n";
		socketout.write(info);
		socketout.flush();
	}

}
