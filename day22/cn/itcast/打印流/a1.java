package cn.itcast.��ӡ��;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

/*
��ӡ����printStream��   ��ӡ�����Դ�ӡ�������͵����ݣ����Ҵ�ӡ����֮ǰ���������ת���ַ����ٽ��д�ӡ��


*/
public class a1 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\mypc\\learn\\fujian\\d.txt");
		
		/*
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("���97");
		fileWriter.close();
		*/
		
		//����һ����ӡ��
		/*
		PrintStream printStream = new PrintStream(file);
		
		printStream.print(97);
		printStream.println(true);
		
		
		//Ĭ�ϱ�׼����������������̨����ġ�
		System.setOut(printStream);
		System.out.println("�²�������");
		*/
		
		PrintStream printStream = new PrintStream(file);
		//�ռ��쳣����־��Ϣ��
		try{
			int c = 4/0;
			System.out.println("c====");
		}catch(Exception e){
			e.printStackTrace(printStream);
		}
		
	}

}
