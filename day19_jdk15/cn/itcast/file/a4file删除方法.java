package cn.itcast.file;

import java.io.File;

/*
删除：
	delete()		删除文件或一个空文件夹，如果是文件夹且不为空，则不能删除，成功返回true，失败返回false。
	deleteOnExit()	在虚拟机终止时，请求删除此抽象路径名表示的文件或目录，保证程序异常时创建的临时文件也可以被删除


判断：
		exists()		文件或文件夹是否存在。
		isFile()		是否是一个文件，如果不存在，则始终为false。
		isDirectory()	是否是一个目录，如果不存在，则始终为false。
		isHidden()		是否是一个隐藏的文件或是否是隐藏的目录。
		isAbsolute()	测试此抽象路径名是否为绝对路径名。

*/
public class a4file删除方法 {

	public static void main(String[] args) {
		/*删除的
		 * 
		 * File file = new File("F:\\新建文件夹\\fileceshi\\aaa");
		
		System.out.println("删除成功吗" + file.delete());  //不能删除非空的文件夹
		
		
		file.deleteOnExit();   //jvm退出的时候删除文件
*/
		
		//判断的-----------------------------
		File file = new File("F:\\新建文件夹\\fileceshi\\a.txt");
		System.out.println("存在吗？" + file.exists());
		
		System.out.println("判断是否是一个文件" + file.isFile());
		
		System.out.println("判断是否是一个文件夹" + file.isDirectory());
		
		System.out.println("判断是否是一个隐藏的文件或者文件夹" + file.isHidden());
		
		System.out.println("是绝对路径吗?" + file.isAbsolute());
		
	}

}
