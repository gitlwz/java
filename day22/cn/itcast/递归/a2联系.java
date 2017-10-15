package cn.itcast.递归;

import java.io.File;

/*
需求1：列出一个文件夹的子孙文件与目录。

需求2：列出所有的子孙文件名有对应的空格。



需求4：删除一个非空的文件夹。


作业：
	剪接一个非空目录
*/
public class a2联系 {

	public static void main(String[] args) {
		File dir = new File("D:\\mypc\\learn\\day22");
		
		list3(dir,"|--");
	}
	
	//删除所有文件夹
	public static void deleteDir(File dir) {
		File[] files = dir.listFiles();//列出所有的子文件
		for (int i = 0; i < files.length; i++) {
			if(files[i].isFile()){
				files[i].delete();
			}else if(files[i].isDirectory()){
				deleteDir(files[i]);
			}
		}
	}
	
	public static void list3(File dir,String space) {
		File[] files =	dir.listFiles();  //列出所有的子文件
		for(File file : files){
			if(file.isFile()){
				System.out.println(space + file.getName());
			}else if(file.isDirectory()){
				System.out.println(space + file.getName());
				list3(file,"|  " + space);
			}
		}
	}
	public static void list2(File dir,String space) {
		File[] files =	dir.listFiles();  //列出所有的子文件
		for(File file : files){
			if(file.isFile()){
				System.out.println(space + file.getName());
			}else if(file.isDirectory()){
				System.out.println(space + file.getName());
				list2(file,space +"  ");
			}
		}
	}
	
	public static void list(File dir) {
		File[] files =	dir.listFiles();  //列出所有的子文件
		for(File file : files){
			if(file.isFile()){
				System.out.println("文件名：" + file.getName());
			}else if(file.isDirectory()){
				System.out.println("文件夹：" + file.getName());
				list(file);
			}
		}
	}
	
}
