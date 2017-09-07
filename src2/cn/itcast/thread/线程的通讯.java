package cn.itcast.thread;
/*
 	�߳�ͨѶ��һ���߳�������Լ�������ʱ��Ҫ֪ͨ����һ���߳�ȥ�������һ������
 		�������ӣ�
 		��������������
 		
 	
 	wait();   �ȴ� ->����߳�ִ����wait��������ô�߳̾ͻ����ȴ���״̬���ȴ�״̬�µ��̱߳���Ҫ�������̵߳���notify��������
 	notify(); ���� ->���ѵȴ����̡߳�
 	notifyAll(); �����̳߳����еȴ����߳�
 	
 	wait��notify����Ҫע������
 		1.wait������notify����������Object����ġ�
 		2.wait������notify��������Ҫ��ͬ����������ͬ�������в���ʹ�á�
 		3wait������notify��������Ҫ��������ʹ�á�
 */

//��Ʒ��
class Product {
	String name;//����
	double price;//�۸�
	boolean flag = false; //��Ʒ�Ƿ�������ϵı�ʶ��Ĭ�������û������
	
}

//������
class Producer extends Thread{
	
	Product p;//��Ʒ
	
	public Producer(Product p) {
		this.p = p;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(true){
			synchronized (p) {
				if(p.flag == false){
					if(i%2 == 0){
						p.name = "ƻ��";
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						p.price = 6.5;
					}else {
						p.name = "�㽶";
						p.price = 2.0;
					}
					System.out.println("�������������ˣ�"+ p.name + "�۸��ǣ�" + p.price);
					i++;
					p.flag = true;
					p.notify(); //����������
				}else {
					//�Ѿ�������ϣ��ȴ���������ȥ����
					
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}

//������
class Customer extends Thread{
	Product p;
	
	public Customer(Product p) {
		this.p = p;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		while (true) {
			synchronized (p) {
				if(p.flag == true){  //��Ʒ�Ѿ��������
					System.out.println("������������"+p.name + " �۸�"+p.price);
					p.flag = false;
					p.notify();//����������
				}else{
					//��Ʒ��û��������Ӧ�õȴ�������������
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}

public class �̵߳�ͨѶ {

	public static void main(String[] args) {
		Product p = new Product(); //��Ʒ
		
		//������������
		Producer producer = new Producer(p);
		
		//����������
		Customer customer = new Customer(p);
		
		//����Start���������߳�
		producer.start();
		customer.start();

	}
}
