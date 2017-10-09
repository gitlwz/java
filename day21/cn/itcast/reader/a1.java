package cn.itcast.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*

*/
public class a1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		write1();
		read1();
	}
	//使用字节流读取中文
	public static void read1() throws IOException {
		File file = new File("F:\\新建文件夹\\fileceshi\\a.txt");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		/*int content = 0;
		
		while ((content = fileInputStream.read()) != -1) {
			System.out.println((char) content);
		}*/
		
		byte[] buff = new byte[2];
		int length = 0;
		while ((length = fileInputStream.read(buff)) != -1) {
			System.out.println(new String(buff,0,length));
		}
		
		fileInputStream.close();
	}
	
	
	
	//字节流之所以能够写中文是因为借助了字符串的getBytes方法对字符串进行了编码  （字符---->数字）
	public static void write1() throws IOException {
		File file = new File("F:\\新建文件夹\\fileceshi\\a.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		String data = "大家好";
		
		byte[] buf = data.getBytes();
		
		fileOutputStream.write(buf);
		
		fileOutputStream.close();
		
		
	}
}
