package cn.itcast.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
---------| OutputStream 是所有输出字节的超类

---------------|FileOutputStream  向文件输出数据的输出字节流

FileOutputStream使用步骤
	1.找到目标文件
	2.建立数据的输出通道。
	3.把数据转换成字节数组写出。
	4.关闭资源。
	
FileOutputStream要注意的细节
	1.使用FileOutputStream的时候，如果目标文件不存在，那么会自动创建目标文件对象。
	2.如果目标文件已经存在，那么会先清空目标文件中的数据，然后在写入数据。
	3.如果目标文件已经存在，需要在原来数据基础上追加数据的时候应该使用new FileOutputStream(file,true)构造方法
	4.write写数据的时候，虽然接受的是一个int类型的数据，但是真正写出的只是一个字节的数据，只是把第八位的二进制数据写出，其他二十四位数据全部丢弃。
*/
public class a1 {

	public static void main(String[] args) throws IOException {
//		write1();
		write2();
		
	}
	public static void write1() throws IOException {
		//找到目标文件
		File file = new File("F:\\新建文件夹\\fileceshi\\b.txt");
		
		//建立数据的输出通道
		FileOutputStream fileOutputStream = new FileOutputStream(file);
			
		//把数据写出
		fileOutputStream.write('h');
		
		//关闭资源
		fileOutputStream.close();
	}
	
	
	//使用字节数组 把数据写出
	public static void write2() throws IOException {
		//找到目标文件
		File file = new File("F:\\新建文件夹\\fileceshi\\b.txt");
		
		//建立数据的输出通道
		FileOutputStream fileOutputStream = new FileOutputStream(file,true);
		
		//
		String data = "\r\nhello world";
		fileOutputStream.write(data.getBytes());
		
		fileOutputStream.close();
		
		
	}
}
