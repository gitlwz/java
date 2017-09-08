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
					System.out.println("������ˮ---��"+(p.capacity));
				}else if(p.capacity <= 0){
					System.out.println("ˮû��----------��"+(p.capacity));
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
					System.out.println("������ˮ---��"+(p.capacity));
				}else if(p.capacity >= 50){
					System.out.println("ˮ������---------��" + p.capacity);
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
public class ˮ�ط�ˮ {

	public static void main(String[] args) {
		Pool p = new Pool();
		Draw d = new Draw(p);
		Watering w = new Watering(p);
		d.start();
		w.start();

	}

}
