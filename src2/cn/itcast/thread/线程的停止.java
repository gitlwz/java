package cn.itcast.thread;

/*
  	�̵߳�ֹͣ��
  		1.ֹͣһ���̣߳�����һ�㶼��ͨ��һ������ȥ���Ƶġ�
  		2.�����Ҫֹͣһ���ȴ�״̬�µ��̣߳�������Ҫͨ���������notify��������interrupt��ʹ��
  		
  
 */

public class �̵߳�ֹͣ  extends Thread{
	
	public  �̵߳�ֹͣ( String name) {
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
		�̵߳�ֹͣ d = new �̵߳�ֹͣ("����");
		d.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+ ":" + i);
			//�����̵߳�i��80��ʱ��ֹͣ �����߳�
			if(i == 80){
				//d.interrupt(); //interrupt�����޷�ֹͣһ���߳� 
								 //���̵߳ĵȴ�״̬ǿ������������״̬���̻߳���ܵ�һ��InterruptedException�쳣
//				d.stop();
			}
		}
	}
}
