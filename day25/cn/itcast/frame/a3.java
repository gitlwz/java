package cn.itcast.frame;

import java.awt.FileDialog;

import javax.swing.JFrame;

import cn.itcast.util.FrameUtil;

/*
�ļ��Ի���(FileDialog)��
	
	FileDialog(Dialog parent, String title, int mode) 
	parent�� �Ի����������
	tiltle : �Ի���ı���
	mode: load(��) �� save(����)
	
*/
public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("����");
		//����һ���ļ��Ի���(��ʼҲ�ǲ��ɼ�)
//		FileDialog fileDialog = new FileDialog(frame, "��ѡ��򿪵��ļ�", FileDialog.LOAD);
		
		FileDialog fileDialog = new FileDialog(frame,"��ѡ�񱣴��·��",FileDialog.SAVE);
		
		FrameUtil.initFrame(frame, 300,400);
		fileDialog.setVisible(true);
		
		System.out.println("�ļ����ڵ�Ŀ¼��"+ fileDialog.getDirectory());
		System.out.println("�ļ�����"+ fileDialog.getFile());
	}

}
