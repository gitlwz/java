package cn.itcast.frame;

import javax.swing.JDialog;
import javax.swing.JFrame;

import cn.itcast.util.FrameUtil;

/*
�Ի�����(Dialog):

	JDialog(Dialog owner, String title, boolean modal) 
	
	owner: ������
	
	title : ����
	
	modal : modal

JOptionPane(�Ի���)
	��Ϣ�Ի���
	����Ի���
	����Ի���
	����Ի���
	ȷ�϶Ի���
	


*/
public class a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("����");
		
		//�����Ի���
		JDialog dialog = new JDialog(frame, "�Ի���",true);
		//ʹ�����Զ���� ���幤����
		FrameUtil.initFrame(frame, 300, 400);
		
		dialog.setBounds(500,300, 100, 200);
		dialog.setVisible(true); //���öԻ���Ŀɼ���
	}

}
