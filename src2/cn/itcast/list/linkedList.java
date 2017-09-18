package cn.itcast.list;

import java.util.Iterator;
import java.util.LinkedList;

/*
list
-------| ArrayList   ArrayList �ײ���ά����һ��Object����ʵ�� �ģ� �ص�: ��ѯ�ٶȿ죬��ɾ����
-------| LinkedList   LinkedList�ײ���ʹ�����������ݽṹʵ�ֵģ�  �ص㣺 ��ѯ�ٶ�������ɾ�졣


LinkedList ���еķ�����
	1����������
        addFirst(E e) 
		addLast(E e) 
		getFirst() 
		getLast() 
		removeFirst() 
		removeLast() 
		���������û��Ԫ�أ���ȡ����ɾ��Ԫ
		���ף�NoSuchElementException
	2�����ݽṹ
		1��ջ ��1.6��   : ��Ҫ������ʵ�ֶ�ջ���ݽṹ�Ĵ洢��ʽ��
			�Ƚ����
			push()   ����ڵ�һ��
			pop()    �Ƴ�����õ�һ��
		2�����У�˫�˶���1.5�� : ��Ҫ��Ϊ�������ǿ���ʹ��LinkedListģ��������ݵ����ݽṹ
			�Ƚ��ȳ�
			offer()   �����ĩβ
			poll()    �Ƴ�����õ�һ��
	3����������ĵ���������      
			descendingIterator()   ��������ĵ���������






*/
public class linkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("����");
		list.add("����");
		list.add("����");
		
		/*
		list.addFirst("����"); //��Ԫ����ӵ����ϵ���λ���ϡ�
		list.addLast("��ʣ"); //��Ԫ����ӵ����ϵ�ĩβ�ϡ�    ʵ���Ͼ��ǵ���add����
		
		System.out.println("��ȡ�����е���λ��Ԫ�أ�"+ list.getFirst());
		System.out.println("��ȡ�����е�ĩβ��Ԫ�أ�"+ list.getLast());
		
		System.out.println("ɾ�������е���λԪ�أ�������ɾ��Ԫ�أ�"+ list.removeFirst());
		System.out.println("ɾ�������е�ĩβԪ�أ�������ɾ��Ԫ�أ�"+ list.removeLast());
		
		
		list.push("����");   //��Ԫ�ز���˼��ϵĿ�ͷ����
		       
		System.out.println("---------"+list.pop()); //�Ƴ������ؼ��ϵ��еĵ�һ��Ԫ�ء�
		
		
		list.offer("��ʣ"); //��ָ��Ԫ����ӵ����б��ĩβ�����һ��Ԫ�أ�
		
		System.out.println("ɾ�����ϵ���Ԫ�أ�"+ list.poll());
		*/
		
		Iterator it = list.descendingIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		System.out.println("---------"+list);
	}
	
}
