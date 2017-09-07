package cn.itcast.thread;

/*
 	join����
 		join():���� ��һ���߳����ִ����join��䣬��ô�����µ��̼߳��룬ִ�и������̱߳���Ҫ�ò����¼�����߳����������Ȼ����ܼ���ִ�С�
 */


class Mon extends Thread{
	@Override
	public void run() {
		System.out.println("����ϴ��1");
		System.out.println("����ϴ��2");
		System.out.println("����ϴ��3");
		//�ж���ȥ����
		Son s = new Son();
		s.start();
		
		try {
			s.join(); //
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("����ϴ��4");
		System.out.println("����ϴ��5");
	}
}

class Son extends Thread{
	@Override
	public void run() {
		System.out.println("������¥1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("����һֱ��ǰ��2");
		System.out.println("����һֱ��ǰ��3");
		System.out.println("����һֱ��ǰ��4");
		
	}
}

public class Join {

	public static void main(String[] args) {
		Mon m = new Mon();
		m.start();
		
		

	}

}
