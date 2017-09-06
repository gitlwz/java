package cn.itcsat.thead;

public class Demo1 extends Thread{
	
	
	
	@Override   //把自定义线程的任务代码写在run中
	public void run() {
		for(int i = 0; i < 100; i++){
			System.out.println("自定义线程"+i);
		}
	}

	public static void main(String[] args) {
		
		Demo1 demo1 = new Demo1();
		demo1.start();
		
		for(int i = 0; i < 100; i++){
			System.out.println("mian线程"+i);
		}

	}

}
