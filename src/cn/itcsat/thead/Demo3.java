package cn.itcsat.thead;
/*
 	 Thread(String name)     初始化线程的名字
	 getName()             返回线程的名字
	 setName(String name)    设置线程对象名
	 
	 sleep()                 线程睡眠指定的毫秒数。  静态的方法 ，哪个线程执行了sleep方法，那么哪个线程就会睡眠；
	 
	 currentThread()      返回CPU正在执行的当前线程的对象       静态方法;   哪个线程执行了currentThread ,就返回哪个线程的对象;
	 
	 getPriority()             		返回当前线程对象的优先级   默认线程的优先级是5
	 setPriority(int newPriority)   设置线程的优先级    虽然设置了线程的优先级，但是具体的实现取决于底层的操作系统的实现（最大的优先级是10 ，最小的1 ， 默认是5）。
	 

 */
public class Demo3 extends Thread{
	
	public Demo3(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run(){
		// TODO Auto-generated method stub
		System.out.println("this:"+this);
		System.out.println("当前对象:"+Thread.currentThread());
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName() + ":" + i);
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/		
			}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Demo3 d = new Demo3("狗娃");
		d.setPriority(10);  //优先级的数字越大，优先级越高 , 优先级的范围是 1~10;
		d.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" +i);
		}
		
		/*System.out.println("自定义线程的优先级:"+ d.getPriority()); //线程的优先级默认就是5
		System.out.println("主线程的优先级"+ Thread.currentThread().getPriority());
		
		d.setName("铁蛋");
		d.start();
		
		Thread mainThread = Thread.currentThread();
		
		System.out.println(d.getName());
		System.out.println(mainThread.getName());*/
	}

}
