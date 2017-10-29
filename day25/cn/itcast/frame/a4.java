package cn.itcast.frame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cn.itcast.util.FrameUtil;

/*
面板(JPanel)

 */
public class a4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("窗体");
		//创建一个面板
		JPanel panel = new JPanel();
		//设置面板的背景颜色
		panel.setBackground(Color.RED);
		//把面板添加到窗体
		frame.add(panel);
		FrameUtil.initFrame(frame, 400, 300);
	}

}
