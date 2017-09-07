package cn.itcast.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
�ж�
	isEmpty()
	contains(Object o)        //�ڲ���������equals�������бȽ�    ���ߵ���ʵ�ε�equals������
	containsAll(Collection c)   //�ж�A�����Ƿ���� B�����е�����Ԫ��  



 */

class Person{
	int id;
	
	String name;
	
	public Person(int id ,String name) {
		this.id = id;
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{��ţ�"+this.id+" ������"+ this.name+"}";
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.id == p.id;
	}
	
	//java�Ĺ淶��һ��������дequals�������Ƕ�����дhashCode ����
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
}



public class ����_�жϷ��� {

	public static void main(String[] args) {
		/*
		Collection c = new ArrayList();
		c.add("��ƻ�");
		c.add("��ź�");
		c.add("������");
		
		
		
		System.out.println("isEmpty����ʹ��->" + c.isEmpty());
		
		System.out.println("contains����ʹ��->" + c.contains("��ź�"));
		 */
		Collection c = new ArrayList();
		c.add(new Person(110, "����"));
		c.add(new Person(111, "����"));
		c.add(new Person(112, "����"));
		
		Collection c2 = new ArrayList();
		c2.add(new Person(110, "����"));
		c2.add(new Person(111, "����"));
		
		System.out.println("���ڸ�Ԫ����" + c.contains(new Person(111, "����")));
		System.out.println(c);
		
		System.out.println("containsAll���ڸ�Ԫ����" + c.containsAll(c2));
	}

}
