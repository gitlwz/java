package cn.itcast.file;

import java.io.File;
import java.io.FilenameFilter;

/*
����1 ��  ָ��һ���ļ��У�Ȼ����ļ�����������java�ļ���

����2�� ָ��һ���ļ��У�Ȼ���г��ļ���������������ļ����ļ��У����Ǹ�ʽҪ����:
 
�ļ���
	�ļ���1
	�ļ���2
	�ļ���3
	..

�ļ��У�
	�ļ�����1
	�ļ�����2
	�ļ�����3
	....


	listFiles(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��
	list(fileNameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��
*/

//�Զ���һ���ļ���������
class MyFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		
		System.out.println("�ļ��У�" + dir + "         �ļ�����" + name);
		return name.endsWith(".java");
	}
	
}


public class a7file��ϵ {

	public static void main(String[] args) {
		File file = new File("F:\\�½��ļ���\\day06\\����");
		listJava2(file);
	}
	public static void listJava2(File dir) {
		File[] files = dir.listFiles(new MyFilter());   //�õ��ļ����������е����ļ����ļ���
		System.out.println("����" + files.length);
	}
	
	
	public static void listFile(File dir) {
		File[] filesFile = dir.listFiles();
		
		
		for (int i = 0; i < filesFile.length; i++) {
			
		}
	}
	
	
	//�г����е�java�ļ�
	public static void listJava(File dir) {
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			/*if(fileName.endsWith(".java") && files[i].isFile()){
				System.out.println(fileName);
			}*/
		}
		
	}
	
}
