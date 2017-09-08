package cn.itcast.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
�ж�
	����
		toArray() 
		iterator() 
	�����������ã���������ץȡ�����е�Ԫ��
		hasNext()   ���Ƿ���Ԫ�ؿɱ����������Ԫ�ؿ��Ա���������true�����򷵻�false ��
          	
	 	next()    ��ȡԪ��...
	    	      	  
	 	remove()  �Ƴ����������һ�η��� ��Ԫ�ء�
 */
public class ����_���� {

	public static void main(String[] args) {
		/*Collection c = new ArrayList();
		c.add("��ƻ�");
		c.add("��ź�");
		c.add("������");
		
		Object[] arr = c.toArray();
		System.out.println("�����Ԫ��" + Arrays.toString(arr));*/
		
		Collection c = new ArrayList();
		c.add("��ƻ�");
		c.add("��ź�");
		c.add("������");
		c.add("������");
		//�������ϵ�Ԫ��--------->��ʽһ������ʹ��toArray ������
		Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ",");
		}
		System.out.println("-------------------------------------");
		//Ҫ��ʹ��iterator��������
		Iterator it = c.iterator(); //����һ��������  iterator���ص���ʵ����ķ���
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
