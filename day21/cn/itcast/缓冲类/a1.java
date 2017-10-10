package cn.itcast.缓冲类;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
输入字符流
-------| Reader 所有输入字符流的基类，抽象类
---------| FileReader 读取文件字符串的输入字符流。
---------| BufferedReader 缓冲输入字符流 .出现的目的：为了提高读取文件字符的效率和拓展了FileReader的功能。该类内部也是维护了一个字符数组


BufferedReader的使用步骤
	1。找到目标文件。
	2.建立数据通道
	3.建立缓冲输入字符流
	4.读取数据

*/
public class a1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read1();
	}
	
	public static void read1() throws IOException {
		//找到目标文件
		File file = new File("F:\\新建文件夹\\fileceshi\\a.txt");
		//建立数据通道。
		FileReader fileReader = new FileReader(file);
		
		//建立缓冲输入字符流
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//读取数据
		/*
		int content = bufferedReader.read();  //读到了一个字符。读取到的字符肯定也是从BufferedReader内部的字符数组中获取得到。所以效率高。
		System.out.println((char)content);
		*/
		
		//使用BufferedReader拓展的功能，readLine()  一次读取一行文本，如果读到了文件的末尾返回null
		
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
			
		}
		
		
		bufferedReader.close();
	}

}
