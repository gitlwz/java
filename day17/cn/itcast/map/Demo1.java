package cn.itcast.map;

import java.util.HashMap;
import java.util.Map;

/*

在显示生活中有些数据是以映射关系存在的，也就是成对存在的，比如:
	
双列结合：
-----------| Map 如果是实现了Map接口的集合类，具备的特点： 存储的数据都是以键值对的形式存在的，键不可重复，值可以重复。
-----------------| HashMap	
-----------------| TreeMap
-----------------| Hashtable

Map接口的方法

	添加
		put(K key, V value)
		putAll(Map<? extends K,? extends V> m)  

	获取
		get(Object key)  //返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
		size()           //返回此映射中的键-值映射关系数。

	判断
		containsKey(Object key)  //是否包含有指定的键
		containsValue(Object value) //是否包含指定的值
		isEmpty()                   //是否为空
	删除
		remove(Object key) //根据键删除一条map中的数据，返回的是该键对应 的值。
		clear()            //清空集合中的所有数据
	迭代
		keySet() 
		entrySet()
		values() 
		 



 */


public class Demo1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		//添加
		map.put("汪峰", "章子怡");
		map.put("文章", "马伊琍");
		map.put("谢霆锋", "张柏芝");
		/*
		System.out.println("返回值:" + map.put("谢霆锋", "王菲"));
		
		System.out.println("返回值:" + map.remove("谢霆锋"));
		*/
		System.out.println(map);
		
		System.out.println(map);
	}

}
