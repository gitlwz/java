package cn.itcsat.lwz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

class User{
	int id ;
	int ps ;
	@Override
	public boolean equals(Object obj) {
		User b = (User) obj;
		return id == b.id;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
}

public class ��¼ע�� {
	static Scanner scanner = new Scanner(System.in);//����һ��ɨ����
	static Collection users = new ArrayList();      //������Ա��Ϣ��
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("��ѡ����A��ע�ᣩ B����¼��");
			String score =  scanner.next(); //������һ���ַ�����������ɨ�赽���ݡ�	
			//���ѡ�����ע��
			if("A".equalsIgnoreCase(score)){
				signIn();
			}else if("B".equalsIgnoreCase(score)){
				logIn();
			}
		}
	}
	
	public static void signIn() {
		while (true) {
			System.out.println("�������˺�");
			int id =  scanner.nextInt(); //������һ���ַ�����������ɨ�赽���ݡ�
			User p = new User();
			p.id = id;
			if(users.contains(p)){
				System.out.println("�˺��Ѵ�������������");
				continue;
			}else {
				System.out.println("����������");
				int ps =  scanner.nextInt();
				p.ps = ps;
				users.add(p);
				System.out.println("ע��ɹ�~~~");
				Object[] arr = users.toArray();
				System.out.println(Arrays.toString(arr));
				break;
			}
			
		}

	}
	private static void logIn() {
		User p = new User();
		System.out.println("�������˺�");
		p.id = scanner.nextInt();
		System.out.println("����������");
		p.ps =  scanner.nextInt();
		if(users.contains(p)){
			Object[] arr = users.toArray();
			User u = (User)arr[((ArrayList) users).indexOf(p)];
			if(u.ps == p.ps){
				System.out.println("��¼�ɹ�~~");
			}else {
				System.out.println("��¼ʧ��~~");
			}
		}else {
			System.out.println("��¼ʧ��~~");
		}
	}

}
