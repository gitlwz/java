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
		return "(������" + this.name + "���䣺" + this.age + ")";
	}
}

class AgeComparator implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.age - o2.age;
	}
}




public class Demo2 {
	
	//������ϴ洢�Ķ��ǲ��߱���Ȼ˳���Ԫ�أ���ô����Ҫ����Ƚ���
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("����", 12));
		list.add(new Person("����", 22));
		list.add(new Person("����", 2));
		
		
		Collections.sort(list, new AgeComparator());
		
		System.out.println("���ֲ��ҷ�"+ Collections.binarySearch(list, new Person("����", 2),new AgeComparator()));
		
		System.out.println("���ֵ:"+ Collections.max(list,new AgeComparator()));
		System.out.println("��Сֵ��"+ Collections.min(list,new AgeComparator()));
		
		System.out.println(list);
	}

}
