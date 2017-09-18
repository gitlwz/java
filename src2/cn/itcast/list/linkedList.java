package cn.itcast.list;

import java.util.Iterator;
import java.util.LinkedList;

/*
list
-------| ArrayList   ArrayList 底层是维护了一个Object数组实现 的， 特点: 查询速度快，增删慢。
-------| LinkedList   LinkedList底层是使用了链表数据结构实现的，  特点： 查询速度慢，增删快。


LinkedList 特有的方法：
	1：方法介绍
        addFirst(E e) 
		addLast(E e) 
		getFirst() 
		getLast() 
		removeFirst() 
		removeLast() 
		如果集合中没有元素，获取或者删除元
		素抛：NoSuchElementException
	2：数据结构
		1：栈 （1.6）   : 主要是用于实现堆栈数据结构的存储方式。
			先进后出
			push()   添加在第一个
			pop()    移除并获得第一个
		2：队列（双端队列1.5） : 主要是为了让你们可以使用LinkedList模拟队列数据的数据结构
			先进先出
			offer()   添加在末尾
			poll()    移除并获得第一个
	3：返回逆序的迭代器对象      
			descendingIterator()   返回逆序的迭代器对象






*/
public class linkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		
		/*
		list.addFirst("狗娃"); //把元素添加到集合的首位置上。
		list.addLast("狗剩"); //把元素添加到集合的末尾上。    实际上就是等于add方法
		
		System.out.println("获取集合中的首位置元素："+ list.getFirst());
		System.out.println("获取集合中的末尾置元素："+ list.getLast());
		
		System.out.println("删除集合中的首位元素，并返回删除元素："+ list.removeFirst());
		System.out.println("删除集合中的末尾元素，并返回删除元素："+ list.removeLast());
		
		
		list.push("狗娃");   //将元素插入此集合的开头处。
		       
		System.out.println("---------"+list.pop()); //移除并返回集合的中的第一个元素。
		
		
		list.offer("狗剩"); //将指定元素添加到此列表的末尾（最后一个元素）
		
		System.out.println("删除集合的首元素："+ list.poll());
		*/
		
		Iterator it = list.descendingIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		System.out.println("---------"+list);
	}
	
}
