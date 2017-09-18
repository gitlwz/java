package cn.itcast.map;

import java.util.HashMap;
import java.util.Map;

/*

����ʾ��������Щ��������ӳ���ϵ���ڵģ�Ҳ���ǳɶԴ��ڵģ�����:
	
˫�н�ϣ�
-----------| Map �����ʵ����Map�ӿڵļ����࣬�߱����ص㣺 �洢�����ݶ����Լ�ֵ�Ե���ʽ���ڵģ��������ظ���ֵ�����ظ���
-----------------| HashMap	
-----------------| TreeMap
-----------------| Hashtable

Map�ӿڵķ���

	���
		put(K key, V value)
		putAll(Map<? extends K,? extends V> m)  

	��ȡ
		get(Object key)  //����ָ������ӳ���ֵ�������ӳ�䲻�����ü���ӳ���ϵ���򷵻� null��
		size()           //���ش�ӳ���еļ�-ֵӳ���ϵ����

	�ж�
		containsKey(Object key)  //�Ƿ������ָ���ļ�
		containsValue(Object value) //�Ƿ����ָ����ֵ
		isEmpty()                   //�Ƿ�Ϊ��
	ɾ��
		remove(Object key) //���ݼ�ɾ��һ��map�е����ݣ����ص��Ǹü���Ӧ ��ֵ��
		clear()            //��ռ����е���������
	����
		keySet() 
		entrySet()
		values() 
		 



 */


public class Demo1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		//���
		map.put("����", "������");
		map.put("����", "�����P");
		map.put("л����", "�Ű�֥");
		/*
		System.out.println("����ֵ:" + map.put("л����", "����"));
		
		System.out.println("����ֵ:" + map.remove("л����"));
		*/
		System.out.println(map);
		
		System.out.println(map);
	}

}
