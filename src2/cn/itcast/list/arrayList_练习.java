package cn.itcast.list;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.lang.model.element.VariableElement;

class Book{
	int id;
	
	String name;
	
	public Book(int id,String name) {
		this.id = id;
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{"+ this.id + "," + this.name + "}";
	}
}



//需求：编写一个函数清楚集合中重复元素。如果书号是一样就视为重复元素。

public class arrayList_练习 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		list.add(new Book(110,"java编程思想"));
		list.add(new Book(220,"java核心技术"));
		list.add(new Book(330,"深入javaweb"));
		list.add(new Book(110,"javas神书"));
		
		ArrayList list2 = distinct(list);
		System.out.println(list2);
	}
	
	public static ArrayList distinct(ArrayList list) {
		ArrayList newList = new ArrayList();
		ListIterator it = list.listIterator();	
		while (it.hasNext()) {
			ListIterator newit = newList.listIterator();
			Book oldBook = (Book) it.next();
			if(newList.size() == 0){
				newList.add(oldBook);
			}else {
				while (newit.hasNext()) {
					Book newBook = (Book) newit.next();
					if(oldBook.id == newBook.id){
						break;
					}else if(!newit.hasNext()){
						newit.add(oldBook);
					}
				}
			}
		}
		return newList;
	} 
}
