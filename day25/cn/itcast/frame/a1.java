package cn.itcast.frame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/*
软件的交互方式：
	1.控制台的交互方式
	2.图形化界面的交互方式
	
不重要

java使用到的图形类主要是在java.awt   与javax.swing包中。

java.awt 与   javax.swing包的区别：
	java.awt中使用的图形类都是依赖于系统的图形库
	javax.swing包使用的图形类都是sun自己实现的，不需要依赖系统的图形库

疑问： 既然swing包中的图形类已经取代awt包的图形类，为什么不删除awt呢？

在java中所有的图形类都被称作组件类。

组件的类别：
----------| 容器组件
----------| 非容器组件  
*/
public class a1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("这个是我第一个图形化界面的例子");
		//设置窗体的大小
//		frame.setSize(300,400);
		//设置窗体(左上角)出现的位置
//		frame.setBounds((1366-300)/2, (768-400)/2, 300,400); // 第一个参数是左上角的x轴坐标， 第二参数是左上角y的坐标。 第三个窗体宽， 第四窗体的高。
		initFrame(frame, 300,400);
		frame.setVisible(true); //setVisible 设置窗体的可见性。
		//设置窗体关闭事件
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//获取屏幕的分辨率   设置窗体在屏幕的居中位置。
	public static void initFrame(JFrame frame,int width , int height){
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //获取一个与系统相关工具类对象
		//获取屏幕的分辨率
		Dimension d = toolkit.getScreenSize();
		int x = (int) d.getWidth();
		int y = (int) d.getHeight();
		frame.setBounds((x-width)/2, (y-height)/2, width, height);
		
	}

}
