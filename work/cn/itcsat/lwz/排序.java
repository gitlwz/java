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
		return "{ Ãû×Ö£º"+ this.name+" ÄêÁä£º"+ this.age+"}";
	}
	
}

public class ÅÅĞò {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Person("¹·ÍŞ", 7));
		list.add(new Person("¹·Ê£", 17));
		list.add(new Person("Ìúµ°", 3));
		list.add(new Person("ÃÀÃÀ", 30));

	}

}
