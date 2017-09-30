package cn.itcast.buffered;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
我们清楚读取文件数据使用缓冲数组读取效率更高，sun也知道使用缓冲数组读取效率更高，那么
这时候sun给我们提供了一个-----》缓冲输入字节流对象，让我们可以更高效率读取文件



输入字节流体系：
----------| InputStream    输入字节流的超类
---------------| FileInputStream  读取文件数据的输入字节流
--------------------------| BufferedInputStream   缓冲输入字节流，缓冲输入字节流的出现主要是为了提高读取文件数据的效率

其实该类内部只不过是维护了一个8KB的字节数组而已

注意：凡是缓冲流都不具备读写文件的能力。



使用BufferedInputStream的步骤  ：
	1.找到目标文件。


*/
public class a1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read2();
	}
	public static void read2() throws IOException {
		//找到目标文件
		File file = new File("F:\\新建文件夹\\fileceshi\\a.txt");
		
		//建立数据的输入通道
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//建立缓冲输入字节流
		
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		
		//读取文件数据
		int content = 0;
		
		while((content = bufferedInputStream.read())!= -1){
			System.out.println((char)content);
		}
		//关闭资源
		bufferedInputStream.close();
		
	}
	
	public static void read1() throws IOException {
		//找到目标文件
		File file = new File("F:\\新建文件夹\\fileceshi\\a.txt");
		
		//建立数据的输入通道
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//建立缓冲字节数组，配合循环读取文件的数据。
		int length = 0;  //保存每次读取到的字节个数
		byte[] buf = new byte[1024];	//缓冲数组的长度一般是1024的倍数     理论上缓冲数组越大效率越高
		
		// fileInputStream.read(buf);  //read方法如果读到了文件的末尾，那么会返回-1
		while ((length = fileInputStream.read(buf)) != -1) {
			System.out.println(new String(buf,0,length));
		}
		fileInputStream.close();
	}
	
	
}
