package cn.itcast.observer;

public class Emp {
	String name;
	public Emp(String name){
		this.name = name;
	}
	
	//����Ҫ��������������Ӧ�Ĵ����
	public void notifyWeather(String weather){
		if("����".equals(weather)){
			System.out.println(name+"�߸����˵�ȥ�ϰ�!!");
		}else if("����".equals(weather)){
			System.out.println(name+"�����������ȥ�ϰ�!");
		}else if("�η�".equals(weather)){
			System.out.println(name+"���Ŵ�ʯͷ�����ϰ�!");
		}else if("����".equals(weather)){
			System.out.println(name+"����ͷ�������ϰ�!");
		}else if("��ѩ".equals(weather)){
			System.out.println(name+"���ű��ӹ����ϰ�!");
		}
	}
	
}
