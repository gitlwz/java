package myself;

import java.util.ArrayList;
import java.util.Collections.*;

/*
jdk 1.5������֮ ------------ ��̬����
	
	��̬��������ã�����д��
	
	
	��̬����ĸ�ʽ��
	import static ����.����.��̬�ĳ�Ա

ע������
	1.�����̬����ĳ�Ա�뱾��ĳ�Ա����ͬ��������£���ôĬ��ʹ�ñ���ľ�̬��Ա������̬������Ч����
 
 */

import static java.util.Collections.*;
public class a1��̬���� {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(13);
		list.add(9);
		list.add(10);
		list.add(19);
		
		//����
		sort(list);
		
		System.out.println("���ϵ�Ԫ��" + list);
		
		System.out.println("����ֵ" + list.indexOf(13));
		System.out.println("����ֵ" + binarySearch(list, 13));

	}

}
