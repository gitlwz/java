package cn.itcast.file;

import java.io.File;

/*
�ļ�����أ�

staic 	File[] listRoots()	�г����еĸ�Ŀ¼��Window�о�������ϵͳ���̷���
		list()						����Ŀ¼�µ��ļ�����Ŀ¼�������������ļ��������ļ����������᷵��null��
		listFiles()					����Ŀ¼�µ��ļ�����Ŀ¼����File��ʵ���������������ļ��������ļ����������᷵��null��
		
	����1��ָ��һ���ļ��У�Ȼ���г��ļ��������е�java�ļ���
		
	����2��ָ��һ���ļ��У�Ȼ���ֳ��ļ���������������ļ����ļ���
		
		
		
		
		list(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��
		listFiles(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��

*/
public class a6file�ļ��л�÷��� {

	public static void main(String[] args) {
		/*File[] roots = File.listRoots();
		
		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i]);
		}*/
		
		File file = new File("F:\\�½��ļ���\\day17");
		
		/*
		String[] str = file.list();       //�ѵ�ǰ�ʼ���������е����ļ����������ļ����� �洢��һ��String�����з���;
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
*/
		File[] files = file.listFiles();  //�ѵ�ǰ�ʼ���������е����ļ��������ļ���  ��ʹ����һ��File��������������Щfile����洢��һ��file�����з��ظ��㡣
		for (int i = 0; i < files.length; i++) {
			System.out.println("�ļ��� :" + files[i].getName());
		}
		
	}

}
