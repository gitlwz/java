package cn.itcast.list;

import java.util.List;
import java.util.ArrayList;

/*
集合体系
------| Collection 
---------| List  如果是实现了List接口的集合类，该集合类具备的特点：有序，可重复

---------| Set   如果是实现了Set接口的集合类，该集合类具备的特点：有序，可重复

List:
	有序:集合的有序不是指自然顺序，而是指添加进去的顺序与元素出来的顺序是一致的。
	
List接口中特有方法：
	
	添加
		add(int index, E element) 
		addAll(int index, Collection<? extends E> c) 
	获取：
		get(int index) 
		indexOf(Object o) 
		lastIndexOf(Object o) 
		subList(int fromIndex, int toIndex) 
	修改：
		set(int index, E element) 

	迭代
		listIterator() 

 */


public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		System.out.println("集合的顺序" + list);

	}

}
