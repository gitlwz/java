package cn.itcast.list;

import java.util.ArrayList;
import java.util.List;

/*List�ӿ������з�����

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


List�ӿ������еķ����߱����ص㣬�����ķ�������������ֵ

ֻ��List�ӿ�����ļ�����ž߱�����ֵ�������ӿ�����ļ����඼û����ֵ

����
	listIterator()*/ 
public class list_���� {
	public static void main(String[] args) {
		List list=  new ArrayList();
		list.add("����");
		list.add("��ʣ");
		list.add("����");  //��Ԫ����ӵ����ϵ�ĩβ����
		list.add("����"); 
		/*
		��ӷ���
		
		list.add(1,"�Ա�ɽ"); //��Ԫ����ӵ�������ָ��������ֵλ��
		
		List list2=  new ArrayList();
		list2.add("��ɽ");
		list2.add("С����");
		
		list.addAll(2,list2);  //��list2��Ԫ����ӵ�ָ������ֵ��λ����
		*/
		/*
		��ȡ�ķ���
		
		list.get(index);   //��������ֵ��ȡ�����е�Ԫ��
		System.out.println("get��ȡ�����е�Ԫ��"+list.get(1));
		
		ʹ��get�����������ϵ�Ԫ�أ�
		for (int i = 0; i < list.size() ; i++) {
			System.out.print(list.get(i)+",");
		}
		
		
		System.out.println("�ҳ�ָ��Ԫ�ص�����ֵ" + list.indexOf("��ʣ"));
		
		List listSub= list.subList(1, 2);//ָ����ʼ�����������ֵ����ȡԪ��;
		System.out.println(listSub);
		*/
		
		//list.set(index, element) //ʹ��Ԫ���滻ָ������λ�õ�Ԫ��
		
		System.out.println(list);
		
	}
	
}
