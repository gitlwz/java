package cn.itcsat.lwz;

class Ticket implements Runnable{
	
	private static int num = 50;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			
			synchronized ("��Ʊ") {
				if (getNum()>0) {
					System.out.println(Thread.currentThread().getName()+"Ʊ��ʣ��"+ (setNum(Ticket.getNum()-1)) + "��");
				} else {
					System.out.println("������");
					break;
				}
			}
		}
		
	}

	public static int getNum() {
		return num;
	}

	public static int setNum(int num) {
		Ticket.num = num;
		return num;
	}
}

public class ��ʽʵ����Ʊ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t1 = new Ticket();
		
		Thread th1 = new Thread(t1,"����");
		Thread th2 = new Thread(t1,"����");
		th1.start();
		th2.start();
	}

}
