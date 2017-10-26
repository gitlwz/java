package cn.itcast.frame;

import javax.swing.JDialog;
import javax.swing.JFrame;

import cn.itcast.util.FrameUtil;

/*
对话框类(Dialog):

	JDialog(Dialog owner, String title, boolean modal) 
	
	owner: 所有者
	
	title : 标题
	
	modal : modal

JOptionPane(对话框)
	消息对话框
	警告对话框
	错误对话框
	输入对话框
	确认对话框
	


*/
public class a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("窗体");
		
		//创建对话框
		JDialog dialog = new JDialog(frame, "对话框",true);
		//使用我自定义的 窗体工具类
		FrameUtil.initFrame(frame, 300, 400);
		
		dialog.setBounds(500,300, 100, 200);
		dialog.setVisible(true); //设置对话框的可见性
	}

}
