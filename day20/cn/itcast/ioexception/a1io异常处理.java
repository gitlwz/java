package cn.itcast.ioexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
IO�쳣�Ĵ���


*/
public class a1io�쳣���� {
	public static void main(String[] args) {
		
	}
	//���󡰰ѿ���ͼƬ���ӵĴ��봦��һ���쳣
	public static void read1() {
		FileInputStream fileInputStream = null;
		try {
			//�ҵ�Ŀ���ļ�
			File file = new File("F:\\�½��ļ���\\fileceshi\\a.txt");
			
			//�������ݵ�����ͨ��
			fileInputStream = new FileInputStream(file);
			byte[] buf = new byte[1024];
			
			int lenght = 0;
			while ((lenght = fileInputStream.read(buf)) != -1) {
				System.out.println(new String(buf,0,lenght));
			}
		} catch (IOException e) {
			System.out.println("��ȡ�ļ�");
			throw new RuntimeException(e);  //��IOException  ���ݸ� RuntimeException��װһ�㣬Ȼ���ܳ�������������Ŀ����Ϊ���õ�����ʹ�ñ�ĸ��ӷ���
		}finally{
			try {
				if(fileInputStream != null){
					fileInputStream.close();
					System.out.println("�ر���Դ�ɹ�");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("�ر���Դʧ��");
				throw new RuntimeException(e);
			}
		}
		
//		//�ر���Դ
//		fileInputStream.close();
	}
}
