package cn.itcast.file;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

/*
��ȡ��
	getName()		��ȡ�ļ����ļ��е����ƣ��������ϼ�·����
	getPath()       ���ؾ���·�������������·��������Ŀ¼Ҫָ��
	getAbsolutePath()	��ȡ�ļ��ľ���·�������ļ��Ƿ����û��ϵ
	length()		��ȡ�ļ��Ĵ�С���ֽ�����������ļ��������򷵻�0L��������ļ���Ҳ����0L��
	getParent()		���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻�null��
	lastModified()	��ȡ���һ�α��޸ĵ�ʱ�䡣
		
�ļ�����أ�
		
	staic File[] listRoots()	�г����еĸ�Ŀ¼��Window�о�������ϵͳ���̷���
	list()						����Ŀ¼�µ��ļ�����Ŀ¼�������������ļ��������ļ����������᷵��null��
	list(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��
	listFiles()					����Ŀ¼�µ��ļ�����Ŀ¼����File��ʵ���������������ļ��������ļ����������᷵��null��
	listFiles(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��
*/


public class a5file��ȡ���� {

	public static void main(String[] args) {
		File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
		System.out.println("�ļ��� " + file.getName());
		System.out.println("��ȡ����·��" + file.getPath());
		
		System.out.println("getAbsolutePath��ȡ����·��" + file.getAbsolutePath());
		
		System.out.println("��ȡ�ļ��Ĵ�С(�ֽ�Ϊ��λ)" + file.length());
		System.out.println("��ȡ�ļ��ĸ�·�� " + file.getParent());
		
		//ʹ�ú���ֵת����Date����
		long lastModified = file.lastModified();
		Date data = new Date(lastModified);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println("��ȡ���һ���޸�ʱ��(����ֵ)" + dateFormat.format(lastModified));
	}

}
