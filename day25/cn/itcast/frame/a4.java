package cn.itcast.frame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cn.itcast.util.FrameUtil;

/*
���(JPanel)

 */
public class a4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("����");
		//����һ�����
		JPanel panel = new JPanel();
		//�������ı�����ɫ
		panel.setBackground(Color.RED);
		//�������ӵ�����
		frame.add(panel);
		FrameUtil.initFrame(frame, 400, 300);
	}

}
