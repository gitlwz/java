package cn.itcast.observer;

import java.util.Random;

public class WeatherMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		//����
		Emp e = new Emp("С��");
		Emp e2 = new Emp("С��");
		WeatherStation station = new WeatherStation();
		station.addListener(e2);
		station.addListener(e);
		station.startWork();
	}
}
