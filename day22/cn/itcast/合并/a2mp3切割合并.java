package cn.itcast.�ϲ�;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 
 ���� ��һ��mp3���и��n�ݣ�Ȼ���ٰ���Щ�ļ��ϲ�������
 
 */


public class a2mp3�и�ϲ� {

	public static void main(String[] args) throws IOException {
//		cutFile();
		mergeFlile();
	}
	
	//�ϲ�
	public static void mergeFlile() throws IOException{
		//�ҵ�Ŀ���ļ�
		File dir = new File("F:\\music");
		//ͨ��Ŀ���ļ����ҵ����е�MP3�ļ���Ȼ������е�MP3�ļ���ӵ�vector�С�
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.getName().endsWith(".mp3")){
				vector.add(new FileInputStream(file));
			}
		}
		//ͨ��Vector��ȡ������
		Enumeration<FileInputStream> e = vector.elements();
		//����������
		SequenceInputStream inputStream = new SequenceInputStream(e);
		//�����ļ������ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\�ϲ�.mp3");
		//�������������ȡ�ļ�
		byte[] buf = new byte[1024];
		int length = 0 ; 
		while((length =  inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//�ر���Դ
		fileOutputStream.close();
		inputStream.close();
		
	}
	
	
	
	//�и�MP3
	public static void cutFile() throws IOException{
		File file = new File("F:\\��Ů\\1.mp3");
		//Ŀ���ļ���
		File dir = new File("F:\\music");
		//�������ݵ�����ͨ��
		FileInputStream fileInputStream = new FileInputStream(file);
		//�������������ȡ
		byte[] buf = new byte[1024*1024];
		int length = 0;
		for(int i = 0 ;  (length = fileInputStream.read(buf))!=-1 ; i++){
			FileOutputStream fileOutputStream =	new FileOutputStream(new File(dir,"part"+i+".mp3"));
			fileOutputStream.write(buf,0,length);
			fileOutputStream.close();
		}
		//�ر���Դ
		fileInputStream.close();
	}
	
	
}
