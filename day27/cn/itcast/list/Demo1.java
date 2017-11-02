package cn.itcast.list;

import java.util.Arrays;

/*
内存泄露

需求：编写一个类使用数据模拟堆栈的存储方式

堆栈存储特点：先进后厨，后劲先出




*/
/*
内存泄露

需求：编写一个类使用数组模拟堆栈的存储方式。  

堆栈存储特点： 先进后出，后进先出。


注意： 不再使用的对象，应该不要让变量指向该对象，要让该对象尽快的被垃圾回收期回收。


*/
class StackList1{
	
	Object[] elements;
	
	int index = 0 ; //当前的索引值
	
	public StackList1(){
		this.elements = new Object[3];
	}
	
	//添加内容
	public void add(Object o){
		//添加元素之前应该要先检查是否容量够用。
		ensureCapcity();
		elements[index++] = o;
	}
	
	
	//出栈: 删除集合的元素，并且返回。
	public Object pop(){
		int tempIndex = --index;
		Object o = elements[tempIndex];
		elements[tempIndex] = null; //让该位置不再 引用着指定的对象,让垃圾回收期赶快回收该垃圾。
		return o;
	}
	
	
	//检查当前的数组使用够用。
	public void ensureCapcity(){
		if(index==elements.length){
			//计算一个新的长度
			int newLength =	elements.length*2;
			elements = Arrays.copyOf(elements, newLength);
		}
	}
	
	//获取当前的元素 个数
	public int size(){
		return index;
	}

}





public class Demo1 {

	public static void main(String[] args) {
		StackList1 list = new StackList1();
		list.add("狗娃");
		list.add("狗剩");
		list.add("铁蛋");
		list.add("美美");
	
		int size = list.size();
		for(int i = 0 ; i<size ; i++){
			System.out.println(list.pop());
		}
		
		
		
	}
	
}
