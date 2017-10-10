package cn.itcast.缓冲练习;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class a1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner  scanner = new Scanner(System.in);
		while(true){
			System.out.println("请选择功能：A(用户登陆)    B(注册用户)      Q(退出系统)");
			String option = scanner.next();
			
			if("a".equalsIgnoreCase(option)){
				System.out.println("登录");
				register();
			}else if("b".equalsIgnoreCase(option)){
				signIn();
			}else if("Q".equalsIgnoreCase(option)){
				System.exit(0);
			}else{
				System.out.println("你的输入有误，请重新输入...");
				
			}
		
		}
	}
	
	public static void register() throws IOException {
		File file = new File("F:\\新建文件夹\\fileceshi\\user.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		Scanner  scanner = new Scanner(System.in);
		System.out.println("请输入用户名！");
		String userName = scanner.next();
		System.out.println("请输入密码！");
		String userPass = scanner.next();
		
		String lineStrin = null;
		while((lineStrin = bufferedReader.readLine()) != null){
			String[] user = lineStrin.split(" ");
			if(user[0].equals(userName) && user[1].equals(userPass)){
				System.out.println("登录成功");
				bufferedReader.close();
				return;
			}
		}
		bufferedReader.close();
		System.out.println("账号或者密目错误");
	}
	public static void signIn() throws IOException {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("请输入要注册的用户名！");
		String userName = scanner.next();
		System.out.println("请输入要注册的密码！");
		String userPass = scanner.next();
		
		File file = new File("F:\\新建文件夹\\fileceshi\\user.txt");
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(userName + " " + userPass);
		bufferedWriter.newLine();
		bufferedWriter.close();
		System.out.println("注册成功");
		
	}
	
}
