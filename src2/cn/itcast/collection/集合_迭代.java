package cn.itcast.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
判断
	迭代
		toArray() 
		iterator() 
	迭代器的作用，就是用来抓取集合中的元素
		hasNext()   问是否有元素可遍历。如果有元素可以遍历，返回true，否则返回false 。
          	
	 	next()    获取元素...
	    	      	  
	 	remove()  移除迭代器最后一次返回 的元素。
 */
public class 集合_迭代 {

	public static void main(String[] args) {
		/*Collection c = new ArrayList();
		c.add("令计划");
		c.add("徐才厚");
		c.add("周永康");
		
		Object[] arr = c.toArray();
		System.out.println("数组的元素" + Arrays.toString(arr));*/
		
		Collection c = new ArrayList();
		c.add("令计划");
		c.add("徐才厚");
		c.add("周永康");
		c.add("胡锦涛");
		//遍历集合的元素--------->方式一：可以使用toArray 方法；
		Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ",");
		}
		System.out.println("-------------------------------------");
		//要求使用iterator方法遍历
		Iterator it = c.iterator(); //返回一个迭代器  iterator返回的是实现类的方法
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
