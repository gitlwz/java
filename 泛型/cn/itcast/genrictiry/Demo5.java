package cn.itcast.genrictiry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*

���͵������ޣ�
	
	���󣺶���һ���������Խ����������͵ļ��϶���,Ҫ����յļ��϶���ֻ�ܴ洢Number������Number�������������ݡ�
	
	������ͨ���:?
		? super Integer : ֻ�ܴ洢Integer������Integer����Ԫ�ء�  ���� ������
		
 		? extends Number �� ֻ�ܴ洢Number������Number���͵��������ݡ� ��������
 */


public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Number> list2 = new ArrayList<Number>();
		
		HashSet<String> set = new HashSet<String>();
		
		print(list2);
		
	}
	
	//���͵�����
	public static void getData(Collection<? extends Number> c) {
		
	}
	
	
	//���͵�����
	public static void print(Collection<? super Integer> c) {
		
	}

}
