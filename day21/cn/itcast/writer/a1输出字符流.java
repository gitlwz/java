package cn.itcast.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
����ַ���

--------| Writer ����ַ����Ļ��ࡣ������
-----------| FileWriter ���ļ���������ַ��� ��д��	

FileWriter��ʹ�ò��裺
	1.�ҵ�Ŀ���ļ���
	
	
FileWriterҪע��
	1. ʹ��FileWriterд���ݵ�ʱ��FileWriter�ڲ���ά����һ��1024���ַ�����ģ�д���ݵ�ʱ�����д�뵽���ڲ�ά�����ַ������У������Ҫ
	����������д��Ӳ���ϣ���Ҫ����flush������close�����������������ڲ����ַ����顣
	2. ʹ��FileWriter��ʱ�����Ŀ���ļ������ڣ���ô���Զ�����Ŀ���ļ���
	3.ʹ��FileWriter��ʱ�� ���Ŀ���ļ��Ѿ������ˣ���ôĬ�������������ļ��е����ݣ�Ȼ����д������ �� �����Ҫ��ԭ���Ļ�����׷�����ݣ�
	��Ҫʹ�á�new FileWriter(File , boolean)���Ĺ��췽�����ڶ�����Ϊtrue��
	
��ϰ��ʹ���ַ�������һ���ı��ļ���java�ļ���.

ʹ���ַ�������һ��ͼƬ���۲�ͼƬ�Ĵ�С�仯��˼��Ϊʲô��
*/
public class a1����ַ��� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		write1();
	}
	public static void write1() throws IOException {
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\�½��ļ���\\fileceshi\\b.txt");
		
		//�����������ͨ��
		FileWriter fileWriter = new FileWriter(file,true);
		
		//׼�����ݣ�������д��
		String data = "����a����a��aa��a��a";
		
		fileWriter.write(data);
		
		fileWriter.flush();
		
		fileWriter.close();
	}
	
	

}
