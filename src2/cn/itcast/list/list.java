package cn.itcast.list;

import java.util.List;
import java.util.ArrayList;

/*
������ϵ
------| Collection 
---------| List  �����ʵ����List�ӿڵļ����࣬�ü�����߱����ص㣺���򣬿��ظ�

---------| Set   �����ʵ����Set�ӿڵļ����࣬�ü�����߱����ص㣺���򣬿��ظ�

List:
	����:���ϵ�������ָ��Ȼ˳�򣬶���ָ��ӽ�ȥ��˳����Ԫ�س�����˳����һ�µġ�
	
List�ӿ������з�����
	
	���
		add(int index, E element) 
		addAll(int index, Collection<? extends E> c) 
	��ȡ��
		get(int index) 
		indexOf(Object o) 
		lastIndexOf(Object o) 
		subList(int fromIndex, int toIndex) 
	�޸ģ�
		set(int index, E element) 

	����
		listIterator() 

 */


public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		System.out.println("���ϵ�˳��" + list);

	}

}
