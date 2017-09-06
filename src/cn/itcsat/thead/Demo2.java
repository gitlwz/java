package cn.itcsat.thead;
/*
   模拟QQ视频与聊天同时在执行
 */
class TalkThread extends Thread{

	@Override
	public void run() {
		while(true){
			System.out.println("hi 你好    开视频吧....");
		}
	}
	
	
}


class VideoThread extends Thread{

	@Override
	public void run() {
		while(true){
			System.out.println("视频....");
		}
	}
	
	
}
public class Demo2 {

	public static void main(String[] args) {
		TalkThread talkThread = new TalkThread();
		talkThread.start();
		VideoThread videoThead = new VideoThread();
		videoThead.start();
		
		
		// TODO Auto-generated method stub

	}

}
