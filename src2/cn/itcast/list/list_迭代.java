package cn.itcast.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;



/*
        ����
  listIterator()
  
  listIterator���еķ���
  	��ӣ�
		hasPrevious()  �ж��Ƿ������һ��Ԫ�ء�
		previous()    ��ǰָ���������ƶ�һ����λ��Ȼ����ȡ����ǰָ��ָ���Ԫ�ء�
		
		next();  ��ȡ����ǰָ��ָ���Ԫ�أ�Ȼ��ָ�������ƶ�һ����λ��
		
---------------------------	��

	
		add(E e)   �ѵ�ǰ��Ԫ�ز��뵽��ǰָ��ָ���λ���ϡ�
		set(E e)   �滻���������һ�η��ص�Ԫ�ء�
*/
public class list_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("����");
		list.add("��ʣ");
		list.add("����");
		list.add("����");
		
		ListIterator listIt= list.listIterator(); 
		/*System.out.println(listIt.hasPrevious());
		System.out.println("��ȡ��һ��Ԫ��" + listIt.previous());*/
		
		listIt.add("����");
		System.out.println(list);
	}

}
