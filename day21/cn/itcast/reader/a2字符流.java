package cn.itcast.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
字节流：字节流读取的是文件中的二进制数据，读到的数据并不会帮你转换成你看懂的字符。

字符流：字符流会把读到的二进制数据进行对应的编码与解码工作。  字符流  = 字节流 + （编码与解码）

输入字符流

-------------| Reader 输入字符流的基类 抽象类
-----------------| FileReader 读取文件的输入字符流


FileReader的用法：
	1.找到目标文件
	2。建立数据的输入通道
*/
public class a2字符流 {

	public static void main(String[] args) throws IOException {
//		read1();
		read2();
	}
	//使用缓冲字符数组读取文件
	public static void read2() throws IOException {
		//找到目标文件
		File file = new File("F:\\新建文件夹\\fileceshi\\a.txt");
		
		//建立数据的输入通道
		FileReader fileReader = new FileReader(file);
		
		//建立缓冲字符数组读取文件数据
		char[] buf = new char[1024];
		
		int length = 0;
		while((length = fileReader.read(buf)) != -1){
			System.out.println(new String(buf,0,length));
		}
	}
	
	public static void read1() throws IOException {
		//找到目标文件
		File file = new File("F:\\新建文件夹\\fileceshi\\a.txt");
		
		//建立数据的输入通道
		FileReader fileReader = new FileReader(file);
		
		int content = 0;
		while ((content = fileReader.read()) != -1) {  //每次只会读取一个字符
			System.out.println((char)content);
			
		}
		fileReader.close();
	}
	
}
