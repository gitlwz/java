package cn.itcast.�ݹ�;

import java.io.File;

/*
����1���г�һ���ļ��е������ļ���Ŀ¼��

����2���г����е������ļ����ж�Ӧ�Ŀո�



����4��ɾ��һ���ǿյ��ļ��С�


��ҵ��
	����һ���ǿ�Ŀ¼
*/
public class a2��ϵ {

	public static void main(String[] args) {
		File dir = new File("D:\\mypc\\learn\\day22");
		
		list3(dir,"|--");
	}
	
	//ɾ�������ļ���
	public static void deleteDir(File dir) {
		File[] files = dir.listFiles();//�г����е����ļ�
		for (int i = 0; i < files.length; i++) {
			if(files[i].isFile()){
				files[i].delete();
			}else if(files[i].isDirectory()){
				deleteDir(files[i]);
			}
		}
	}
	
	public static void list3(File dir,String space) {
		File[] files =	dir.listFiles();  //�г����е����ļ�
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
		File[] files =	dir.listFiles();  //�г����е����ļ�
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
		File[] files =	dir.listFiles();  //�г����е����ļ�
		for(File file : files){
			if(file.isFile()){
				System.out.println("�ļ�����" + file.getName());
			}else if(file.isDirectory()){
				System.out.println("�ļ��У�" + file.getName());
				list(file);
			}
		}
	}
	
}
