package cn.itcast.thread;
/*
 * java��ͬ�����ƽ�����̰߳�ȫ���⣬����Ҳͬ����������������
 		��������
 			1.�������������������ϵ��̣߳�
 			2.�������������������ϵĹ�����Դ��
 			
 			
 		��������Ľ��������û�н��������ֻ�ܾ������ⷢ������
 	
 	
 	
 	
 */

class DeadLock extends Thread{
	public DeadLock(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		if("����".equals(Thread.currentThread().getName())){
			
			synchronized ("ң����") { //�ر�
				System.out.println("�����õ���ң������׼��ȥ�õ��");
				synchronized ("���") {
					System.out.println("�����õ��˵��~~~");
				}
			}
			
		}else if("����".equals(Thread.currentThread().getName())){
			synchronized ("���") { //�ر�
				System.out.println("�����õ���ң������׼��ȥ�õ��");
				synchronized ("ң����") {
					System.out.println("�����õ��˵��~~~");
				}
			}
		}
	}
}
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeadLock thread1 = new DeadLock("����");
		DeadLock thread2 = new DeadLock("����");
		
		thread1.start();
		thread2.start();
		

	}

}
 