package cn.itcast.properties�����ļ���;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
����ʹ��Propertiesʵ�ֱ����ֻ���������Σ���������֮�����ʾ�������棬�˳�jvm��



*/
public class a2������ϰ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\mypc\\learn\\fujian\\properties.properties");
		if(!file.exists()){
			//��������ļ������ڣ��򴴽��������ļ�
			file.createNewFile();
		}
		//����Properties
		Properties properties = new Properties();
		//�������ļ�����Ϣ���ص�Properties
		properties.load( new FileInputStream(file));
		
		int count = 0; //����ñ��������ڱ�����������д���
		
		//��ȡ�����ļ������д���
		String value = properties.getProperty("count");
		
		if(value != null){
			count = Integer.parseInt(value);
		}
		
		//�ж�
		if(count == 3){
			System.out.println("���ѳ�����ʹ�ô������빺��");
			System.exit(0);
		}
		count++;
		System.out.println("���Ѿ�ʹ���˱������" + count + "��");
		properties.setProperty("count", count + "");
		
		//ʹ��Properties����һ�������ļ�
		properties.store(new FileWriter(file), "runtiome");
		
		
		
	}

}
