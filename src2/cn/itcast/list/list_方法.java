package cn.itcast.list;

import java.util.ArrayList;
import java.util.List;

/*List接口中特有方法：

添加
	add(int index, E element) 
	addAll(int index, Collection<? extends E> c) 
获取：
	get(int index) 
	indexOf(Object o) 
	lastIndexOf(Object o) 
	subList(int fromIndex, int toIndex) 
修改：
	set(int index, E element) 


List接口中特有的方法具备的特点，操作的方法都存在索引值

只有List接口下面的集合类才具备索引值，其他接口下面的集合类都没索引值

迭代
	listIterator()*/ 
public class list_方法 {
	public static void main(String[] args) {
		List list=  new ArrayList();
		list.add("狗娃");
		list.add("狗剩");
		list.add("铁蛋");  //把元素添加到集合的末尾处。
		list.add("铁蛋"); 
		/*
		添加方法
		
		list.add(1,"赵本山"); //把元素添加到集合中指定的索引值位置
		
		List list2=  new ArrayList();
		list2.add("本山");
		list2.add("小沈阳");
		
		list.addAll(2,list2);  //把list2的元素添加到指定索引值的位置上
		*/
		/*
		获取的方法
		
		list.get(index);   //根据索引值获取集合中的元素
		System.out.println("get获取集合中的元素"+list.get(1));
		
		使用get方法遍历集合的元素：
		for (int i = 0; i < list.size() ; i++) {
			System.out.print(list.get(i)+",");
		}
		
		
		System.out.println("找出指定元素的索引值" + list.indexOf("狗剩"));
		
		List listSub= list.subList(1, 2);//指定开始与结束的索引值，截取元素;
		System.out.println(listSub);
		*/
		
		//list.set(index, element) //使用元素替换指定索引位置的元素
		
		System.out.println(list);
		
	}
	
}
