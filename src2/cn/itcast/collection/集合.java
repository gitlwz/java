package cn.itcast.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 ���ϣ������Ǵ洢�������ݵļ���������
 
���ϱ���������ƣ�
	1.���Ͽ��Դ洢�������͵Ķ������ݣ�����ֻ�ܴ洢ͬһ���������͵����ݡ�
	2.���ϵĳ����ǻᷢ���仯�ģ�����ĳ����ǹ̶��ġ�
	

---|Collection �������ϵĸ��ӿ�
-----| List �����ʵ����List�ӿڵļ����࣬�߱����ص㣺���򣬿��ظ���
-----| Set	�����ʵ����Set�ӿڵļ����࣬�߱��ص㣺���򣬲����ظ�

Collection�еķ�����
	
	����
		add(E e)  ���
		addAll(Collection c) ��һ��������ӵ�����һ��������
	ɾ��
		clear() 
		remove(Object o) 
		removeAll(Collection c)  //ɾ��A���� �� B���� �еĽ���Ԫ��
		retainAll(Collection c)  //����A���� �� B���� �еĽ���Ԫ�أ�������Ԫ��ɾ�� 
	�鿴
		size()             //�鿴Ԫ�ظ������൱��length      
	�ж�
		containsAll(Collection c)
		contains(Object o) 
		isEmpty() 
	����
		toArray() 
		iterator() 
 
 */

public class ���� {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("abc");
		c.add(1);
		System.out.println(c.add(3.14));
		
		System.out.println("add�������ϵ�Ԫ��" + c);
		
		//��������
		Collection c2 = new ArrayList();
		c2.add("����");
		c2.add("����");
		
		c.addAll(c2);
		
		System.out.println("addAll�������ϵ�Ԫ��" + c);
		
		/*
		c.clear();
		System.out.println("clear�����¼��ϵ�Ԫ��" + c);
		*/
		System.out.println(c.remove("����"));
		System.out.println("remove�����¼��ϵ�Ԫ��" + c);
		
		System.out.println("size�����¼��ϵ�Ԫ��" + c.size());
		
		
		
	}

}
