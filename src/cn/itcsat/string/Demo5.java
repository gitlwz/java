package cn.itcsat.string;
/*
 	boolean endsWith(String str) �Ƿ���ָ���ַ�����
	boolean isEmpty()�Ƿ񳤶�Ϊ0 �磺���� null V1.6
	boolean contains(CharSequences) �Ƿ����ָ������ Ӧ�ã�����
	boolean equals(Object anObject) �Ƿ����
	boolean equalsIgnoreCase(String anotherString) ���Դ�Сд�Ƿ����





char[] toCharArray()  ���ַ���ת��Ϊ�ַ�����
byte[]	getBytes()
 */
public class Demo5 {
	public static void main(String[] args){
		String str  = "Demo.java";
		System.out.println("�Ƿ���ָ�����ַ��������� " + str.endsWith("ja"));
		
		System.out.println("�ж��ַ����Ƿ�Ϊ�գ�" + str.isEmpty());
		
	}
}
