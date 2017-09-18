package cn.itcast.util;

import java.util.Arrays;
import java.util.List;

import cn.itcast.list.list;

/*
 数组的工具类 Arrays
 * 
1，二分查找,数组需要有序
	binarySearch(int[])
	binarySearch(double[])

2，数组排序
	sort(int[])
	sort(char[])……
2，	将数组变成字符串。
 	toString(int[])
 	
------------------------- 	

3，	复制数组。
 	copyOf(original, int newLength) ;
 		original : 源数组
 		newLength:新数组的长度
 		
4，	复制部分数组。
	copyOfRange(original,int from, int to):
		original : 源宿主
		from ： 开始拷贝的索引值
		to:结束的索引值。
		
5，	比较两个数组对应位置的元素是否相同。
	equals(int[],int[]);
	
6，	将数组变成集合。
	List asList(T[]);
	list.toArray() ; //集合变数组
 */

public class Arrays数组工具类 {

	public static void main(String[] args) {
		Integer[] arr = {10,8,6,9};
		Integer[] arr2 =  Arrays.copyOf(arr, 6);
		
		Integer[] arr3 = Arrays.copyOfRange(arr, 1, 3);
		
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("判断两个数组的元素是否完全一致"+Arrays.equals(arr, arr2));
		
		List<Integer> list =  Arrays.asList(arr);
		
	}

}
