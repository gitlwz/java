package cn.itcast.������;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
����ַ���
--------| Writer ��������ַ����Ļ��࣬������
-------------| FileWriter ���ļ�����ַ����ݵ�����ַ���
-------------| BufferedWriter ��������ַ���  �����FileWriter��д����Ч������չFileWriter�Ĺ���

BufferedWriter�ڲ�ֻ�������ṩ��һ��8192���ȵ��ַ�������Ϊ���������ѣ���չ��FileWriter�Ĺ���

��ϰ��������������ַ��� �û���¼ע�ᡣ����

*/
public class a2��������ַ��� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		write1();
	}
	
	public static void write1() throws IOException {
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\�½��ļ���\\fileceshi\\b.txt");
		
		FileWriter fileWriter = new FileWriter(file,true);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 
		
		//д����
		bufferedWriter.newLine();  //newLine() ���С�ʵ���Ͼ������ļ����\r\n
		bufferedWriter.write("ǰ�������ǿ���ܸ���");
		
		//�ر���Դ
		bufferedWriter.flush();
		bufferedWriter.close();
	}
	
}
