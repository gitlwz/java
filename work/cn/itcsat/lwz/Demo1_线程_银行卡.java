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
// 			synchronized ("��") {
 				if (this.getMoney() > 0) {
 					System.out.println(this.type+"ȡ����Ǯʣ��" + (this.setMoney(this.getMoney() - 1000)));
 				} else {
 					System.out.println("Ǯȡ����");
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
public class Demo1_�߳�_���п�{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankCard bc = new BankCard("���п�");
		Bankbook bk = new Bankbook("����");
		
		bk.start();
		bc.start();
	}
}
