package cn.itcast.file;

import java.io.File;

/*
文件夹相关：

staic 	File[] listRoots()	列出所有的根目录（Window中就是所有系统的盘符）
		list()						返回目录下的文件或者目录名，包含隐藏文件。对于文件这样操作会返回null。
		listFiles()					返回目录下的文件或者目录对象（File类实例），包含隐藏文件。对于文件这样操作会返回null。
		
	需求1：指定一个文件夹，然后列出文件下面所有的java文件。
		
	需求2：指定一个文件夹，然后咧出文件夹下面的所有子文件与文件夹
		
		
		
		
		list(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。
		listFiles(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。

*/
public class a6file文件夹获得方法 {

	public static void main(String[] args) {
		/*File[] roots = File.listRoots();
		
		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i]);
		}*/
		
		File file = new File("F:\\新建文件夹\\day17");
		
		/*
		String[] str = file.list();       //把当前问价下面的所有的子文件名或者子文件夹名 存储到一个String数组中返回;
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
*/
		File[] files = file.listFiles();  //把当前问价下面的所有的子文件或者子文件夹  都使用了一个File对象描述，把这些file对象存储到一个file数组中返回给你。
		for (int i = 0; i < files.length; i++) {
			System.out.println("文件名 :" + files[i].getName());
		}
		
	}

}
