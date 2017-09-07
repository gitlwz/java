package cn.itcast.thread;
/*
 	线程通讯：一个线程完成了自己的任务时，要通知另外一个线程去完成另外一个任务
 		经典例子：
 		生产者与消费者
 		
 	
 	wait();   等待 ->如果线程执行了wait方法，那么线程就会进入等待的状态，等待状态下的线程必须要被其他线程调用notify方法唤醒
 	notify(); 唤醒 ->唤醒等待的线程。
 	notifyAll(); 唤醒线程池所有等待的线程
 	
 	wait与notify方法要注意的事项：
 		1.wait方法与notify方法是属于Object对象的。
 		2.wait方法与notify方法必须要载同步代码块或者同步函数中才能使用。
 		3wait方法与notify方法必须要由锁对象使用。
 */

//产品类
class Product {
	String name;//名字
	double price;//价格
	boolean flag = false; //产品是否生产完毕的标识，默认情况是没有生产
	
}

//生产者
class Producer extends Thread{
	
	Product p;//产品
	
	public Producer(Product p) {
		this.p = p;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(true){
			synchronized (p) {
				if(p.flag == false){
					if(i%2 == 0){
						p.name = "苹果";
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						p.price = 6.5;
					}else {
						p.name = "香蕉";
						p.price = 2.0;
					}
					System.out.println("生产者生产出了："+ p.name + "价格是：" + p.price);
					i++;
					p.flag = true;
					p.notify(); //唤醒消费者
				}else {
					//已经生产完毕，等待消费者先去消费
					
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}

//消费者
class Customer extends Thread{
	Product p;
	
	public Customer(Product p) {
		this.p = p;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		while (true) {
			synchronized (p) {
				if(p.flag == true){  //产品已经生产完毕
					System.out.println("消费者消费了"+p.name + " 价格："+p.price);
					p.flag = false;
					p.notify();//唤醒生产者
				}else{
					//产品还没有生产，应该等待生产者先生产
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}

public class 线程的通讯 {

	public static void main(String[] args) {
		Product p = new Product(); //产品
		
		//创建生产对象
		Producer producer = new Producer(p);
		
		//创建消费者
		Customer customer = new Customer(p);
		
		//调用Start方法开启线程
		producer.start();
		customer.start();

	}
}
