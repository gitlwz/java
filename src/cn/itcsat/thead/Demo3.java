package cn.itcsat.thead;
/*
 	 Thread(String name)     ��ʼ���̵߳�����
	 getName()             �����̵߳�����
	 setName(String name)    �����̶߳�����
	 
	 sleep()                 �߳�˯��ָ���ĺ�������  ��̬�ķ��� ���ĸ��߳�ִ����sleep��������ô�ĸ��߳̾ͻ�˯�ߣ�
	 
	 currentThread()      ����CPU����ִ�еĵ�ǰ�̵߳Ķ���       ��̬����;   �ĸ��߳�ִ����currentThread ,�ͷ����ĸ��̵߳Ķ���;
	 
	 getPriority()             		���ص�ǰ�̶߳�������ȼ�   Ĭ���̵߳����ȼ���5
	 setPriority(int newPriority)   �����̵߳����ȼ�    ��Ȼ�������̵߳����ȼ������Ǿ����ʵ��ȡ���ڵײ�Ĳ���ϵͳ��ʵ�֣��������ȼ���10 ����С��1 �� Ĭ����5����
	 

 */
public class Demo3 extends Thread{
	
	public Demo3(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run(){
		// TODO Auto-generated method stub
		System.out.println("this:"+this);
		System.out.println("��ǰ����:"+Thread.currentThread());
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName() + ":" + i);
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/		
			}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Demo3 d = new Demo3("����");
		d.setPriority(10);  //���ȼ�������Խ�����ȼ�Խ�� , ���ȼ��ķ�Χ�� 1~10;
		d.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" +i);
		}
		
		/*System.out.println("�Զ����̵߳����ȼ�:"+ d.getPriority()); //�̵߳����ȼ�Ĭ�Ͼ���5
		System.out.println("���̵߳����ȼ�"+ Thread.currentThread().getPriority());
		
		d.setName("����");
		d.start();
		
		Thread mainThread = Thread.currentThread();
		
		System.out.println(d.getName());
		System.out.println(mainThread.getName());*/
	}

}
