package cn.itcast.set;

import java.util.HashSet;
import java.util.Set;

/*
集合 的体系：
------------| Collection 单例集合的根接口
----------------| List  如果是实现了List接口的集合类，具备的特点： 有序，可重复。 
-------------------| ArrayList  ArrayList 底层是维护了一个Object数组实现的。 特点： 查询速度快，增删慢。
-------------------| LinkedList LinkedList 底层是使用了链表数据结构实现的， 特点： 查询速度慢，增删快。
-------------------| Vector(了解即可)  底层也是维护了一个Object的数组实现的，实现与ArrayList是一样的，但是Vector是线程安全的，操作效率低。

----------------| Set  如果是实现了Set接口的集合类，具备的特点： 无序，不可重复。
	
无序： 添加元素 的顺序与元素出来的顺序是不一致 的。

没有特有方法，完全继承

*/

public class set {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("王五");
		set.add("李四");
		set.add("张三");
		
		System.out.println(set.add("张三"));
		
		System.out.println(set);

	}

}
