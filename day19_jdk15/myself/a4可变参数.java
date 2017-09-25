package myself;

/*
jdk1.5 ---------->可变参数

需求：定义一个函数做加法功能(函数做几个数据的加法功能是不确定的)。

可变参数的格式：
	
	数据类型...  变量名
	
可变参数要注意的细节

	1.如果一个函数的形参使用了可变参数之后，那么调用该方法的时候就可以传递参数也可以不传递参数
	2.可变参数实际上是一个数组对象。
	3.可变参数必须位于形参中的最后一个参数。
	4.一个函数最多只能有一个可变参数，因为可变参数要位于形参中最后一个位置上。
	
	
	


 */


public class a4可变参数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(3,5,2,4,543,634);
	}
	
	public static void add(int...b) {
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
		}
		System.out.println(sum);
	}
}
