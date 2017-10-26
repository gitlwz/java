package cn.itcast.��ҵ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class ��¼ע������  extends Thread{
	Socket socket;
	
	static File file = new File("F:\\users.properties");
	
	public ��¼ע������(Socket socket){
		this.socket =socket;
	}
	
	static{
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run() {
		try {
			// ��ȡsocket������������
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			// ��ȡsocket�����������
			OutputStreamWriter socketOut = new OutputStreamWriter(
					socket.getOutputStream());

			// ��ȡ�ͻ����������Ϣ
			String info = bufferedReader.readLine();
			String[] datas = info.split(" ");
			// ��ȡ���û� ��ѡ����
			String option = datas[0];
			// ע��
			String userName = datas[1];

			String password = datas[2];

			if ("a".equalsIgnoreCase(option)) {
				// ��½
				Properties properties = new Properties();
				// ���������ļ�
				properties.load(new FileReader(file));
				if (properties.containsKey(userName)) {
					String tempPass = properties.getProperty(userName);
					if (password.equals(tempPass)) {
						socketOut.write("��ӭ" + userName + "��½�ɹ�\r\n");

					} else {
						socketOut.write("�������\r\n");
					}

				} else {
					socketOut.write("�û��������ڣ�����������...\r\n");
				}

				socketOut.flush();

			} else if ("b".equalsIgnoreCase(option)) {

				// ����һ�������ļ���
				Properties properties = new Properties();
				//����ԭ���������ļ�
				properties.load(new FileReader(file));
				if (!properties.containsKey(userName)) {
					// �����ڸ��û���
					properties.setProperty(userName, password);
					// ����һ�������ļ�
					properties.store(new FileWriter(file), "users");
					socketOut.write("ע��ɹ�../r/b");
				} else {
					// �����û���
					socketOut.write("�û����Ѿ���ע�ᣬ����������/r/b");
				}
				socketOut.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9090);
		while(true){
			Socket socket = serverSocket.accept();
			new ��¼ע������(socket).start();
		}
	}

}
