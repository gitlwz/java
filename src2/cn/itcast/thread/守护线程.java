package cn.itcast.thread;
/*
 	�ػ��̣߳���̨�̣߳�:���һ��������ֻʣ�����ػ��̣߳���ô�ػ��߳�Ҳ��������
 		//һ���߳�Ĭ�϶������ػ��߳�
 		
 */
public class �ػ��߳�  extends Thread{
	
	public �ػ��߳�(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("���°�������"+i+"%");
			if(i == 100){
				System.out.println("���°�������ϣ�׼����װ...");
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
		�ػ��߳� d = new �ػ��߳�("��̨�߳�");

		
		d.setDaemon(true); //setDaemon  �����߳��Ƿ�Ϊ�ػ��̡߳�
		System.out.println("���ػ��߳���" + d.isDaemon()); //�ж��߳��Ƿ�Ϊ�ػ��߳�
		d.start();
		
		for(int i = 1; i < 100;i++){
			System.out.println(Thread.currentThread().getName()+i);
		}

	}

}
