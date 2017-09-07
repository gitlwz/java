package cn.itcast.thread;

/*
 自定义线程的创建方式:

	方式一 ： 
		1. 自定义一个类继承Thread类。
		2. 重写Thread类的run方法，把自定义线程的任务代码写在run方法上。
		3. 创建Thread的子类对象，并且调用start方法启动一个线程。 
			
		注意：千万不要直接调用run方法，调用start方法的时候线程就会开启，线程一旦开启就会执行run方法中代码，如果直接调用
		run方法，那么就 相当于调用了一个普通的方法而已。
	方式二：
		1.自定义一个类 实现Runnable接口
		2.实现Runnable接口的run方法，吧自定义线程的任务定义在run方法上。
		3.创建Runnable实现类对象。
		4.创建Thread类，并且把Runnable实现类的对象作为实参传递
		5.调用Thread对象的start方法开启一个线程
		
	问题1：请问Runnable实现类的对象是线程对象吗？
		Runnable实现类对象并不是一个线程对象，只不过是实现了Runnable接口的对象而已。
		只有是Thread或者Thread的子类才是线程对象。
	
	问题2：为什么要把Runnable实现类的对象作为实参传递给Thread对象呢？作用是什么？
		作用就是吧Runnable实现类的对象的run方法作为了线程的任务代码去执行了。
		
	推荐使用：第二种。实现Runable接口。
	
 */

public class 线程的第二种创建方式  implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		创建Runnable实现类对象
		线程的第二种创建方式  d = new 线程的第二种创建方式();
//		创建Thread类，并且把Runnable实现类的对象作为实参传递
		Thread thread = new Thread(d,"狗娃"); //Thread类使用
		
//		调用Thread对象的start方法开启一个线程
		thread.start();
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

	

}
