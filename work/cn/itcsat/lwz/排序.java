package cn.itcsat.lwz;

import java.util.LinkedList;



class Person{
	
	String name;
	
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	@Override 
	public String toString() {
		return "{ ���֣�"+ this.name+" ���䣺"+ this.age+"}";
	}
	
}

public class ���� {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Person("����", 7));
		list.add(new Person("��ʣ", 17));
		list.add(new Person("����", 3));
		list.add(new Person("����", 30));

	}

}
