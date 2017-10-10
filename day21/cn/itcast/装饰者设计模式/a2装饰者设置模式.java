package cn.itcast.装饰者设计模式;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/*
装饰者设计模式：增强一个类的功能，而且还可以让这些装饰类互相装饰。

装饰者设计模式的步骤：
	1.在装饰类的内部维护一个被装饰类的引用。





*/

//带行号的缓冲输入字符流
class BufferedLineNum2{
	
	int count = 1;
	
	//在内部维护一个被装饰类的引用。
	BufferedReader bufferedReader;
	
	public BufferedLineNum2(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException {
		String line = bufferedReader.readLine();
		if (line == null) {
			return null;
		}
		line = count + " " + line;
		count++;
		return line;
	}
	
}

//带分号的缓冲输入字符流
class BufferedLineNum2{
	
	int count = 1;
	
	//在内部维护一个被装饰类的引用。
	BufferedReader bufferedReader;
	
	public BufferedLineNum2(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException {
		String line = bufferedReader.readLine();
		if (line == null) {
			return null;
		}
		line = count + " " + line;
		count++;
		return line;
	}
	
}

public class a2装饰者设置模式 {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\新建文件夹\\day21\\day21\\代码\\day21\\src\\other\\Demo1.java");
		FileReader fileReader = new FileReader(file);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		BufferedLineNum2 bufferedLineNum2 = new BufferedLineNum2(bufferedReader);
		
		String line = null;
		
		while((line = bufferedLineNum2.readLine()) != null){
			System.out.println(line);
		}
		

	}

}
