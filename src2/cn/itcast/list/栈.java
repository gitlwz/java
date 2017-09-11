package cn.itcast.list;

import java.util.LinkedList;


/*
	1��ջ ��1.6��   : ��Ҫ������ʵ�ֶ�ջ���ݽṹ�Ĵ洢��ʽ��
		�Ƚ����
		push()   ����ڵ�һ��
		pop()    �Ƴ�����õ�һ��
	2�����У�˫�˶���1.5�� : ��Ҫ��Ϊ�������ǿ���ʹ��LinkedListģ��������ݵ����ݽṹ
		�Ƚ��ȳ�
		offer()   �����ĩβ
		poll()    �Ƴ�����õ�һ��
		
������Ŀ��ʹ��LinkedListʵ�ֶ�ջ���ݽṹ�Ĵ洢��ʽ����е����ݽṹ�Ĵ洢��ʽ��

��ջ���ݽṹ�洢�ص㣺�Ƚ����������ȳ���
�������ݽṹ�Ĵ洢�ص㣺�Ƚ��ȳ�����������

*/

//ʹ��LinkedListģ���ջ�����ݽṹ�洢��ʽ

class StackList{
	LinkedList list;
	public StackList() {
		list = new LinkedList();
	}
	
	//��ջ
	public void add(Object o) {
		list.push(o);
	}
	
	//��ջ
	public Object pop() {
		return list.pop();
	}
	
	//��ȡԪ�ظ���
	public int size() {
		return list.size();
	}
	
}

//ʹ��LinkedListģ����еĴ洢��ʽ

class TeamList{
	LinkedList list;
	public TeamList() {
		list = new LinkedList();
	}
	
	public void add(Object o) {
		list.offer(o);
	}
	
	public Object remove() {
		return list.poll();
	}
}


public class ջ {

	public static void main(String[] args) {
		StackList list = new StackList();
		
		list.add("��γ�");
		list.add("����");
		list.add("������");
		
		/*
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		*/
		
		for (int i = 0, j = list.size(); i < j; i++) {
			System.out.println(list.pop());
		}
	}

}
