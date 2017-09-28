package cn.itcast.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
---------| OutputStream 是所有输出字节的超类

---------------|FileOutputStream  向文件输出数据的输出字节流

FileOutputStream使用步骤
	1.找到目标文件

*/
public class a1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//找到目标文件
		File file = new File("F:\\新建文件夹\\fileceshi\\b.txt");
		
		//建立数据的输出通道
		FileOutputStream fileOutputStream = new FileOutputStream(file);
			
		
		
	}

}
