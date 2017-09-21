package cn.itcast.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.sql.Date;

class Person{
	String name;
	
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(姓名：" + this.name + "年龄：" + this.age + ")";
	}
}

class AgeComparator implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.age - o2.age;
	}
}




public class Demo2 {
	
	//如果集合存储的都是不具备自然顺序的元素，那么排序都要传入比较器
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("狗娃", 12));
		list.add(new Person("张三", 22));
		list.add(new Person("铁蛋", 2));
		
		
		Collections.sort(list, new AgeComparator());
		
		System.out.println("二分查找法"+ Collections.binarySearch(list, new Person("铁蛋", 2),new AgeComparator()));
		
		System.out.println("最大值:"+ Collections.max(list,new AgeComparator()));
		System.out.println("最小值："+ Collections.min(list,new AgeComparator()));
		
		System.out.println(list);
	}

}
