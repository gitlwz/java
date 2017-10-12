package cn.itcast.����洢;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
�������������� �� ����������������Ҫ������������д�������Ϣ���ȡ�������Ϣ��������Ϣһ��

������������ObjectOutputStream��

�������������ObjectInputStream


ObjectOutputStream��ʹ�ò���
	1.
	
	
�������������Ҫע���ϸ��
	1.���������Ҫ��д�����ļ��ϣ���ô���������������Ҫʵ��Serializable�ӿڡ� Serializable�ӿ�û���κεķ�������һ����ʶ�ӿڶ��ѡ�
	
	2.����ķ����л����������ʱ�򲢲�����õ����췽����
	
	3.serialVersionUID,���ü�¼class�ļ��İ汾��Ϣ�ģ�serialVersionUID���������ͨ��һ�������������Ա���������������������һ������
	
	4.ʹ��ObjectOutputStream�����л���ʱ��ObjectOutputStream���ȶ�ȡ�ļ��е�serialVersionUID��Ȼ���뱾�ص�class�ļ���serialVersionUID
		���жԱȣ����������id��һ�£��ͻᷴ����ʧ�ܡ�
		
	5.������л��뷴���л���ʱ����ܻ��޸���ĳ�Ա����ô���һ��ʼ�͸�������ƶ�һ��serialVersionUID�����һ�����Ѿ�ָ����serialVersionUID��
		�����л��뷴���л���ʱ��,jvm���������Լ������class��serialVersionUID�ˡ�
		
	6.���һ������ĳ�� ���ݲ��뱻���л���Ӳ���ϣ�����ʹ�ùؼ���transient���Ρ�
	
	7.���һ����ά��������һ��������ã���ô����һ����Ҳ��Ҫʵ��serialVersionUID�ӿڡ�
*/
class Adderss{
	String country;
	String city;
	
	public Adderss(String country, String city){
		this.country = country;
		this.city = city;
	}
}


class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String userName;
	
	String password;
	
	transient int age;  //transient ͸��
	
	
	public User(String userName,String password ){
		this.userName = userName;
		this.password = password;
		
	}
	public User(String userName,String password,int age ){
		this.userName = userName;
		this.password = password;
		this.age = age;
	}
	@Override
	public String toString() {
		return "�˺ţ�"+this.userName+"   ���룺"+ this.password + " ���䣺" + this.age;
	}
}




public class a1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		writeObj();
		readObj();
	}
	//���ļ��еĶ�����Ϣ��ȡ����---------������ķ����л�
	public  static void readObj() throws IOException, ClassNotFoundException {
		//�ҵ�Ŀ���ļ�
		File file = new File("D:\\mypc\\learn\\fujian\\obj.txt");
		
		//��������ޚ����ͨ��
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//�������������������
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		//��ȡ������Ϣ
		 User user =  (User)objectInputStream.readObject();//��������϶�Ҫ��������������class�ļ���
		
		 
		 System.out.println(user);
		
	}
	
	
	
	//���巽���Ѷ������Ϣд��Ӳ����
	//�������Ҳ����----����������л���
	public  static void writeObj() throws IOException {
		User user = new User("����", "123");
		
		//�ҵ�Ŀ���ļ�
		File file = new File("D:\\mypc\\learn\\fujian\\obj.txt");
		
		//������������������
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		//������������������
		ObjectOutputStream  objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		//�Ѷ���д��
		objectOutputStream.writeObject(user);
		
		//�ر�ͨ��
		objectOutputStream.close();
	}

}
