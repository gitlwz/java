package cn.itcast.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
网络编程：网络编程主要用于解决计算机与计算（手机、平板。。。）之间的数据传输问题

网络编程：不需要基于html页面就可以达到数据之间的传输。

网页编程：就是要基于html页面的基础上进行数据的交互的。


计算机网络：分布在不同地域的计算机通过外部设备连接起来达到了消息互通、资源共享的效果

网络通讯的三要素：
	1.Ip
	2.端口号
	3.协议
	
192.168.10.1
IP地址：	IP地址的本质就是一个由32位的二进制数据组成的数据。 后来别人为了方便我们记忆IP地址，就把IP地址切成了4份，每份8bit.   2^8 = 0~255
      00000000-00000000-00000000-00000000

IP地址 = 网络号 + 主机号。

IP地址的分类：
	A类地址 = 一个网络号 + 三个主机号     2^24   政府单位
	B类地址 =  两个网络号+ 两个主机号   2^16 事业单位（学校、银行..）
	C类地址= 三个网络号+ 一个主机号  2^8    私人使用..
	


IP类 ： InetAddress

常用的方法：
	getLocalHost();  获取本机的IP地址对象
			getHostAddress()  返回一个IP地址的字符串表示形式。
			
			getByName("IP或者主机名") 根据一个IP地址的字符串形式或者是一个主机名生成一个IP地址对象。 (用于获取别人的IP地址对象)
	
			getHostName()  返回计算机的主机名。



端口号是没有类描述的。
	端口号的范围： 0~65535
		从0到1023，系统紧密绑定于一些服务。 
		1024~65535  我们可以使用....
		
		
		
网络通讯的协议：
	
	udp通讯协议
	
	tcp通讯协议


*/
public class a1 {

	public static void main(String[] args) throws UnknownHostException {
		//getLocalHost 获取本机的IP地址对象
		/*InetAddress address = InetAddress.getLocalHost();
		 * 
		System.out.println("IP地址："+address.getHostAddress());
		System.out.println("主机名："+address.getHostName());*/
		
		
		//获取别人起的IP地址对象。
		
		//可以根据一个IP地址的字符串形式或者是一个主机名生成一个IP地址对象。
		InetAddress address = InetAddress.getByName("Jolly-pc140116");
		System.out.println("IP地址："+address.getHostAddress());
		System.out.println("主机名："+address.getHostName());
		
		
		InetAddress.getAllByName("www.baidu.com");  //还可以写域名
		
	}
	
}
