package cn.itcast.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class a3�ֽ�����ϰ {

	public static void main(String[] args) throws IOException, InterruptedException {
		copy();

	}
	
	public  static void copy() throws IOException, InterruptedException {
		File file = new File("F:\\�½��ļ���\\fileceshi\\timg.jpg");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\�½��ļ���\\timg.jpg");
		
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		
		int content = 0;
		while((content = bufferedInputStream.read()) != -1){
			bufferedOutputStream.write(content);
		}
		bufferedOutputStream.flush();
		bufferedOutputStream.close();
		bufferedInputStream.close();
		
		
		
	}
}
