package cn.itcast.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
判断
	isEmpty()
	contains(Object o)        //内部是依赖于equals方法进行比较    （走的是实参的equals方法）
	containsAll(Collection c)   //判断A集合是否包含 B集合中的所有元素  



 */

class Person{
	int id;
	
	String name;
	
	public Person(int id ,String name) {
		this.id = id;
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{编号："+this.id+" 姓名："+ this.name+"}";
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.id == p.id;
	}
	
	//java的规范，一般我们重写equals方法我们都会重写hashCode 方法
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
}



public class 集合_判断方法 {

	public static void main(String[] args) {
		/*
		Collection c = new ArrayList();
		c.add("令计划");
		c.add("徐才厚");
		c.add("周永康");
		
		
		
		System.out.println("isEmpty方法使用->" + c.isEmpty());
		
		System.out.println("contains方法使用->" + c.contains("徐才厚"));
		 */
		Collection c = new ArrayList();
		c.add(new Person(110, "狗娃"));
		c.add(new Person(111, "铁蛋"));
		c.add(new Person(112, "张三"));
		
		Collection c2 = new ArrayList();
		c2.add(new Person(110, "狗娃"));
		c2.add(new Person(111, "铁蛋"));
		
		System.out.println("存在该元素吗？" + c.contains(new Person(111, "铁蛋")));
		System.out.println(c);
		
		System.out.println("containsAll存在该元素吗？" + c.containsAll(c2));
	}

}
