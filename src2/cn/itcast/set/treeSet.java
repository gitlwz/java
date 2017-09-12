package cn.itcast.set;

import java.util.TreeSet;

/*
集合 的体系：
------------| Collection 单例集合的根接口
----------------| List  如果是实现了List接口的集合类，具备的特点： 有序，可重复。 
-------------------| ArrayList  ArrayList 底层是维护了一个Object数组实现的。 特点： 查询速度快，增删慢。
-------------------| LinkedList LinkedList 底层是使用了链表数据结构实现的， 特点： 查询速度慢，增删快。
-------------------| Vector(了解即可)  底层也是维护了一个Object的数组实现的，实现与ArrayList是一样的，但是Vector是线程安全的，操作效率低。

----------------| Set  如果是实现了Set接口的集合类，具备的特点： 无序，不可重复。
-------------------| HashSet  底层是使用了哈希表来支持的，特点： 存取速度快. 
-------------------| TreeSet   如果元素具备自然顺序 的特性，那么就按照元素自然顺序的特性进行排序存储。

TreeSet:
*/
public class treeSet {

	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		
		/*	tree.add(1);
		tree.add(10);
		tree.add(7);
		tree.add(19);
		tree.add(9);*/
		
		tree.add('b');
		tree.add('f');
		tree.add('a');
		tree.add('c');

		
		System.out.println(tree);
		
		
	}

}
