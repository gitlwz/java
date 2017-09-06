package cn.itcsat.thead;

/*����
 	����1��Ϊʲô50��Ʊ������ȥ150��;
 	
 	����2���������̰߳�ȫ���⡣
 	�̰߳�ȫ����Ľ��������sun�ṩ���߳�ͬ�����������ǽ���������⡣
 	
 	java�߳�ͬ�����Ƶķ�ʽ��
 		��ʽһ��ͬ�������
 		
 			ͬ�������ĸ�ʽ��
 			
 				synchronized(){              
 					��Ҫ��ͬ���Ĵ���...
 				}
 			ͬ�������Ҫע������
 				1.�����һ�����󶼿�����Ϊ������
 				2.��ͬ��������е�����sleep�����������ͷ�������ġ�
 				3.ֻ�����������̰߳�ȫ�����ʱ���ʹ��ͬ������飬����ή��Ч�ʵġ�
 				4.���̲߳����������������Ψһ����ģ�������Ч��
 		��ʽ����ͬ������
 			ʹ�� synchronized ����һ��������
 			ͬ������Ҫע������
 				1.�����һ���Ǿ�̬��ͬ�������� �� ������ this����
 				       ����Ǿ�̬��ͬ���������������ǵ�ǰ��������������ֽ����ļ�(class����)
 				2.ͬ���������������ǹ̶��ģ�����ָ��       
 				
 		
 		�Ƽ�ʹ��ͬ�������
 			ԭ��
 				1.ͬ���������������������������ָ����������ơ�ͬ���������������ǹ̶����������ǿ���
 				2.ͬ���������Ժܷ��������Ҫ��ͬ������ķ�Χ��
 				      
 	��ʲô����²ſ��ܳ����̰߳�ȫ����
 		1.�������������������ϵ��̶߳���,�����߳�֮�乲����һ����Դ.
 		2.�ж���������˹�����Դ.
 */

class SaleTicket extends Thread{
	static int num = 50;  //�Ǿ�̬�ĳ�Ա�������ݣ�����ÿһ�������ж���ά��һ�����ݵ�
	
	static Object o = new Object();
	
	public SaleTicket(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}


	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		while (true) {
//			synchronized (o) {  //ͬ�������
				if (this.num > 0) {
					System.out.println(Thread.currentThread().getName() + "�۳��˵�"+this.num+"Ʊ��");
					this.num--;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					System.out.println("������--");
					break;
				}
//			}
			
			
		}
	}
	//��̬�ĺ���---->��������������ֽ����ļ�---->
	public static void getMoney() {
		
	}
	
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������̶߳���ģ����������
		SaleTicket thread1 = new SaleTicket("����1");
		SaleTicket thread2 = new SaleTicket("����2");
		SaleTicket thread3 = new SaleTicket("����3");
		
		//�����߳���Ʊ
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
