package cn.itcast.�ϲ�;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;

import javax.imageio.stream.FileImageInputStream;

/*
 SequenceInputStream(������)
 
 
 
 
���󣺰�a.txt��b.txt�ļ������ݺϲ���


*/
public class a1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		merge2();
	}
	//ʹ��SequenceInputStream �ϲ��ļ�
	public static void merge2() throws IOException {
		//�ҵ�Ŀ���ļ�
		File inFile1 = new File("D:\\mypc\\learn\\fujian\\a.txt");
		File inFile2 = new File("D:\\mypc\\learn\\fujian\\b.txt");
		File outFole = new File("D:\\mypc\\learn\\fujian\\c.txt");
		
		//��������ͨ��
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		
		FileOutputStream fileOutputStream = new FileOutputStream(outFole);
		//��������������
		SequenceInputStream inputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);
		
		byte[] buf = new byte[1024];
		int length = 0;
		
		while((length = inputStream.read(buf)) != -1){
			fileOutputStream.write(buf, 0, length);
		}
		
		//�ر���Դ
		inputStream.close();
		fileOutputStream.close();
		
	}
	
	
//	���󣺰�a.txt��b.txt�ļ������ݺϲ���
	public static void merge1() throws IOException {
		//�ҵ�Ŀ���ļ�
		File inFile1 = new File("D:\\mypc\\learn\\fujian\\a.txt");
		File inFile2 = new File("D:\\mypc\\learn\\fujian\\b.txt");
		File outFole = new File("D:\\mypc\\learn\\fujian\\c.txt");
		
		//��������ͨ��
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		
		FileOutputStream fileOutputStream = new FileOutputStream(outFole);
		
		ArrayList<FileInputStream> list  = new ArrayList<FileInputStream>();
		
		list.add(fileInputStream1);
		list.add(fileInputStream2);
		
		//ת��һ����������
		byte[] buf = new byte[1024];
		int length = 0;
		
		for(int i = 0; i<list.size();i++){
			FileInputStream fileInputStream = list.get(i);
			
			while((length = fileInputStream.read(buf)) != -1){
				fileOutputStream.write(buf,0,length);
			}
			
			//�ر���Դ
			fileInputStream.close();
		}
		fileOutputStream.close();
	}
	
	
	
}
