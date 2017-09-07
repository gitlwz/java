package cn.itcast.thread;

/*
 	join方法
 		join():加入 。一个线程如果执行了join语句，那么就有新的线程加入，执行该语句的线程必须要让步给新加入的线程先完成任务，然后才能继续执行。
 */


class Mon extends Thread{
	@Override
	public void run() {
		System.out.println("妈妈洗菜1");
		System.out.println("妈妈洗菜2");
		System.out.println("妈妈洗菜3");
		//叫儿子去打酱油
		Son s = new Son();
		s.start();
		
		try {
			s.join(); //
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("妈妈洗菜4");
		System.out.println("妈妈洗菜5");
	}
}

class Son extends Thread{
	@Override
	public void run() {
		System.out.println("儿子下楼1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("儿子一直往前走2");
		System.out.println("儿子一直往前走3");
		System.out.println("儿子一直往前走4");
		
	}
}

public class Join {

	public static void main(String[] args) {
		Mon m = new Mon();
		m.start();
		
		

	}

}
