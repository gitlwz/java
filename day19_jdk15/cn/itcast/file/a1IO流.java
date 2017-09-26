package cn.itcast.file;

import java.io.File;

/*
IO流（Input  Output）

IO技术只要的作用是解决设备与设备之间的数据传输问题。比如：硬盘----》内存     		内存---》硬盘上		把键盘的数据----》内存中

IO技术的应用场景：
	导出报表,上传大头照,下载,解析xml文件...

数据保存到硬板上，该数据就可以做到永久性的保存。数据一般是以文件的形式保存到硬盘上的

sun使用了一个File类描述文件或者文件夹

File类的构造方法：

	File(String pathname)  指定文件或者文件夹的路径创建一个File文件。
	
	File(File parent, String child)   根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。 

	File(String parent, String child) 
	

目录分割符：在Windows机器上的目录分隔符是 \ , 在linux机器上的目录分隔符是   /

注意：在Windows上面 \  与  / 都可以使用作为目录分隔符。而且，如果写/的时候只需要写一个即可

 */
public class a1IO流 {

	public static void main(String[] args) {
		//File file = new File("F:\\新建文件夹\\a.txt");
		
		File parentFile = new File("F:\\新建文件夹\\");
		File file = new File(parentFile,"a.txt");
		
				
		System.out.println(file.exists());
		System.out.println("目录分隔符" + File.separator);

	}

}
