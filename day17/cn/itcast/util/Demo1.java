package cn.itcast.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;


/*
���ϵĹ����ࣨ Collections ��

�����⣺˵��Collction �� Collections������
	1.Collction ��һ�����м��ϵĸ��ӿڣ�Collections�ǲ���

Collections������������
	2����list���Ͻ�������
		sort(list); 
	//��list��������,��ʵʹ�õ���list�����еĶ����compareTo����
		sort(list,comaprator);
	1��	��list���ж��ֲ��ң�
	ǰ��ü���һ��Ҫ����
		int binarySearch(list,key);
	//�������Ԫ����Ȼ˳����б������������
	//Ҫ��list �����е�Ԫ�ض���Comparable �����ࡣ
		int binarySearch(list,key,Comparator);
	
	//����ָ���Ƚ�����������
	3���Լ���ȡ���ֵ������Сֵ��
		max(Collection)
		max(Collection,comparator)
		min(Collection)
		min(Collection,comparator)
	4����list���Ͻ��з�ת��
		reverse(list);
	5�����Խ���ͬ���ļ��ϱ��ͬ���ļ��ϡ�
		Set synchronizedSet(Set<T> s)
		Map synchronizedMap(Map<K,V> m)
		List synchronizedList(List<T> list)

 */



public class Demo1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(3);
		list.add(19);
		
		//����
		Collections.sort(list);
		
		System.out.println("���ֲ��ҷ�" + Collections.binarySearch(list, 12));
		
		
		System.out.println("���ֵ:"+ Collections.max(list));
		System.out.println("��Сֵ��"+ Collections.min(list));
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		
		

	}

}
