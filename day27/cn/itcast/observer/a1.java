package cn.itcast.observer;

import java.util.ArrayList;
import java.util.Random;


class WeatherStation{
	String[] weathers = {"晴天","雾霾","刮风","冰雹","下雪"};
	
	//当前天气
	String  weather ;
	
	//人
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
					updateWeather(); // 每1~1.5秒更新一次天气  1000~1500
					
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
	
	
	//更新天气的 方法
	public void updateWeather(){
		Random random = new Random();
		int index = random.nextInt(weathers.length);
		weather = weathers[index];
		System.out.println("当前的天气是： " + weather);
	}
	
}

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
