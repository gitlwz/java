package cn.itcast.regex;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
	������ʽ�����¼���Ӧ��
		
		ƥ�䣺
			matches()
		
		�и
			split()
		
		�滻��
		
		
		���ң�
 
 */


public class zz��ϰ {

	public static void main(String[] args) {
		matchesPhon("18339967951");
		tests1();
		tests2();
	}
	
	//ƥ��---------------------
	//��дһ��������ʽƥ���ֻ���
	//��һλ�� 1��
	//�ڶ�λ��3  4 5 7 8
	//����11
	public static void matchesPhon(String phone) {
		String regString  = "1[34578]\\d{9}";
		
		System.out.println(phone.matches(regString));
	}
	//ƥ��̶��绰		����-��������	���ţ���λ0	����3~4		�����ţ���λ������0������7~8
	public static void matchesTel(String phone) {
		String regString  = "0\\d{2,3}-[1-9]\\d{6,7}";
		
		System.out.println(phone.matches(regString));
	}
	//ƥ��end------------------------------------------
	
	
	
	//�и�----------------------------------------------
	public static void tests1() {
		String str = "����         ��   ��                 ��";
		String[] datasStrings = str.split(" +");
		System.out.println("�����Ԫ�أ�" + Arrays.toString(datasStrings));
	}
	
	//�����ص��ʽ����и�
	public static void tests2() {
		String str = "��ҼҼ���������ĵĵĵĵĵĿ���"; //�����濪��
		String[] datasStrings = str.split("(.)\\1+");  //��������������Ҫ���ã���ô��Ҫ����������ݽ��з��顣�����Ŀ�ľ���Ϊ���������ĸ����ԣ���Ų���ָ��������Ǵ�1��ʼ
		System.out.println("�����Ԫ�أ�" + Arrays.toString(datasStrings));
	}
	
	
	
	
	//��ҵ����дһ������ƥ��һ������
	
	
	
	
}
