package cn.itcast.合并;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;

import javax.imageio.stream.FileImageInputStream;

/*
 SequenceInputStream(序列流)
 
 
 
 
需求：把a.txt与b.txt文件的内容合并。


*/
public class a1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		merge2();
	}
	//使用SequenceInputStream 合并文件
	public static void merge2() throws IOException {
		//找到目标文件
		File inFile1 = new File("D:\\mypc\\learn\\fujian\\a.txt");
		File inFile2 = new File("D:\\mypc\\learn\\fujian\\b.txt");
		File outFole = new File("D:\\mypc\\learn\\fujian\\c.txt");
		
		//建立数据通道
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		
		FileOutputStream fileOutputStream = new FileOutputStream(outFole);
		//建立序列流对象
		SequenceInputStream inputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);
		
		byte[] buf = new byte[1024];
		int length = 0;
		
		while((length = inputStream.read(buf)) != -1){
			fileOutputStream.write(buf, 0, length);
		}
		
		//关闭资源
		inputStream.close();
		fileOutputStream.close();
		
	}
	
	
//	需求：把a.txt与b.txt文件的内容合并。
	public static void merge1() throws IOException {
		//找到目标文件
		File inFile1 = new File("D:\\mypc\\learn\\fujian\\a.txt");
		File inFile2 = new File("D:\\mypc\\learn\\fujian\\b.txt");
		File outFole = new File("D:\\mypc\\learn\\fujian\\c.txt");
		
		//建立数据通道
		FileInputStream fileInputStream1 = new FileInputStream(inFile1);
		FileInputStream fileInputStream2 = new FileInputStream(inFile2);
		
		FileOutputStream fileOutputStream = new FileOutputStream(outFole);
		
		ArrayList<FileInputStream> list  = new ArrayList<FileInputStream>();
		
		list.add(fileInputStream1);
		list.add(fileInputStream2);
		
		//转呗一个缓冲数组
		byte[] buf = new byte[1024];
		int length = 0;
		
		for(int i = 0; i<list.size();i++){
			FileInputStream fileInputStream = list.get(i);
			
			while((length = fileInputStream.read(buf)) != -1){
				fileOutputStream.write(buf,0,length);
			}
			
			//关闭资源
			fileInputStream.close();
		}
		fileOutputStream.close();
	}
	
	
	
}
