package cn.itcast.�������;

import java.nio.Buffer;
import java.util.Arrays;

/*

���������

	���룺�ѿ��ö����ַ���ɿ���������ֵ����������ǳ���Ϊ���롣
	
	���룺����ֵ���Ҷ�Ӧ���ַ������ǰ�������̳���Ϊ���롣



*/
public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "�й�";
		byte[] buf = string.getBytes(); //ʹ��ƽ̨��Ĭ�����gdk�����
		
		System.out.println("�����Ԫ��" + Arrays.toString(buf));
		
		
		
	}

}
