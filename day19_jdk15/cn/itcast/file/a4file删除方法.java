package cn.itcast.file;

import java.io.File;

/*
ɾ����
	delete()		ɾ���ļ���һ�����ļ��У�������ļ����Ҳ�Ϊ�գ�����ɾ�����ɹ�����true��ʧ�ܷ���false��
	deleteOnExit()	���������ֹʱ������ɾ���˳���·������ʾ���ļ���Ŀ¼����֤�����쳣ʱ��������ʱ�ļ�Ҳ���Ա�ɾ��


�жϣ�
		exists()		�ļ����ļ����Ƿ���ڡ�
		isFile()		�Ƿ���һ���ļ�����������ڣ���ʼ��Ϊfalse��
		isDirectory()	�Ƿ���һ��Ŀ¼����������ڣ���ʼ��Ϊfalse��
		isHidden()		�Ƿ���һ�����ص��ļ����Ƿ������ص�Ŀ¼��
		isAbsolute()	���Դ˳���·�����Ƿ�Ϊ����·������

*/
public class a4fileɾ������ {

	public static void main(String[] args) {
		/*ɾ����
		 * 
		 * File file = new File("F:\\�½��ļ���\\fileceshi\\aaa");
		
		System.out.println("ɾ���ɹ���" + file.delete());  //����ɾ���ǿյ��ļ���
		
		
		file.deleteOnExit();   //jvm�˳���ʱ��ɾ���ļ�
*/
		
		//�жϵ�-----------------------------
		File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
		System.out.println("������" + file.exists());
		
		System.out.println("�ж��Ƿ���һ���ļ�" + file.isFile());
		
		System.out.println("�ж��Ƿ���һ���ļ���" + file.isDirectory());
		
		System.out.println("�ж��Ƿ���һ�����ص��ļ������ļ���" + file.isHidden());
		
		System.out.println("�Ǿ���·����?" + file.isAbsolute());
		
	}

}
