package cn.itcast.genrictiry;

import java.util.ArrayList;

/*
 * ������jdk1.5ʹ�õ���������
 	
 	����
 		���󣺰�һ��������Ԫ��ȫ��ת�ɴ�д
 	���͵ĺô�
 		1.������ʱ���쳣��ǰ���˱���ʱ��
 		2.��������ν��ǿ������ת���ˡ�
 		
 	�����ڼ����еĳ���Ӧ��
 		ArrayList<String>  list = new ArrayList<String>();  true     �Ƽ�ʹ�á�
  	
	  	ArrayList<Object>  list = new ArrayList<String>();  false
	  	ArrayList<String>  list = new ArrayList<Object>();  false
	  	
	  	//��������д����Ҫ��Ϊ�˼������ϵͳ�ļ��������⡣
	    ArrayList<String>  list = new ArrayList();          true   
	    ArrayList    list = new ArrayList<String>();   		true  
	 ע�⣺����û�ж�̬�ĸ���������ߵ��������ͱ���Ҫһֱ������ֻ��дһ��ķ������͡�
 */


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(); //<String> ��ʾ������ֻ�ܴ����ַ������͵���ֵ
		
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		for(int i = 0 ; i < list.size() ; i++){
			String str =  list.get(i);
			System.out.println("��д��"+ str.toUpperCase());
		}
	}

}
