package cn.itcast.thread;
/*
 	守护线程（后台线程）:如果一个进程中只剩下了守护线程，那么守护线程也会死亡。
 		//一个线程默认都不是守护线程
 		
 */
public class 守护线程  extends Thread{
	
	public 守护线程(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("更新包下载了"+i+"%");
			if(i == 100){
				System.out.println("更新包下载完毕，准备安装...");
			}
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	public static void main(String[] args) {
		守护线程 d = new 守护线程("后台线程");

		
		d.setDaemon(true); //setDaemon  设置线程是否为守护线程。
		System.out.println("是守护线程吗" + d.isDaemon()); //判断线程是否为守护线程
		d.start();
		
		for(int i = 1; i < 100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}

	}

}
