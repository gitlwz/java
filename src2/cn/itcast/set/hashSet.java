package cn.itcast.set;

import java.util.HashSet;
/*
���� ����ϵ��
----------| Collection �������ϵĸ��ӿ�
--------------| List  �����ʵ����List�ӿڵļ����࣬�߱����ص㣺 ���򣬿��ظ��� 
-----------------| ArrayList  ArrayList �ײ���ά����һ��Object����ʵ�ֵġ� �ص㣺 ��ѯ�ٶȿ죬��ɾ����
-----------------| LinkedList LinkedList �ײ���ʹ�����������ݽṹʵ�ֵģ� �ص㣺 ��ѯ�ٶ�������ɾ�졣
-----------------| Vector(�˽⼴��)  �ײ�Ҳ��ά����һ��Object������ʵ�ֵģ�ʵ����ArrayList��һ���ģ�����Vector���̰߳�ȫ�ģ�����Ч�ʵ͡�

--------------| Set  �����ʵ����Set�ӿڵļ����࣬�߱����ص㣺 ���򣬲����ظ���
-----------------| HashSet  �ײ���ʹ���˹�ϣ����֧�ֵģ��ص㣺 ��ȡ�ٶȿ�. 

HashSet:
	��Haset���Ԫ�ص�ʱ��HashSet���ȵ���Ԫ�ص�hashCode�����õ�Ԫ�صĹ�ϣֵ ��
	Ȼ��ͨ��Ԫ�� �Ĺ�ϣֵ������λ�����㣬�Ϳ��������Ԫ���ڹ�ϣ���� �Ĵ洢λ�á�
	
	���1�� ������Ԫ�ش洢��λ��Ŀǰû���κ�Ԫ�ش洢����ô��Ԫ�ؿ���ֱ�Ӵ洢����λ���ϡ�

	���2�� ��������Ԫ�صĴ洢λ��Ŀǰ�Ѿ�������������Ԫ���ˣ���ô����ø�Ԫ�ص�equals�������λ�õ�Ԫ���ٱȽ�һ��
	�����equals���ص���true����ô��Ԫ�������λ���ϵ�Ԫ�ؾ���Ϊ�ظ�Ԫ�أ���������ӣ����equals�������ص���false����ô��Ԫ������ ��ӡ�
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
		// TODO Auto-generated method stub
		return "{ ���:"+ this.id+" ������"+ this.name+"}";
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println(this.name);
		Person p = (Person)obj;
		return this.id == p.id;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode����������");
		return this.id;
	}
}

public class hashSet {

	public static void main(String[] args) {
		/*
		HashSet set = new HashSet();
		set.add("����");
		set.add("��ʣ");
		set.add("����");
		
		System.out.println(set);
		*/
		
		HashSet set = new HashSet();
		
		set.add(new Person(110,"����"));
		set.add(new Person(220,"��ʣ"));
		set.add(new Person(330,"����"));
		set.add(new Person(110,"�´�"));
		
		System.out.println("���ϵ�Ԫ��:" + set);
		
	}

}
