package cn.itcast.util;

import java.util.Arrays;
import java.util.List;

import cn.itcast.list.list;

/*
 ����Ĺ����� Arrays
 * 
1�����ֲ���,������Ҫ����
	binarySearch(int[])
	binarySearch(double[])

2����������
	sort(int[])
	sort(char[])����
2��	���������ַ�����
 	toString(int[])
 	
------------------------- 	

3��	�������顣
 	copyOf(original, int newLength) ;
 		original : Դ����
 		newLength:������ĳ���
 		
4��	���Ʋ������顣
	copyOfRange(original,int from, int to):
		original : Դ����
		from �� ��ʼ����������ֵ
		to:����������ֵ��
		
5��	�Ƚ����������Ӧλ�õ�Ԫ���Ƿ���ͬ��
	equals(int[],int[]);
	
6��	�������ɼ��ϡ�
	List asList(T[]);
	list.toArray() ; //���ϱ�����
 */

public class Arrays���鹤���� {

	public static void main(String[] args) {
		Integer[] arr = {10,8,6,9};
		Integer[] arr2 =  Arrays.copyOf(arr, 6);
		
		Integer[] arr3 = Arrays.copyOfRange(arr, 1, 3);
		
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("�ж����������Ԫ���Ƿ���ȫһ��"+Arrays.equals(arr, arr2));
		
		List<Integer> list =  Arrays.asList(arr);
		
	}

}
