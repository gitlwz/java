package myself;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
jdk1.5 ���ֵ������� ------����ǿforѭ��

��ǿforѭ�������ã��򵥵���������д��ʽ��(ע�⣺��ǿforѭ���ĵײ㻹��ʹ���˵�����������)

��ǿfor�廻��ʹ�÷�Χ:�����ʵ����Iterable�ӿڵĶ��������������󶼿���ʹ����ǿforѭ����

��ǿforѭ���ĸ�ʽ��

	for( ��������    ������   ������Ŀ��  ){
	
	}

��ǿforѭ��Ҫע������
	1.��ǿforѭ���ײ�Ҳ��ʹ���˵�������ȡ�ģ�ֻ������ȡ��������jvm��ɣ�����Ҫ���ǻ�ȡ���������ѣ�������ʹ����ǿforѭ������Ԫ�صĹ����в�׼
	       ʹ�ü��϶���Լ��ϵ�Ԫ�ظ��������޸ġ�
	2.����������Ԫ������ǿforѭ������Ԫ�ص�����
		1��ʹ�õ������������ϵ�Ԫ��ʱ����ɾ�����ϵ�Ԫ�أ�����ǿforѭ����������
	3.��ͨforѭ������ǿforѭ��������
		��ͨforѭ������û��Ŀ�꣬��ǿforѭ��һ��Ҫ�б���Ŀ�ꡣ
	4.
*/
public class a2��ǿforѭ�� {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("����");
		set.add("��ʣ");
		set.add("����");
		
		
		//ʹ�õ���������Set�ļ���
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("Ԫ�� ��" + iterator.next());
			
		}
		//ʹ����ǿforѭ������------------------------------------
		for ( String item : set) {
			System.out.println("��ǿforѭ������Ԫ��: " + item);
//			set.remove("��ʣ");
		}
		
		//����---------------------------------------------------
		
		int[] arr = {12,5,6,1};
		
		//��ͨforѭ���ı�����ʽ
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Ԫ�أ�" + arr[i]);
		}
		//��ǿforѭ���ı���
		
		for( int item : arr){
			System.out.println("��ǿforѭ��Ԫ��: " + item);
		}
		
		//ע�⣺Map����û��ʵ��Iterable�ӿڣ�����map���ϲ���ֱ��ʹ����ǿforѭ��
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("001", "��1");
		map.put("002", "��2");
		map.put("003", "��3");
		map.put("004", "��4");
		
		Set<Map.Entry<String, String>> entries = map.entrySet();
		
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + entry.getValue());
		}
		
		
	}

}
