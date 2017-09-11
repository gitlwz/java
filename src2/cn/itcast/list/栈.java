package cn.itcast.list;

import java.util.LinkedList;


/*
	1：栈 （1.6）   : 主要是用于实现堆栈数据结构的存储方式。
		先进后出
		push()   添加在第一个
		pop()    移除并获得第一个
	2：队列（双端队列1.5） : 主要是为了让你们可以使用LinkedList模拟队列数据的数据结构
		先进先出
		offer()   添加在末尾
		poll()    移除并获得第一个
		
机试题目：使用LinkedList实现堆栈数据结构的存储方式与队列的数据结构的存储方式。

堆栈数据结构存储特点：先进后厨，后进先出。
队列数据结构的存储特点：先进先出，后进后出。

*/

//使用LinkedList模拟堆栈的数据结构存储方式

class StackList{
	LinkedList list;
	public StackList() {
		list = new LinkedList();
	}
	
	//进栈
	public void add(Object o) {
		list.push(o);
	}
	
	//弹栈
	public Object pop() {
		return list.pop();
	}
	
	//获取元素个数
	public int size() {
		return list.size();
	}
	
}

//使用LinkedList模拟队列的存储方式

class TeamList{
	LinkedList list;
	public TeamList() {
		list = new LinkedList();
	}
	
	public void add(Object o) {
		list.offer(o);
	}
	
	public Object remove() {
		return list.poll();
	}
}


public class 栈 {

	public static void main(String[] args) {
		StackList list = new StackList();
		
		list.add("李嘉诚");
		list.add("马云");
		list.add("王健林");
		
		/*
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		*/
		
		for (int i = 0, j = list.size(); i < j; i++) {
			System.out.println(list.pop());
		}
	}

}
