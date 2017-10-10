package cn.itcast.装饰者设计模式;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
装饰着设计模式：
	
	BufferedReader是不是拓展了FileReader的功能。
 	BuferedWriter 也是拓展了FileWriter的功能。

	需求1： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号。
	
	需求2： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有分号。
	
	需求3： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有双引号。
	
	
	增强一个类的功能时候我们可以选择使用继承：
	
		通过继承实现增强一个类的功能优点： 代码结构清晰，通俗易懂
		
		缺点：使用不灵活，会导致继承的体系过于庞大。
	
	
*/
class BufferedLineNum extends BufferedReader{
	
	//行号
	int count = 1;
	
	public BufferedLineNum(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String lineData = super.readLine();
		if (lineData == null) {
			return null;
		}
		lineData = count + " :" + lineData;
		count++;
		return lineData;
	}
}

//带分号的缓冲输入字符流
class BufferedLineSemi extends BufferedReader{
	
	
	
	public BufferedLineSemi(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String lineData = super.readLine();
		if (lineData == null) {
			return null;
		}
		lineData = lineData + ";";
		
		return lineData;
	}
}
//带双引号的缓冲输入字符流
class BufferedLineQuto extends BufferedReader{
	
	
	
	public BufferedLineQuto(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String lineData = super.readLine();
		if (lineData == null) {
			return null;
		}
		lineData = "\""+lineData + "\"";
		
		return lineData;
	}
}

public class a1 {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\新建文件夹\\day21\\day21\\代码\\day21\\src\\other\\Demo1.java");
		
		FileReader fileReader = new FileReader(file);
		
		//带有行号
		BufferedLineNum bufferedLineNum = new BufferedLineNum(fileReader);
		
		//带有分号
		BufferedLineSemi bufferedLineSemi = new BufferedLineSemi(fileReader);
		
		//带有双引号
		BufferedLineQuto bufferedLineQuto = new BufferedLineQuto(fileReader);
		
		String line = null;
		while ((line = bufferedLineQuto.readLine()) != null) {
			System.out.println(line);
			
		}
	}

}
