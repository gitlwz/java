package cn.itcast.file;

import java.io.File;

/*
·�����⣺

����·����
	���ļ���Ӳ���ϵ�����·��������·��һ�㶼�����̷���ͷ�ġ�
	
���·����
	���·��������Դ�ļ�����ڵ�ǰ�������ڵ�·����
	.	��ǰ·��
	..	��һ��·��
	
ע�⣺�������ǰ���ڵ�·������Դ�ļ�������ͬһ�������棬��û��д���·����



*/
public class a2 {

	public static void main(String[] args) {
		File file = new File(".");
		System.out.println("��ǰ��·����" + file.getAbsolutePath());
		
		
		File file2 = new File("day19_jdk15\\b.txt");
		System.out.println(file2.exists());
	}

}
