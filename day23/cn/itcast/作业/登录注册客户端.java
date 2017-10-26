package cn.itcast.作业;

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



public class 登录注册客户端 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(),9090);
		//获取到socket的输出流对象
		OutputStreamWriter socketout = new OutputStreamWriter(socket.getOutputStream());
		
		//获取到socket的输入流对象
		BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		//获取到键盘的输入流对象
		BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true){
			System.out.println("请选择功能 A（登录）    B（注册）");
			String option = keyReader.readLine();
			if("a".equalsIgnoreCase(option)){
				getInfo(socketout,keyReader, option);
				//读取服务器反馈的信息
			 String line =	socketReader.readLine();
			 System.out.println(line);
			}else if("b".equalsIgnoreCase(option)){
				getInfo(socketout,keyReader, option);	
				//读取服务器反馈的信息
				 String line =	socketReader.readLine();
				 System.out.println(line);
			}
		}
	}

	private static void getInfo(OutputStreamWriter socketout,BufferedReader keyReader, String option)
			throws IOException {
		System.out.println("请输入用户名"); 
		String userName = keyReader.readLine();
		
		System.out.println("请输入密码");
		String password = keyReader.readLine();
		String info = option+ " " + userName+" " + password + "\r\n";
		socketout.write(info);
		socketout.flush();
	}

}
