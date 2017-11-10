package cn.itcast.observer;

public class Emp {
	String name;
	public Emp(String name){
		this.name = name;
	}
	
	//人是要根据天气做出相应的处理的
	public void notifyWeather(String weather){
		if("晴天".equals(weather)){
			System.out.println(name+"高高兴兴的去上班!!");
		}else if("雾霾".equals(weather)){
			System.out.println(name+"戴着消毒面具去上班!");
		}else if("刮风".equals(weather)){
			System.out.println(name+"拖着大石头过来上班!");
		}else if("冰雹".equals(weather)){
			System.out.println(name+"戴着头盔过来上班!");
		}else if("下雪".equals(weather)){
			System.out.println(name+"戴着被子过来上班!");
		}
	}
	
}
