package cn.itcast.缓冲类;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
输出字符流
--------| Writer 所有输出字符流的基类，抽象类
-------------| FileWriter 向文件输出字符数据的输出字符流
-------------| BufferedWriter 缓冲输出字符流  ：提高FileWriter的写数据效率与拓展FileWriter的功能

BufferedWriter内部只不过是提供了一个8192长度的字符数组作为缓冲区而已，拓展了FileWriter的功能

练习：缓冲输入输出字符流 用户登录注册。。。

*/
public class a2缓冲输出字符流 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		write1();
	}
	
	public static void write1() throws IOException {
		//找到目标文件
		File file = new File("F:\\新建文件夹\\fileceshi\\b.txt");
		
		FileWriter fileWriter = new FileWriter(file,true);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 
		
		//写数据
		bufferedWriter.newLine();  //newLine() 换行。实际上就是向文件输出\r\n
		bufferedWriter.write("前两天李克强来萝岗了");
		
		//关闭资源
		bufferedWriter.flush();
		bufferedWriter.close();
	}
	
}
