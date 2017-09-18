package cn.itcast.HashMap;

import java.util.HashMap;



/*
双列结合：
-----------| Map 如果是实现了Map接口的集合类，具备的特点： 存储的数据都是以键值对的形式存在的，键不可重复，值可以重复。
-----------------| HashMap	

HashMap的存储原理：
	往HashMap添加元素的时候，首先会调用键的hashCode方法得到元素的哈希码值，然后经过运算就可以算出该元素在哈希表中的孙处位置
	
	情况1： 如果算出的位置目前没有任何元素存储，那么该元素可以直接添加到哈希表中。
	
	情况2：如果算出 的位置目前已经存在其他的元素，那么还会调用该元素的equals方法与这个位置上的元素进行比较
	，如果equals方法返回 的是false，那么该元素允许被存储，如果equals方法返回的是true，那么该元素被视为
	重复元素，不允存储。

-----------------| TreeMap
-----------------| Hashtable 
 */
class Person{
	int id;
	String name;
	public Person(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[编号" + this.id + "姓名" + this.name+"]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		Person person =(Person) obj;
		return person.id == this.id;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		HashMap<Person, String> map = new HashMap<Person, String>();
		map.put(new Person(110,"狗娃"), "001");
		map.put(new Person(220,"狗剩"), "002");
		map.put(new Person(330,"铁蛋"), "003");
		map.put(new Person(110,"狗娃"), "007");  //如果出现了相同键，那么后添加的数据的值会取代之前 的值。
		System.out.println("集合的元素："+ map);
	}

}
