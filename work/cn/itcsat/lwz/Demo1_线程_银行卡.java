package cn.itcsat.lwz;

class Bank extends Thread{
	private static int money = 5000;
	String type;
	public Bank(String type) {
		this.type = type;
	}
	
 	@Override
 	public synchronized void run(){
 		while (true) {
// 			synchronized ("锁") {
 				if (this.getMoney() > 0) {
 					System.out.println(this.type+"取走了钱剩余" + (this.setMoney(this.getMoney() - 1000)));
 				} else {
 					System.out.println("钱取完了");
 					break;
 				}
// 			}
		}
 		
 		
 	}

	public static int getMoney() {
		return money;
	}

	public static int setMoney(int money) {
		Bank.money = money;
		return money;
	};
	
}

class Bankbook extends Bank{
	public Bankbook(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
}
class BankCard extends Bank{
	public BankCard(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
}
public class Demo1_线程_银行卡{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankCard bc = new BankCard("银行卡");
		Bankbook bk = new Bankbook("存着");
		
		bk.start();
		bc.start();
	}
}
