package cn.itcast.observer;

import java.util.ArrayList;
import java.util.Random;


class WeatherStation{
	String[] weathers = {"����","����","�η�","����","��ѩ"};
	
	//��ǰ����
	String  weather ;
	
	//��
	ArrayList<Emp> list = new ArrayList<Emp>();
	
	public void addListener(Emp e){
		list.add(e);
	}
	
	public void startWork() throws InterruptedException{
		final Random random = new Random();
		
		new Thread(){	
			@Override
			public void run() {
				while(true){ 
					updateWeather(); // ÿ1~1.5�����һ������  1000~1500
					
					for(Emp emp : list){
						emp.notifyWeather(weather);
					}
					
					int  s = random.nextInt(501)+1000; //  500
					try {
						Thread.sleep(s);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
			}
			
		}.start();
		
	}
	
	
	//���������� ����
	public void updateWeather(){
		Random random = new Random();
		int index = random.nextInt(weathers.length);
		weather = weathers[index];
		System.out.println("��ǰ�������ǣ� " + weather);
	}
	
}

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
