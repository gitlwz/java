package cn.itcast.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*

*/
public class a1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		write1();
		read1();
	}
	//ʹ���ֽ�����ȡ����
	public static void read1() throws IOException {
		File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		/*int content = 0;
		
		while ((content = fileInputStream.read()) != -1) {
			System.out.println((char) content);
		}*/
		
		byte[] buff = new byte[2];
		int length = 0;
		while ((length = fileInputStream.read(buff)) != -1) {
			System.out.println(new String(buff,0,length));
		}
		
		fileInputStream.close();
	}
	
	
	
	//�ֽ���֮�����ܹ�д��������Ϊ�������ַ�����getBytes�������ַ��������˱���  ���ַ�---->���֣�
	public static void write1() throws IOException {
		File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		String data = "��Һ�";
		
		byte[] buf = data.getBytes();
		
		fileOutputStream.write(buf);
		
		fileOutputStream.close();
		
		
	}
}
