package cn.itcast.ת����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
ת������

�����ֽ�����ת������
	InputStreamReader


����ֽ���ת����
	OutputStreamWriter    ���԰�����ֽ���ת���ַ�����

ת���������ã�
	1.���Ŀǰ����ȡ������һ���ֽ�����Ҫת���ַ���ʹ�ã���ʱ��Ϳ���ʹ��ת�������ַ���---> �ַ�����
	2.ʹ��ת��������ָ���������ж�д�ļ���

*/
public class a1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read();
	}
	public static void write2() throws IOException {
		File file = new File("D:\\mypc\\learn\\fujian\\d.txt");
		//�������ݵ����ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//������ֽ���ת�����ַ�������ָ�������
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		outputStreamWriter.write("���й��ð�");
		//�ر���Դ
		outputStreamWriter.close();
	}
	public static void write() throws IOException {
		File file = new File("D:\\mypc\\learn\\fujian\\d.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		//������ֽ���ת���ַ���
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		outputStreamWriter.write("��Һ�");
		outputStreamWriter.close();
	}
	
	public static void read() throws IOException {
       InputStream in =	System.in;
//       System.out.println("�������ַ�" + (char)in.read());  //
       
       //��Ҫ���ֽ���ת�����ַ���
       InputStreamReader inputStreamReader = new InputStreamReader(in);
       
       //ʹ���ֽ���������
       BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
       
       System.out.println("�������ַ�" + bufferedReader.readLine());
	}
}
