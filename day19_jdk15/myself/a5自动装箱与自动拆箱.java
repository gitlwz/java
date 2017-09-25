package myself;

import java.util.ArrayList;

/*
jdk1.5 -------->自动装箱与自动拆箱。

java是面向对象的语言，任何事物都可以使用类进行描述，sun就使用了一些类
描述java中八种基本数据类型数据
	
	
	基本数据类型		包装类型
	bate		Byte
	short		Short
	int			Integer
	long		Long
	
	float		Float
	double		Double
	
	boolean		Boolean
	
	char		Character

基本数据类型数据有了对应的包装类型的好处：
	


*/
public class a5自动装箱与自动拆箱 {

	public static void main(String[] args) {
		String str = "12";
		
		//把字符串转成int类型数据。
		
		//把字符串转成数字
		int i = Integer.parseInt(str);
		
		System.out.println(i);
		
		//把数字转成字符串
		System.out.println(Integer.toString(i));
		
		//把整数转换成对应的进制形式
		System.out.println("10的二进制:" + Integer.toBinaryString(10));
		System.out.println("10的八进制:" + Integer.toOctalString(10));
		System.out.println("10的十六进制:" + Integer.toHexString(10));
		
		//可以把字符串当成对应的进制数据帮你转换
		String data = "10";
		int a = Integer.parseInt(data,2);
		System.out.println("a=" + a);
		
		//集合：集合是可以存储任意对象类型数据的容器。
		/*ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);*/
		
		//自动装箱：自定把java的基本数据类型数据转换成对象数据类型数据。
		int int1 = 10;             //基本数据类型数据
		Integer int2 = int1;		//引
		
		//自动拆箱：把引用类型的数据转换成基本类型的数据
		Integer int3 = new Integer(13);
		int int4 = int3;
		
		//-----------------------------------------//
		//引用数据类型
		Integer int5 = 127;
		Integer int6 = 127;
		System.out.println("同一个对象吗？" + (int5 == int6));
		
	}

}
