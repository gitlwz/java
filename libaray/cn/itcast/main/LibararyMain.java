package cn.itcast.main;

import java.util.Scanner;

public class LibararyMain {

	public static void main(String[] args) {
		System.out.println("****************************************");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*    		��ӭʹ��ͼ��ݵ�¼ϵͳ                                 *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("****************************************");
		Scanner  scanner = new Scanner(System.in);
		while(true){
			System.out.println("��ѡ���ܣ�A(�û���½)    B(ע���û�)      Q(�˳�ϵͳ)");
			String option = scanner.next();
			
			if("a".equalsIgnoreCase(option)){
				System.out.println("ѡ���˵�¼������");
				
			}else if("b".equalsIgnoreCase(option)){
				System.out.println("ѡ����ע�ᣡ����");
				
			}else if("Q".equalsIgnoreCase(option)){
				System.out.println("ѡ�����˳�������");
			}else{
				System.out.println("���������������������...");
				
			}
		
		}
	}

}
