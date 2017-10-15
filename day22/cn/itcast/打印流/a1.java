package cn.itcast.打印流;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

/*
打印流（printStream）   打印流可以打印任意类型的数据，而且打印数据之前都会把数据转成字符串再进行打印。


*/
public class a1 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\mypc\\learn\\fujian\\d.txt");
		
		/*
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("你好97");
		fileWriter.close();
		*/
		
		//创建一个打印流
		/*
		PrintStream printStream = new PrintStream(file);
		
		printStream.print(97);
		printStream.println(true);
		
		
		//默认标准的输出流就是向控制台输出的。
		System.setOut(printStream);
		System.out.println("猜猜我在哪");
		*/
		
		PrintStream printStream = new PrintStream(file);
		//收集异常的日志信息。
		try{
			int c = 4/0;
			System.out.println("c====");
		}catch(Exception e){
			e.printStackTrace(printStream);
		}
		
	}

}
