package cn.itcast.single;
/*
单例设计模式：

	懒汉单例设计模式(线程安全问题 的解决方案):
		步骤：
			1. 私有化构造函数。
			2. 声明本类引用类型变量，但是不要创建对象。
			3. 声明一个公共静态的方法获取本类的对象，获取之前先判断是否已经创建了本类的对象了，如果已经创建了
			就不要在创建直接返回即可，如果还没有创建，那么就先创建本类的引用类型变量，然后再返回。

*/

//懒汉单例设计模式
class Single{
	
//	声明本类引用类型变量，但是不要创建对象。
	private static Single s;
	
	//私有化构造函数
	private Single(){}
	
//	声明一个公共静态的方法获取本类的对象
	public static Single getInstance(){
		if(s==null){
			synchronized ("锁") {			
				if(s==null){
					s = new Single();
				}
			}
		}
		return s;
	}
	
}








public class Demo1 {

}
