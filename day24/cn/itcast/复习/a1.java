package cn.itcast.复习;
/*
三元运算符

布尔表达式?:值1:值2


匿名对象：没有引用类型变量指向的对象就称作为匿名对象

匿名内部类： 没有类名的类就称作匿名内部类

匿名内部类使用前提：必须存在继承或者实现关系。

因为匿名内部类没有类名，所以创建匿名内部类对象的时候就必须要借用与它父类的名字或者它父接口的名字来创建
匿名内部类只是没有类名，其他的一概成员都是具备的。

匿名内部类的应用场景：主要是作为参数传递使用。
*/

interface Dao{
	public void add();
}

class Other{
	public void print(){
		new Dao(){
			//大括号中就写匿名内部类的成员。
			
			@Override
			public void add() {
				System.out.println("添加学生。。。");
			}
		}.add();
	}
}

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
