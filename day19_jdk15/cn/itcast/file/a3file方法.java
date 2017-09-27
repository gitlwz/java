package cn.itcast.file;

import java.io.File;
import java.io.IOException;

/*
 * 创建：
	createNewFile()	在指定位置创建一个空文件，成功就返回true，如果已存在就不创建然后返回false
	mkdir()			在指定位置创建目录，这只会创建最后一级目录，如果上级目录不存在就抛异常。
	mkdirs()		在指定位置创建目录，这会创建路径中所有不存在的目录。
	renameTo(File dest)	重命名文件或文件夹，也可以操作非空的文件夹，文件不同时相当于文件的剪切,剪切时候不能操作非空的文件夹。移动/重命名成功则返回true，失败则返回false。

*/

public class a3file方法 {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\新建文件夹\\fileceshi\\abc.txt");
		System.out.println("创建成功了吗"+ file.createNewFile());
		File dir = new File("F:\\新建文件夹\\fileceshi\\aaa\\bbb");
		
		System.out.println("创建文件夹" + dir.mkdirs());  //创建一个单级的文件夹   
		
		//renameTo()   如果目标文件与源文件是在同一个路径下，那么renameTo的作用是重命名-》可以操作文件夹
		//				如果目标文件与源文件不是在同一个路径下，那么就是剪切.不可以操作文件夹
		File destFile = new File("F:\\新建文件夹\\aaa.txt");
		System.out.println("重命名成功吗" + file.renameTo(destFile));
		
		
	}

}
