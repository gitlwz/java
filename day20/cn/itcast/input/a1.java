package cn.itcast.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
File类：用于描述一个文件或者文件夹的。

通过File对象我们可以读取文件或者文件夹的属性数据，如果我们需要读取文件的内容数据，那么我们需要使用IO流技术。

IO流( Input Output);

IO流解决问题；解决设备与设备之间的数据传输问题。内存----》      	硬盘----》内存

IO流技术：


IO流分类

	如果是按照数据的流向划分
	
		输入流
		
		输出流

	如果按照处理的单位划分
	
		字节流： 字节流读取的都是文件中的二进制数据，读取到二进制数据不会经过任何的处理
		
		字符流：字符流读取的数据是以字符为单位的。字符流也是读取文件中的二进制数据。不过会把这些二进制数据转换成我们能识别的字符
			 字符流 = 字节流 + 解码
			 
			 
字节流
	输入字节流：
	-------------| InputStream
	-----------------|FileInputStram   读取文件数据的输入字节流
	
	使用FileInputStram 读取文件数据的步骤
		1.找到目标文件
		2.建立数据的输入通道
		3.读取文件中的数据
		4.
		
*/
public class a1 {

	public static void main(String[] args) throws IOException {
//		readTest2();
//		readTest3();
		readTest4();
	}
	//方式4：使用缓冲数组配合循环一起读取
	public static void readTest4() throws IOException{
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
	//方式3：使用缓冲数组读取。  缺点：无法读取完整一个文件的数据。
	public static void readTest3() throws IOException{
		//找到目标文件
		File file = new File("F:\\新建文件夹\\fileceshi\\a.txt");
		
		//建立数据的输入通道
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//建立缓冲字节数组，读取文件的输出。
		byte[] buf = new byte[3];
		int length = fileInputStream.read(buf);   //数据已经存储到了字节数组中。如果使用了read方法传入了字节数组，而这时候read方法的饭后值是读取到多少个字节存储到字节数组
		
		//使用字节数组构建字符串
		String content = new String(buf,0,length);
		System.out.print("内容3333是---" + content);
		
		//关闭资源
		fileInputStream.close();
	}
	//方式2:使用循环读取文件数据
	public static void readTest2() throws IOException{
		//找到目标文件
		File file = new File("F:\\新建文件夹\\fileceshi\\a.txt");
		
		//建立数据的输入通道
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//读取文件中的数据
		int content = 0 ; //生命改变量用于啐出读取到的数据
		while ((content = fileInputStream.read()) != -1) {
			System.out.println((char)content);
			
		}
		//关闭资源   实际上就是释放资源。
		fileInputStream.close();
	}
	
	
	//读取的方式一缺陷：无法读取完整一个文件的数据
	public static void readTest1() throws IOException {
		File file = new File("F:\\新建文件夹\\fileceshi\\a.txt");
		
		//建立数据的输入通道
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//读取文件中的数据
		int content = fileInputStream.read();  //read() 读取一个字节的数据，把读取的数据返回
		System.out.println("读到的内容是" + content);
		
		//关闭资源   实际上就是释放资源。
		fileInputStream.close();
		
	}

}
