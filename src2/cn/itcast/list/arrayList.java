package cn.itcast.list;

import java.util.ArrayList;

/*
集合体系
---------| Collection 单列集合的跟接口
------------|List
----------------| ArrayList     ArrayList底层维护了一个Object数组实现的。查询速度快，增加删除慢。
								什么时候使用ArrayList：如果目前的数据是查询比较多，增删比较少的时候，那么就使用ArrayList存储这批数据。比如:高校的图书馆
							 
----------------| LinkedList    
----------------| Vector(了解即可)
------------|Set


ArrayList 特有方法
	ensureCapacity(int minCapacity) 
	trimToSize()     Object 默认长10  有3个元素         把7个给删掉


笔试题目：使用ArrayList午餐的构造函数创建一个对象时，默认的容量是多少？如果长度不够使用时又自增增长多少?
		ArrayList底层维护了一个Object数组实现的，使用无参构造函数时，Object数组默认的容量是10，当长度不够时，自动增长0.5倍;

*/
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();

	}

}
