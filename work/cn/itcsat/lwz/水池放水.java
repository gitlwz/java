package cn.itcsat.lwz;

class Pool {
	int capacity = 50;
}

class Draw extends Thread{
	Pool p;
	public Draw(Pool p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		while (true) {
			synchronized (p) {
				if(p.capacity > 0){
					p.capacity -= 2;
					System.out.println("正在排水---》"+(p.capacity));
				}else if(p.capacity <= 0){
					System.out.println("水没了----------》"+(p.capacity));
					p.notify();
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
class Watering extends Thread{
	Pool p;
	public Watering(Pool p) {
		this.p = p;
	}
	@Override
	public void run() {
		while (true) {
			synchronized (p) {
				if(p.capacity < 50){
					p.capacity += 5;
					System.out.println("正在添水---》"+(p.capacity));
				}else if(p.capacity >= 50){
					System.out.println("水填满了---------》" + p.capacity);
					p.notify();
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
public class 水池放水 {

	public static void main(String[] args) {
		Pool p = new Pool();
		Draw d = new Draw(p);
		Watering w = new Watering(p);
		d.start();
		w.start();

	}

}
