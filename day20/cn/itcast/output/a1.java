package cn.itcast.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
---------| OutputStream ����������ֽڵĳ���

---------------|FileOutputStream  ���ļ�������ݵ�����ֽ���

FileOutputStreamʹ�ò���
	1.�ҵ�Ŀ���ļ�

*/
public class a1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\�½��ļ���\\fileceshi\\b.txt");
		
		//�������ݵ����ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream(file);
			
		
		
	}

}
