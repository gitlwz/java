package cn.itcsat.object;




/*
java是面向对象的语言，核心思想：找合适的对象做合适的事情

	方式一：定义类，然后通过自定义的累创建对象。
	
	方式二：sun提供了很多的累给我们使用，我们只需要认识这些类，我们就可以通过这些类创建对象了。
	
	
	equals( Object obj );  用于比较连个对象的内存地址，判断两个对象是否为同一个对象
	
	hashCode()   返回该对象的哈希码值(大家可以把哈希码就 理解成是对象的内存地址)
	java规范  如果我们重写了 equals 方法 还会重写他的hashCode方法

*/
class Person{
	
	int id;
	
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Person() {
	}
	
	//目前我需要直接输出一个对象的时候，输出 的格式是： 编号：110 姓名： 狗娃  这种格式。 目前Object的
//	toString方法无法满足子类的需求，那么这时候我们就应该对Object类的toString进行重写。
	@Override
	public String toString() {
		return "编号："+ this.id + " 姓名："+this.name;
	}
	@Override
	public boolean equals(Object obj){
		Person p = (Person) obj;
		return this.id == p.id;
	}
	@Override
	public int hashCode(){
		return this.id;
	}
		
}
public class Demo1 {
	public static void main(String[] args) {
		Person p1 = new Person(110,"学生1");
		Person p2 = new Person(110,"建国");
		System.out.println(p1);
		
		//在现实生活中只要两个人的身份证相同就是同一个人。
		System.out.println("p1与p2是同一个对象吗？" + p1.equals(p2));
		System.out.println("p1:"+ p1.hashCode());
		System.out.println("p2:" + p2.hashCode());
	}
}
