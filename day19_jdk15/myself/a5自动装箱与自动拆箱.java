package myself;

import java.util.ArrayList;

/*
jdk1.5 -------->�Զ�װ�����Զ����䡣

java�������������ԣ��κ����ﶼ����ʹ�������������sun��ʹ����һЩ��
����java�а��ֻ���������������
	
	
	������������		��װ����
	bate		Byte
	short		Short
	int			Integer
	long		Long
	
	float		Float
	double		Double
	
	boolean		Boolean
	
	char		Character

�������������������˶�Ӧ�İ�װ���͵ĺô���
	


*/
public class a5�Զ�װ�����Զ����� {

	public static void main(String[] args) {
		String str = "12";
		
		//���ַ���ת��int�������ݡ�
		
		//���ַ���ת������
		int i = Integer.parseInt(str);
		
		System.out.println(i);
		
		//������ת���ַ���
		System.out.println(Integer.toString(i));
		
		//������ת���ɶ�Ӧ�Ľ�����ʽ
		System.out.println("10�Ķ�����:" + Integer.toBinaryString(10));
		System.out.println("10�İ˽���:" + Integer.toOctalString(10));
		System.out.println("10��ʮ������:" + Integer.toHexString(10));
		
		//���԰��ַ������ɶ�Ӧ�Ľ������ݰ���ת��
		String data = "10";
		int a = Integer.parseInt(data,2);
		System.out.println("a=" + a);
		
		//���ϣ������ǿ��Դ洢��������������ݵ�������
		/*ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);*/
		
		//�Զ�װ�䣺�Զ���java�Ļ���������������ת���ɶ��������������ݡ�
		int int1 = 10;             //����������������
		Integer int2 = int1;		//��
		
		//�Զ����䣺���������͵�����ת���ɻ������͵�����
		Integer int3 = new Integer(13);
		int int4 = int3;
		
		//-----------------------------------------//
		//������������
		Integer int5 = 127;
		Integer int6 = 127;
		System.out.println("ͬһ��������" + (int5 == int6));
		
	}

}
