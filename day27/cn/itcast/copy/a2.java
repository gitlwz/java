package cn.itcast.copy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
��������¡�� ��������¡�������ö��������������Ѷ�����д���ļ��ϣ�Ȼ���ٶ�ȡ�����
��Ϣ������̾ͳ���Ϊ��������¡��
	
	ObjectInputStream
	ObjectOutputStream 

 */
public class a2 {

	public static void main(String[] args) {
		Address address = new Address("����");
		Person p1 = new Person(110,"����",address);

	}
	//��Ҫ�Ѷ���д���ļ��ϡ�
		public static void writeObj(Person p) throws IOException{
			//����һ���ļ� �����������
			FileOutputStream fileOutputStream  = new FileOutputStream("F:\\obj.txt");
			//��������������
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			//�Ѷ���д��
			objectOutputStream.writeObject(p);
			//�ر���Դ
			objectOutputStream.close();
			
		}
}
