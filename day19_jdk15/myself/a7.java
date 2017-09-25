package myself;
/*
枚举：一些方法在运行
 
枚举类的定义格式：

 	enum 类名{
 		枚举值
 	}

枚举要注意的细节
	1.枚举类也是一个特殊的类。
	2.枚举值默认的修饰符是public static final
	3.枚举值的数据类型是枚举值所属类的数据类型
	4.枚举类的构造方法默认的修饰符是private的
	5.枚举类可以定义自己的成员变量与成员函数。
	6. 枚举类可以自定义构造函数，但是构造函数的修饰符必须是private。
	7. 枚举类可以存在抽象 的方法，但是枚举值必须要实现抽象 的方法。
	8. 枚举值必须要位置枚举类 的第一个语句。
 
 */

//自定义一个枚举类
enum Sex{
	man("男"),woman("女");     //枚举值
	
	String value;	//成员变量
	
	//构造函数
	private Sex(String value){
		this.value = value;
	}
	
	//成员函数
	public void getValue(){
		System.out.println(value);
	}
}


public class a7 {

	public static void main(String[] args) {
		Sex sex = Sex.man;
		sex.getValue();

	}

}
