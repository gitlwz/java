package cn.itcast.转换流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
转换流：

输入字节流的转换流：
	InputStreamReader


输出字节流转换流
	OutputStreamWriter    可以把输出字节流转成字符流。

转换流的作用：
	1.如果目前所获取到的是一个字节流需要转换字符流使用，这时候就可以使用转换流。字符流---> 字符流。
	2.使用转换流可以指定编码表进行读写文件。

*/
public class a1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read();
	}
	public static void write2() throws IOException {
		File file = new File("D:\\mypc\\learn\\fujian\\d.txt");
		//建立数据的输出通道
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//把输出字节流转换成字符流并且指定编码表。
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		outputStreamWriter.write("新中国好啊");
		//关闭资源
		outputStreamWriter.close();
	}
	public static void write() throws IOException {
		File file = new File("D:\\mypc\\learn\\fujian\\d.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		//把输出字节流转成字符流
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		outputStreamWriter.write("大家好");
		outputStreamWriter.close();
	}
	
	public static void read() throws IOException {
       InputStream in =	System.in;
//       System.out.println("读到的字符" + (char)in.read());  //
       
       //需要把字节流转换成字符流
       InputStreamReader inputStreamReader = new InputStreamReader(in);
       
       //使用字节流缓冲列
       BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
       
       System.out.println("读到的字符" + bufferedReader.readLine());
	}
}
