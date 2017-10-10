package cn.itcast.������;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
�����ַ���
-------| Reader ���������ַ����Ļ��࣬������
---------| FileReader ��ȡ�ļ��ַ����������ַ�����
---------| BufferedReader ���������ַ��� .���ֵ�Ŀ�ģ�Ϊ����߶�ȡ�ļ��ַ���Ч�ʺ���չ��FileReader�Ĺ��ܡ������ڲ�Ҳ��ά����һ���ַ�����


BufferedReader��ʹ�ò���
	1���ҵ�Ŀ���ļ���
	2.��������ͨ��
	3.�������������ַ���
	4.��ȡ����

*/
public class a1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read1();
	}
	
	public static void read1() throws IOException {
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
		//��������ͨ����
		FileReader fileReader = new FileReader(file);
		
		//�������������ַ���
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//��ȡ����
		/*
		int content = bufferedReader.read();  //������һ���ַ�����ȡ�����ַ��϶�Ҳ�Ǵ�BufferedReader�ڲ����ַ������л�ȡ�õ�������Ч�ʸߡ�
		System.out.println((char)content);
		*/
		
		//ʹ��BufferedReader��չ�Ĺ��ܣ�readLine()  һ�ζ�ȡһ���ı�������������ļ���ĩβ����null
		
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
			
		}
		
		
		bufferedReader.close();
	}

}
