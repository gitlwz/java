package cn.itcsat.thead;
/*
   ģ��QQ��Ƶ������ͬʱ��ִ��
 */
class TalkThread extends Thread{

	@Override
	public void run() {
		while(true){
			System.out.println("hi ���    ����Ƶ��....");
		}
	}
	
	
}


class VideoThread extends Thread{

	@Override
	public void run() {
		while(true){
			System.out.println("��Ƶ....");
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
