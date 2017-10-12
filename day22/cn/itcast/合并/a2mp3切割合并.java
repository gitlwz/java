package cn.itcast.合并;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 
 需求： 把一首mp3先切割成n份，然后再把这些文件合并起来。
 
 */


public class a2mp3切割合并 {

	public static void main(String[] args) throws IOException {
//		cutFile();
		mergeFlile();
	}
	
	//合并
	public static void mergeFlile() throws IOException{
		//找到目标文件
		File dir = new File("F:\\music");
		//通过目标文件夹找到所有的MP3文件，然后把所有的MP3文件添加到vector中。
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.getName().endsWith(".mp3")){
				vector.add(new FileInputStream(file));
			}
		}
		//通过Vector获取迭代器
		Enumeration<FileInputStream> e = vector.elements();
		//创建序列流
		SequenceInputStream inputStream = new SequenceInputStream(e);
		//建立文件的输出通道
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\合并.mp3");
		//建立缓冲数组读取文件
		byte[] buf = new byte[1024];
		int length = 0 ; 
		while((length =  inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		//关闭资源
		fileOutputStream.close();
		inputStream.close();
		
	}
	
	
	
	//切割MP3
	public static void cutFile() throws IOException{
		File file = new File("F:\\美女\\1.mp3");
		//目标文件夹
		File dir = new File("F:\\music");
		//建立数据的输入通道
		FileInputStream fileInputStream = new FileInputStream(file);
		//建立缓冲数组读取
		byte[] buf = new byte[1024*1024];
		int length = 0;
		for(int i = 0 ;  (length = fileInputStream.read(buf))!=-1 ; i++){
			FileOutputStream fileOutputStream =	new FileOutputStream(new File(dir,"part"+i+".mp3"));
			fileOutputStream.write(buf,0,length);
			fileOutputStream.close();
		}
		//关闭资源
		fileInputStream.close();
	}
	
	
}
