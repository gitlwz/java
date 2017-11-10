package cn.itcast.observer;

import java.util.Random;

public class WeatherMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		//工人
		Emp e = new Emp("小明");
		Emp e2 = new Emp("小红");
		WeatherStation station = new WeatherStation();
		station.addListener(e2);
		station.addListener(e);
		station.startWork();
	}
}
