package cn.itcast.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 集合：集合是存储对象数据的集合容器。
 
集合比数组的优势：
	1.集合可以存储任意类型的对象数据，数组只能存储同一种数据类型的数据。
	2.集合的长度是会发生变化的，数组的长度是固定的。
	

---|Collection 单例集合的根接口
-----| List 如果是实现了List接口的集合类，具备的特点：有序，可重复。
-----| Set	如果是实现了Set接口的集合类，具备特点：无序，不可重复

Collection中的方法：
	
	增加
		add(E e)  添加
		addAll(Collection c) 把一个集合添加到另外一个集合中
	删除
		clear() 
		remove(Object o) 
		removeAll(Collection c)  //删除A集合 和 B集合 中的交集元素
		retainAll(Collection c)  //保留A集合 和 B集合 中的交集元素，其他的元素删除 
	查看
		size()             //查看元素个数，相当于length      
	判断
		containsAll(Collection c)
		contains(Object o) 
		isEmpty() 
	迭代
		toArray() 
		iterator() 
 
 */

public class 集合 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("abc");
		c.add(1);
		System.out.println(c.add(3.14));
		
		System.out.println("add方法集合的元素" + c);
		
		//创建集合
		Collection c2 = new ArrayList();
		c2.add("王林");
		c2.add("成龙");
		
		c.addAll(c2);
		
		System.out.println("addAll方法集合的元素" + c);
		
		/*
		c.clear();
		System.out.println("clear方法下集合的元素" + c);
		*/
		System.out.println(c.remove("成龙"));
		System.out.println("remove方法下集合的元素" + c);
		
		System.out.println("size方法下集合的元素" + c.size());
		
		
		
	}

}
