package cn.itcast.eclipse;

import java.util.ArrayList;

/*
 alt + /     		:���ݲ�ȫ��

 ctrl + 1    		:�����޸�

 alt + ���·���� 		���ƶ�����

 ctrl + shift + /  	��Ӷ���ע��

 ctrl + shift + \  	ȡ������ע��

ctrl + shift + o    ���ٵ���

ctrl + d            ɾ����ǰ�д���

�ϵ���ԣ������ó���ͣ����ָ���ĵط���Ȼ��ȥ�۲�Ŀǰ��������ݣ�Ȼ��ȥ���Է�����
	
	setp over    ����
	setp into    ����
	setp return  ����
	
 */

class Person {
      String name;
      public Person() {
		// TODO Auto-generated constructor stub
	}
      
}

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("��1");
		list.add("��2");
		list = null;
		System.out.println(list.size());
	}

}
