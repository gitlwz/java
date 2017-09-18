package cn.itcast.treemap;

import java.util.Comparator;
import java.util.TreeMap;
/*
双列结合：
-----------| Map 如果是实现了Map接口的集合类，具备的特点： 存储的数据都是以键值对的形式存在的，键不可重复，值可以重复。
-----------------| HashMap	

HashMap的存储原理：
	往HashMap添加元素的时候，首先会调用键的hashCode方法得到元素的哈希码值，然后经过运算就可以算出该元素在哈希表中的孙处位置
	
	情况1： 如果算出的位置目前没有任何元素存储，那么该元素可以直接添加到哈希表中。
	
	情况2：如果算出 的位置目前已经存在其他的元素，那么还会调用该元素的equals方法与这个位置上的元素进行比较
	，如果equals方法返回 的是false，那么该元素允许被存储，如果equals方法返回的是true，那么该元素被视为
	重复元素，不允存储。

-----------------| TreeMap  TreeMap也是基于红黑树(二叉树)数据接口实现的，特点：会对元素的键值进行排序存储

TreeMap 要注意的事项：
	1.往TreeMap添加元素的时候，如果元素的键具备自然顺序，那么就会按照键的自然顺序特性进行排序存储。
	2.如果元素键不具备自然顺序的特性，那么键所属的类必须要实现Comparable接口，把键
	的比较规则定义在CompareTo方法上。
-----------------| Hashtable 
 */







class Emp { //implements Comparable<Emp>{
	
	String name;
	
	int salary;

	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "[姓名："+this.name+" 薪水："+ this.salary+"]";
	}


	/*@Override
	public int compareTo(Emp o) {
		return this.salary - o.salary;
	}*/
	
}

//自定义一个比较器
class MyComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.salary - o2.salary;
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		/*
		TreeMap<Character, Integer> tree = new TreeMap<Character, Integer>();
		tree.put('c',10);
		tree.put('b',2);
		tree.put('a',5);
		tree.put('h',12);
		System.out.println(tree);
		*/
		
		//创建一个自定义比较器
		MyComparator comparator = new MyComparator();
		
		TreeMap<Emp, String> tree = new TreeMap<Emp, String>(comparator);
		tree.put(new Emp("冰冰", 2000),"001");
		tree.put(new Emp("家宝", 1000),"002");
		tree.put(new Emp("习总", 3000),"003");
		tree.put(new Emp("克强", 5000),"005");
		
		System.out.println(tree);
	}

}
