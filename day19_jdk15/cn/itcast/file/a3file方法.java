package cn.itcast.file;

import java.io.File;
import java.io.IOException;

/*
 * ������
	createNewFile()	��ָ��λ�ô���һ�����ļ����ɹ��ͷ���true������Ѵ��ھͲ�����Ȼ�󷵻�false
	mkdir()			��ָ��λ�ô���Ŀ¼����ֻ�ᴴ�����һ��Ŀ¼������ϼ�Ŀ¼�����ھ����쳣��
	mkdirs()		��ָ��λ�ô���Ŀ¼����ᴴ��·�������в����ڵ�Ŀ¼��
	renameTo(File dest)	�������ļ����ļ��У�Ҳ���Բ����ǿյ��ļ��У��ļ���ͬʱ�൱���ļ��ļ���,����ʱ���ܲ����ǿյ��ļ��С��ƶ�/�������ɹ��򷵻�true��ʧ���򷵻�false��

*/

public class a3file���� {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\�½��ļ���\\fileceshi\\abc.txt");
		System.out.println("�����ɹ�����"+ file.createNewFile());
		File dir = new File("F:\\�½��ļ���\\fileceshi\\aaa\\bbb");
		
		System.out.println("�����ļ���" + dir.mkdirs());  //����һ���������ļ���   
		
		//renameTo()   ���Ŀ���ļ���Դ�ļ�����ͬһ��·���£���ôrenameTo��������������-�����Բ����ļ���
		//				���Ŀ���ļ���Դ�ļ�������ͬһ��·���£���ô���Ǽ���.�����Բ����ļ���
		File destFile = new File("F:\\�½��ļ���\\aaa.txt");
		System.out.println("�������ɹ���" + file.renameTo(destFile));
		
		
	}

}
