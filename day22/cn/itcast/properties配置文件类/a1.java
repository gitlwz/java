package cn.itcast.properties�����ļ���;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
Properties�����ļ��� : ��Ҫ�������������ļ����ȡ�����ļ�����Ϣ��

PropertiesҪע���ϸ�ڣ�
	1.��������ļ�����Ϣһ��ʹ�������ģ���ô��ʹ��store�������������ļ���ʱ��ֻ��ʹ���ַ�����������ʹ���ֽ���
		���������ļ��Ļ���Ĭ��ʹ�õ���iso8859-1�����б���洢�ġ���ʱ���������롣
	
	2.���Properties�е����ݷ����˱仯��һ��Ҫ����ʹ��Properties���������ļ������������ļ���Ϣ���ط����仯��
	

*/
public class a1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
//		creatProperties();
		readProperties();
	}
	//��ȡ�����ļ�����Ϣ
	public static void readProperties() throws FileNotFoundException, IOException {
		//����Properties����
		Properties properties  = new Properties();
		
		//���������ļ���Ϣ��Properties��
		properties.load(new FileReader("D:\\mypc\\learn\\fujian\\properties.properties"));
		Set<Map.Entry<Object, Object>> entries = properties.entrySet();
		for(Map.Entry<Object, Object> entry : entries){
			System.out.println("����"+entry.getKey() + " ֵ��"+entry.getValue());
		}
		
		//�޸Ĺ��޵�����
		properties.setProperty("����", "007");
		
		//���޸ĺ��Properties������һ�������ļ�
		properties.store(new FileWriter("D:\\mypc\\learn\\fujian\\properties.properties") , "hehe");
	}
	
	//���������ļ�����Ϣ
	public static void creatProperties() throws FileNotFoundException, IOException {
		//����Properties
		Properties properties = new Properties();
		properties.setProperty("����", "123");
		properties.setProperty("��ʣ", "234");
		properties.setProperty("����", "345");
		
		/*
		
		Set<Map.Entry<Object, Object>> entries = properties.entrySet();
		for(Map.Entry<Object, Object> entry : entries){
			System.out.println("����"+entry.getKey() + " ֵ��"+entry.getValue());
		}
		
		*/
		
		//properties.store(new FileOutputStream("D:\\mypc\\learn\\fujian\\properties.properties"), "����");//��һ��������һ����������󣬵ڶ�������ʹ��һ���ַ�������һ��
		properties.store(new FileWriter("D:\\mypc\\learn\\fujian\\properties.properties"),"����");
	}
}
