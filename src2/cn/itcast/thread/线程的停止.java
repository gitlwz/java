package cn.itcast.thread;

/*
  	线程的停止：
  		1.停止一个线程，我们一般都会通过一个变量去控制的。
  		2.如果需要停止一个等待状态下的线程，我们需要通过变量配合notify方法或者interrupt来使用
  		
  
 */

public class 线程的停止  extends Thread{
	
	public  线程的停止( String name) {
		super(name);
		// TODO Auto-generated method stub

	}
	@Override
	public void run() {
		int i = 0;
		while (true) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		线程的停止 d = new 线程的停止("狗娃");
		d.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+ ":" + i);
			//当主线程的i是80的时候停止 狗娃线程
			if(i == 80){
				//d.interrupt(); //interrupt根本无法停止一个线程 
								 //把线程的等待状态强制清楚，被清楚状态的线程会接受到一个InterruptedException异常
//				d.stop();
			}
		}
	}
}
