package cn.itcast.frame;

import java.awt.FileDialog;

import javax.swing.JFrame;

import cn.itcast.util.FrameUtil;

/*
文件对话框(FileDialog)：
	
	FileDialog(Dialog parent, String title, int mode) 
	parent： 对话框的所有者
	tiltle : 对话框的标题
	mode: load(打开) 、 save(保存)
	
*/
public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("窗体");
		//创建一个文件对话框(初始也是不可见)
//		FileDialog fileDialog = new FileDialog(frame, "请选择打开的文件", FileDialog.LOAD);
		
		FileDialog fileDialog = new FileDialog(frame,"请选择保存的路径",FileDialog.SAVE);
		
		FrameUtil.initFrame(frame, 300,400);
		fileDialog.setVisible(true);
		
		System.out.println("文件所在的目录："+ fileDialog.getDirectory());
		System.out.println("文件名："+ fileDialog.getFile());
	}

}
