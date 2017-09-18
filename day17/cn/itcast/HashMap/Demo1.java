package cn.itcast.HashMap;

import java.util.HashMap;



/*
˫�н�ϣ�
-----------| Map �����ʵ����Map�ӿڵļ����࣬�߱����ص㣺 �洢�����ݶ����Լ�ֵ�Ե���ʽ���ڵģ��������ظ���ֵ�����ظ���
-----------------| HashMap	

HashMap�Ĵ洢ԭ��
	��HashMap���Ԫ�ص�ʱ�����Ȼ���ü���hashCode�����õ�Ԫ�صĹ�ϣ��ֵ��Ȼ�󾭹�����Ϳ��������Ԫ���ڹ�ϣ���е��ﴦλ��
	
	���1�� ��������λ��Ŀǰû���κ�Ԫ�ش洢����ô��Ԫ�ؿ���ֱ����ӵ���ϣ���С�
	
	���2�������� ��λ��Ŀǰ�Ѿ�����������Ԫ�أ���ô������ø�Ԫ�ص�equals���������λ���ϵ�Ԫ�ؽ��бȽ�
	�����equals�������� ����false����ô��Ԫ�������洢�����equals�������ص���true����ô��Ԫ�ر���Ϊ
	�ظ�Ԫ�أ����ʴ洢��

-----------------| TreeMap
-----------------| Hashtable 
 */
class Person{
	int id;
	String name;
	public Person(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[���" + this.id + "����" + this.name+"]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		Person person =(Person) obj;
		return person.id == this.id;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		HashMap<Person, String> map = new HashMap<Person, String>();
		map.put(new Person(110,"����"), "001");
		map.put(new Person(220,"��ʣ"), "002");
		map.put(new Person(330,"����"), "003");
		map.put(new Person(110,"����"), "007");  //�����������ͬ������ô����ӵ����ݵ�ֵ��ȡ��֮ǰ ��ֵ��
		System.out.println("���ϵ�Ԫ�أ�"+ map);
	}

}
