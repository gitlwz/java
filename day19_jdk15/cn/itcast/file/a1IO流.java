package cn.itcast.file;

import java.io.File;

/*
IO����Input  Output��

IO����ֻҪ�������ǽ���豸���豸֮������ݴ������⡣���磺Ӳ��----���ڴ�     		�ڴ�---��Ӳ����		�Ѽ��̵�����----���ڴ���

IO������Ӧ�ó�����
	��������,�ϴ���ͷ��,����,����xml�ļ�...

���ݱ��浽Ӳ���ϣ������ݾͿ������������Եı��档����һ�������ļ�����ʽ���浽Ӳ���ϵ�

sunʹ����һ��File�������ļ������ļ���

File��Ĺ��췽����

	File(String pathname)  ָ���ļ������ļ��е�·������һ��File�ļ���
	
	File(File parent, String child)   ���� parent ����·������ child ·�����ַ�������һ���� File ʵ���� 

	File(String parent, String child) 
	

Ŀ¼�ָ������Windows�����ϵ�Ŀ¼�ָ����� \ , ��linux�����ϵ�Ŀ¼�ָ�����   /

ע�⣺��Windows���� \  ��  / ������ʹ����ΪĿ¼�ָ��������ң����д/��ʱ��ֻ��Ҫдһ������

 */
public class a1IO�� {

	public static void main(String[] args) {
		//File file = new File("F:\\�½��ļ���\\a.txt");
		
		File parentFile = new File("F:\\�½��ļ���\\");
		File file = new File(parentFile,"a.txt");
		
				
		System.out.println(file.exists());
		System.out.println("Ŀ¼�ָ���" + File.separator);

	}

}
