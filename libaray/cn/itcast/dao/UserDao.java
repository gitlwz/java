package cn.itcast.dao;

import java.util.ArrayList;
import java.util.Scanner;

import cn.itcast.model.User;




//�����Ƕ��û�������ɾ��ĵġ�
public class UserDao {

	
	private static ArrayList<User> users = new ArrayList<User>();
	
	//ע��
	public void reg() {
		Scanner scanner = new Scanner(System.in);
		String userName = null;
		while(true){
			System.out.println("�������û���:");  //�û�����λ���������ֿ�ͷ�� 6λӢ����ĸ���������
			userName = scanner.next();
			if(userName.matches("[a-zA-Z][a-zA-Z0-9]{5}")){
				break;
			}else{
				System.out.println("�û��������Ϲ���..");
			}
		}
		String password  =null;
		while(true){
			System.out.println("����������:");  //�û�����λ���������ֿ�ͷ�� 6λӢ����ĸ���������
			password = scanner.next();
			if(password.matches("\\d{6}")){
				break;
			}else{
				System.out.println("���벻���Ϲ���..");
			}
		}
		//ʹ������ע�����Ϣ����һ���û�����
		User user = new User(userName,password);
		users.add(user);
		System.out.println("ע�Ṧ��...");
		System.out.println("��ǰ�û��У�"+users );
	}
	
}
