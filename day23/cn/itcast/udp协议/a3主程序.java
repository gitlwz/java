package cn.itcast.udp协议;

public class a3主程序 {

	public static void main(String[] args) {
		a3群聊接收端 chatReceive = new a3群聊接收端();
		chatReceive.start();
		
		a3多线程群聊  chat = new a3多线程群聊();
		chat.start();
		
		

	}

}
