package cn.itcast.frame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/*
����Ľ�����ʽ��
	1.����̨�Ľ�����ʽ
	2.ͼ�λ�����Ľ�����ʽ
	
����Ҫ

javaʹ�õ���ͼ������Ҫ����java.awt   ��javax.swing���С�

java.awt ��   javax.swing��������
	java.awt��ʹ�õ�ͼ���඼��������ϵͳ��ͼ�ο�
	javax.swing��ʹ�õ�ͼ���඼��sun�Լ�ʵ�ֵģ�����Ҫ����ϵͳ��ͼ�ο�

���ʣ� ��Ȼswing���е�ͼ�����Ѿ�ȡ��awt����ͼ���࣬Ϊʲô��ɾ��awt�أ�

��java�����е�ͼ���඼����������ࡣ

��������
----------| �������
----------| ���������  
*/
public class a1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("������ҵ�һ��ͼ�λ����������");
		//���ô���Ĵ�С
//		frame.setSize(300,400);
		//���ô���(���Ͻ�)���ֵ�λ��
//		frame.setBounds((1366-300)/2, (768-400)/2, 300,400); // ��һ�����������Ͻǵ�x�����꣬ �ڶ����������Ͻ�y�����ꡣ ����������� ���Ĵ���ĸߡ�
		initFrame(frame, 300,400);
		frame.setVisible(true); //setVisible ���ô���Ŀɼ��ԡ�
		//���ô���ر��¼�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//��ȡ��Ļ�ķֱ���   ���ô�������Ļ�ľ���λ�á�
	public static void initFrame(JFrame frame,int width , int height){
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //��ȡһ����ϵͳ��ع��������
		//��ȡ��Ļ�ķֱ���
		Dimension d = toolkit.getScreenSize();
		int x = (int) d.getWidth();
		int y = (int) d.getHeight();
		frame.setBounds((x-width)/2, (y-height)/2, width, height);
		
	}

}
