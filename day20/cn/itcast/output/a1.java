package cn.itcast.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
---------| OutputStream ����������ֽڵĳ���

---------------|FileOutputStream  ���ļ�������ݵ�����ֽ���

FileOutputStreamʹ�ò���
	1.�ҵ�Ŀ���ļ�
	2.�������ݵ����ͨ����
	3.������ת�����ֽ�����д����
	4.�ر���Դ��
	
FileOutputStreamҪע���ϸ��
	1.ʹ��FileOutputStream��ʱ�����Ŀ���ļ������ڣ���ô���Զ�����Ŀ���ļ�����
	2.���Ŀ���ļ��Ѿ����ڣ���ô�������Ŀ���ļ��е����ݣ�Ȼ����д�����ݡ�
	3.���Ŀ���ļ��Ѿ����ڣ���Ҫ��ԭ�����ݻ�����׷�����ݵ�ʱ��Ӧ��ʹ��new FileOutputStream(file,true)���췽��
	4.writeд���ݵ�ʱ����Ȼ���ܵ���һ��int���͵����ݣ���������д����ֻ��һ���ֽڵ����ݣ�ֻ�ǰѵڰ�λ�Ķ���������д����������ʮ��λ����ȫ��������
*/
public class a1 {

	public static void main(String[] args) throws IOException {
//		write1();
		write2();
		
	}
	public static void write1() throws IOException {
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\�½��ļ���\\fileceshi\\b.txt");
		
		//�������ݵ����ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream(file);
			
		//������д��
		fileOutputStream.write('h');
		
		//�ر���Դ
		fileOutputStream.close();
	}
	
	
	//ʹ���ֽ����� ������д��
	public static void write2() throws IOException {
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\�½��ļ���\\fileceshi\\b.txt");
		
		//�������ݵ����ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream(file,true);
		
		//
		String data = "\r\nhello world";
		fileOutputStream.write(data.getBytes());
		
		fileOutputStream.close();
		
		
	}
}
