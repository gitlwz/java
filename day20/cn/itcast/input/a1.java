package cn.itcast.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
File�ࣺ��������һ���ļ������ļ��еġ�

ͨ��File�������ǿ��Զ�ȡ�ļ������ļ��е��������ݣ����������Ҫ��ȡ�ļ����������ݣ���ô������Ҫʹ��IO��������

IO��( Input Output);

IO��������⣻����豸���豸֮������ݴ������⡣�ڴ�----��      	Ӳ��----���ڴ�

IO��������


IO������

	����ǰ������ݵ����򻮷�
	
		������
		
		�����

	������մ���ĵ�λ����
	
		�ֽ����� �ֽ�����ȡ�Ķ����ļ��еĶ��������ݣ���ȡ�����������ݲ��ᾭ���κεĴ���
		
		�ַ������ַ�����ȡ�����������ַ�Ϊ��λ�ġ��ַ���Ҳ�Ƕ�ȡ�ļ��еĶ��������ݡ����������Щ����������ת����������ʶ����ַ�
			 �ַ��� = �ֽ��� + ����
			 
			 
�ֽ���
	�����ֽ�����
	-------------| InputStream
	-----------------|FileInputStram   ��ȡ�ļ����ݵ������ֽ���
	
	ʹ��FileInputStram ��ȡ�ļ����ݵĲ���
		1.�ҵ�Ŀ���ļ�
		2.�������ݵ�����ͨ��
		3.��ȡ�ļ��е�����
		4.
		
*/
public class a1 {

	public static void main(String[] args) throws IOException {
//		readTest2();
//		readTest3();
		readTest4();
	}
	//��ʽ4��ʹ�û����������ѭ��һ���ȡ
	public static void readTest4() throws IOException{
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
		
		//�������ݵ�����ͨ��
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//���������ֽ����飬���ѭ����ȡ�ļ������ݡ�
		int length = 0;  //����ÿ�ζ�ȡ�����ֽڸ���
		byte[] buf = new byte[1024];	//��������ĳ���һ����1024�ı���     �����ϻ�������Խ��Ч��Խ��
		
		// fileInputStream.read(buf);  //read��������������ļ���ĩβ����ô�᷵��-1
		while ((length = fileInputStream.read(buf)) != -1) {
			System.out.println(new String(buf,0,length));
		}
		fileInputStream.close();
		
	}
	//��ʽ3��ʹ�û��������ȡ��  ȱ�㣺�޷���ȡ����һ���ļ������ݡ�
	public static void readTest3() throws IOException{
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
		
		//�������ݵ�����ͨ��
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//���������ֽ����飬��ȡ�ļ��������
		byte[] buf = new byte[3];
		int length = fileInputStream.read(buf);   //�����Ѿ��洢�����ֽ������С����ʹ����read�����������ֽ����飬����ʱ��read�����ķ���ֵ�Ƕ�ȡ�����ٸ��ֽڴ洢���ֽ�����
		
		//ʹ���ֽ����鹹���ַ���
		String content = new String(buf,0,length);
		System.out.print("����3333��---" + content);
		
		//�ر���Դ
		fileInputStream.close();
	}
	//��ʽ2:ʹ��ѭ����ȡ�ļ�����
	public static void readTest2() throws IOException{
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
		
		//�������ݵ�����ͨ��
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//��ȡ�ļ��е�����
		int content = 0 ; //�����ı�������������ȡ��������
		while ((content = fileInputStream.read()) != -1) {
			System.out.println((char)content);
			
		}
		//�ر���Դ   ʵ���Ͼ����ͷ���Դ��
		fileInputStream.close();
	}
	
	
	//��ȡ�ķ�ʽһȱ�ݣ��޷���ȡ����һ���ļ�������
	public static void readTest1() throws IOException {
		File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
		
		//�������ݵ�����ͨ��
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//��ȡ�ļ��е�����
		int content = fileInputStream.read();  //read() ��ȡһ���ֽڵ����ݣ��Ѷ�ȡ�����ݷ���
		System.out.println("������������" + content);
		
		//�ر���Դ   ʵ���Ͼ����ͷ���Դ��
		fileInputStream.close();
		
	}

}
