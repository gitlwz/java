package cn.itcsat.lwz;

class Ticket implements Runnable{
	
	private static int num = 50;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			
			synchronized ("卖票") {
				if (getNum()>0) {
					System.out.println(Thread.currentThread().getName()+"票还剩余"+ (setNum(Ticket.getNum()-1)) + "张");
				} else {
					System.out.println("卖完了");
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

public class 方式实现卖票 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t1 = new Ticket();
		
		Thread th1 = new Thread(t1,"狗娃");
		Thread th2 = new Thread(t1,"李生");
		th1.start();
		th2.start();
	}

}
