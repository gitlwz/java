package cn.itcsat.string;
/*
 * 2.2 ��ȡ����
 	int length()  ��ȡ�ַ����ĳ���
	char charAt(int index) ��ȡ�ض�λ�õ��ַ� (�Ǳ�Խ��)
	int indexOf(String str) �����Ӵ���һ�γ��ֵ�����ֵ������Ӵ�û�г��� ���ַ����У���ô�򷵻�-1��ʾ
	int lastIndexOf(int ch) ��ȡ���һ���ַ���λ��

 */
public class Demo4 {
	public static void main(String[] args){
		String str = "abc�й�";
		
		System.out.println("�ַ������ַ�����:" + str.length());
		
		System.out.println("��������ֵ��ȡ��Ӧ���ַ�" + str.charAt(3));
		
		System.out.println("indexOf====" + str.indexOf("�й�"));
		System.out.println();
	}
}
