package cn.itcast.set;

import java.util.Comparator;
import java.util.TreeSet;



/*
treeSet添加自定义元素:

treeSet要注意的事项：
	1. 往TreeSet添加元素的时候，如果元素本身具备了自然顺序的特性，那么就按照元素自然顺序的特性进行排序存储。
	2. 往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，那么该元素所属的类必须要实现Comparable接口，把元素
	的比较规则定义在compareTo(T o)方法上。 
	3.如果比较元素的时候，compareTo方法返回的是0，那么该元素就被视为重复元素，不允许添加（）
	
	4.往TreeSet添加元素的时候, 如果元素本身没有具备自然顺序 的特性，而元素所属的类也没有实现Comparable接口，那么必须要在创建TreeSet的时候传入一个
 	比较器。
 	
 	
 	5.往TreeSet添加元素的时候, 如果元素本身没有具备自然顺序 的特性，而元素所属的类已经实现了Comparable接口，在创建TreeSet对象也传入了比较器，那么以比较器为优先比较规则
 	如何自定义比较器： 自定义一个类实现Comparator接口即可，把元素与元素之间的比较规则定义在compare方法内即可。
 		自定义比较器的格式：
 			class 类名  implenebts Comparator{
 				
 			}
 	推荐使用：比较器(Comparator)
*/


class Emp {
	int id;
	
	String name;
	
	int salary;
	
	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "{ 编号："+  this.id+" 姓名："+ this.name+" 薪水："+ this.salary+"}";
	}
	
	/*public int compareTo(Object o) {
		Emp emp = (Emp) o;
		return this.salary - emp.salary;
	}*/
}

//自定义比较器
class MyComparator implements Comparator{
	//根据第一个参数小于、等于或大于第二个参数分别返回负整数、零或正整数。 
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp) o1;
		Emp e2 = (Emp) o2;
		return e1.id - e2.id;
	}

	
}

public class treeSet2 {
	
	public static void main(String[] args) {
		TreeSet tree = new TreeSet(new MyComparator());
		
		tree.add(new Emp(113, "老钟", 200));
		tree.add(new Emp(110, "老陆", 100));
		tree.add(new Emp(220, "老汤", 300));
		tree.add(new Emp(120, "老才", 500));
		
		
		System.out.println("集合的元素:" + tree);
	}

}
