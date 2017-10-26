package cn.itcast.复习;
/*
线程：

多线程的存在的意义：解决了一个进程允许多个任务可以同时执行。

多线程的创建方式
	
	方式一：  继承Thread
		1.自定义一个类继承Thread
		2.重写Thread的run方法，把自定义线程的任务代码放在run方法上。
		3.创建Thread类的子类对象，并且调用start方法开启线程。
	
	方式二：实现Runnable接口
		1. 自定义一个类实现Runnable接口.
		2. 实现Runnable的run方法。把自定义线程的任务代码放在run方法上。
		3. 创建Runnable实现类的对象。
		4. 创建Thread的对象，然后把Runnable实现类的对象作为参数传递。
		5. 调用Thread对象的start方法开启线程。



*/
public class a2线程 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
