package cn.itcast.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
�ֽ������ֽ�����ȡ�����ļ��еĶ��������ݣ����������ݲ��������ת�����㿴�����ַ���

�ַ������ַ�����Ѷ����Ķ��������ݽ��ж�Ӧ�ı�������빤����  �ַ���  = �ֽ��� + ����������룩

�����ַ���

-------------| Reader �����ַ����Ļ��� ������
-----------------| FileReader ��ȡ�ļ��������ַ���


FileReader���÷���
	1.�ҵ�Ŀ���ļ�
	2���������ݵ�����ͨ��
*/
public class a2�ַ��� {

	public static void main(String[] args) throws IOException {
//		read1();
		read2();
	}
	//ʹ�û����ַ������ȡ�ļ�
	public static void read2() throws IOException {
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
		
		//�������ݵ�����ͨ��
		FileReader fileReader = new FileReader(file);
		
		//���������ַ������ȡ�ļ�����
		char[] buf = new char[1024];
		
		int length = 0;
		while((length = fileReader.read(buf)) != -1){
			System.out.println(new String(buf,0,length));
		}
	}
	
	public static void read1() throws IOException {
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
		
		//�������ݵ�����ͨ��
		FileReader fileReader = new FileReader(file);
		
		int content = 0;
		while ((content = fileReader.read()) != -1) {  //ÿ��ֻ���ȡһ���ַ�
			System.out.println((char)content);
			
		}
		fileReader.close();
	}
	
}
