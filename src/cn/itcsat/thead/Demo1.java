package cn.itcsat.thead;

public class Demo1 extends Thread{
	
	
	
	@Override   //���Զ����̵߳��������д��run��
	public void run() {
		for(int i = 0; i < 100; i++){
			System.out.println("�Զ����߳�"+i);
		}
	}

	public static void main(String[] args) {
		
		Demo1 demo1 = new Demo1();
		demo1.start();
		
		for(int i = 0; i < 100; i++){
			System.out.println("mian�߳�"+i);
		}

	}

}
