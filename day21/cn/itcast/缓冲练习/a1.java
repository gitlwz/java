package cn.itcast.������ϰ;

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
			System.out.println("��ѡ���ܣ�A(�û���½)    B(ע���û�)      Q(�˳�ϵͳ)");
			String option = scanner.next();
			
			if("a".equalsIgnoreCase(option)){
				System.out.println("��¼");
				register();
			}else if("b".equalsIgnoreCase(option)){
				signIn();
			}else if("Q".equalsIgnoreCase(option)){
				System.exit(0);
			}else{
				System.out.println("���������������������...");
				
			}
		
		}
	}
	
	public static void register() throws IOException {
		File file = new File("F:\\�½��ļ���\\fileceshi\\user.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		Scanner  scanner = new Scanner(System.in);
		System.out.println("�������û�����");
		String userName = scanner.next();
		System.out.println("���������룡");
		String userPass = scanner.next();
		
		String lineStrin = null;
		while((lineStrin = bufferedReader.readLine()) != null){
			String[] user = lineStrin.split(" ");
			if(user[0].equals(userName) && user[1].equals(userPass)){
				System.out.println("��¼�ɹ�");
				bufferedReader.close();
				return;
			}
		}
		bufferedReader.close();
		System.out.println("�˺Ż�����Ŀ����");
	}
	public static void signIn() throws IOException {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("������Ҫע����û�����");
		String userName = scanner.next();
		System.out.println("������Ҫע������룡");
		String userPass = scanner.next();
		
		File file = new File("F:\\�½��ļ���\\fileceshi\\user.txt");
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(userName + " " + userPass);
		bufferedWriter.newLine();
		bufferedWriter.close();
		System.out.println("ע��ɹ�");
		
	}
	
}
