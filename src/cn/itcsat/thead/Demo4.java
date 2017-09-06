package cn.itcsat.thead;

/*需求
 	问题1：为什么50张票被卖出去150次;
 	
 	问题2：出现了线程安全问题。
 	线程安全问题的解决方案：sun提供了线程同步机制让我们解决这类问题。
 	
 	java线程同步机制的方式：
 		方式一：同步代码块
 		
 			同步代码块的格式：
 			
 				synchronized(){              
 					需要被同步的代码...
 				}
 			同步代码块要注意事项
 				1.任意的一个对象都可以作为锁对象。
 				2.在同步代码块中调用了sleep方法并不会释放锁对象的。
 				3.只有真正存在线程安全问题的时候才使用同步代码块，否则会降低效率的。
 				4.多线程操作的锁对象必须是唯一共享的，否则无效。
 		方式二：同步函数
 			使用 synchronized 修饰一个函数。
 			同步函数要注意的事项：
 				1.如果是一个非静态的同步函数的 锁 对象是 this对象，
 				       如果是静态的同步函数的锁对象是当前函数所属的类的字节码文件(class对象)
 				2.同步函数的锁对象是固定的，不能指定       
 				
 		
 		推荐使用同步代码块
 			原因：
 				1.同步代码块的锁对象可以由我们随意指定，方便控制。同步函数的锁对象是固定不能由我们控制
 				2.同步代码块可以很方便控制需要被同步代码的范围。
 				      
 	在什么情况下才可能出现线程安全问题
 		1.存在两个或者连个以上的线程对象,而且线程之间共享着一个资源.
 		2.有多个语句操作了共享资源.
 */

class SaleTicket extends Thread{
	static int num = 50;  //非静态的成员变量数据，是在每一个对象中都会维护一份数据的
	
	static Object o = new Object();
	
	public SaleTicket(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}


	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		while (true) {
//			synchronized (o) {  //同步代码块
				if (this.num > 0) {
					System.out.println(Thread.currentThread().getName() + "售出了第"+this.num+"票号");
					this.num--;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					System.out.println("售完了--");
					break;
				}
//			}
			
			
		}
	}
	//静态的函数---->函数所属的类的字节码文件---->
	public static void getMoney() {
		
	}
	
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建三个线程对象，模拟三个窗口
		SaleTicket thread1 = new SaleTicket("窗口1");
		SaleTicket thread2 = new SaleTicket("窗口2");
		SaleTicket thread3 = new SaleTicket("窗口3");
		
		//开启线程收票
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
