package cn.itcast.buffered;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
���������ȡ�ļ�����ʹ�û��������ȡЧ�ʸ��ߣ�sunҲ֪��ʹ�û��������ȡЧ�ʸ��ߣ���ô
��ʱ��sun�������ṩ��һ��-----�����������ֽ������������ǿ��Ը���Ч�ʶ�ȡ�ļ�



�����ֽ�����ϵ��
----------| InputStream    �����ֽ����ĳ���
---------------| FileInputStream  ��ȡ�ļ����ݵ������ֽ���
--------------------------| BufferedInputStream   ���������ֽ��������������ֽ����ĳ�����Ҫ��Ϊ����߶�ȡ�ļ����ݵ�Ч��

��ʵ�����ڲ�ֻ������ά����һ��8KB���ֽ��������

ע�⣺���ǻ����������߱���д�ļ���������



ʹ��BufferedInputStream�Ĳ���  ��
	1.�ҵ�Ŀ���ļ���


*/
public class a1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read2();
	}
	public static void read2() throws IOException {
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
		
		//�������ݵ�����ͨ��
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//�������������ֽ���
		
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		
		//��ȡ�ļ�����
		int content = 0;
		
		while((content = bufferedInputStream.read())!= -1){
			System.out.println((char)content);
		}
		//�ر���Դ
		bufferedInputStream.close();
		
	}
	
	public static void read1() throws IOException {
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
		
		//�������ݵ�����ͨ��
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//���������ֽ����飬���ѭ����ȡ�ļ������ݡ�
		int length = 0;  //����ÿ�ζ�ȡ�����ֽڸ���
		byte[] buf = new byte[1024];	//��������ĳ���һ����1024�ı���     �����ϻ�������Խ��Ч��Խ��
		
		// fileInputStream.read(buf);  //read��������������ļ���ĩβ����ô�᷵��-1
		while ((length = fileInputStream.read(buf)) != -1) {
			System.out.println(new String(buf,0,length));
		}
		fileInputStream.close();
	}
	
	
}
