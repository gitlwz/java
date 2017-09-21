package cn.itcast.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;


/*
集合的工具类（ Collections ）

笔试题：说出Collction 与 Collections的区别
	1.Collction 是一个单列集合的跟接口，Collections是操作

Collections：常见方法：
	2，对list集合进行排序。
		sort(list); 
	//对list进行排序,其实使用的事list容器中的对象的compareTo方法
		sort(list,comaprator);
	1，	对list进行二分查找：
	前提该集合一定要有序。
		int binarySearch(list,key);
	//必须根据元素自然顺序对列表进行升级排序
	//要求list 集合中的元素都是Comparable 的子类。
		int binarySearch(list,key,Comparator);
	
	//按照指定比较器进行排序
	3，对集合取最大值或者最小值。
		max(Collection)
		max(Collection,comparator)
		min(Collection)
		min(Collection,comparator)
	4，对list集合进行反转。
		reverse(list);
	5，可以将不同步的集合变成同步的集合。
		Set synchronizedSet(Set<T> s)
		Map synchronizedMap(Map<K,V> m)
		List synchronizedList(List<T> list)

 */



public class Demo1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(3);
		list.add(19);
		
		//排序
		Collections.sort(list);
		
		System.out.println("二分查找法" + Collections.binarySearch(list, 12));
		
		
		System.out.println("最大值:"+ Collections.max(list));
		System.out.println("最小值："+ Collections.min(list));
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		
		

	}

}
