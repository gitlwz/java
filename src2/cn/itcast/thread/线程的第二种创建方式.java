package cn.itcast.thread;

/*
 �Զ����̵߳Ĵ�����ʽ:

	��ʽһ �� 
		1. �Զ���һ����̳�Thread�ࡣ
		2. ��дThread���run���������Զ����̵߳��������д��run�����ϡ�
		3. ����Thread��������󣬲��ҵ���start��������һ���̡߳� 
			
		ע�⣺ǧ��Ҫֱ�ӵ���run����������start������ʱ���߳̾ͻῪ�����߳�һ�������ͻ�ִ��run�����д��룬���ֱ�ӵ���
		run��������ô�� �൱�ڵ�����һ����ͨ�ķ������ѡ�
	��ʽ����
		1.�Զ���һ���� ʵ��Runnable�ӿ�
		2.ʵ��Runnable�ӿڵ�run���������Զ����̵߳���������run�����ϡ�
		3.����Runnableʵ�������
		4.����Thread�࣬���Ұ�Runnableʵ����Ķ�����Ϊʵ�δ���
		5.����Thread�����start��������һ���߳�
		
	����1������Runnableʵ����Ķ������̶߳�����
		Runnableʵ������󲢲���һ���̶߳���ֻ������ʵ����Runnable�ӿڵĶ�����ѡ�
		ֻ����Thread����Thread����������̶߳���
	
	����2��ΪʲôҪ��Runnableʵ����Ķ�����Ϊʵ�δ��ݸ�Thread�����أ�������ʲô��
		���þ��ǰ�Runnableʵ����Ķ����run������Ϊ���̵߳��������ȥִ���ˡ�
		
	�Ƽ�ʹ�ã��ڶ��֡�ʵ��Runable�ӿڡ�
	
 */

public class �̵߳ĵڶ��ִ�����ʽ  implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����Runnableʵ�������
		�̵߳ĵڶ��ִ�����ʽ  d = new �̵߳ĵڶ��ִ�����ʽ();
//		����Thread�࣬���Ұ�Runnableʵ����Ķ�����Ϊʵ�δ���
		Thread thread = new Thread(d,"����"); //Thread��ʹ��
		
//		����Thread�����start��������һ���߳�
		thread.start();
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

	

}
