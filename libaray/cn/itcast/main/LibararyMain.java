package cn.itcast.main;

import java.util.Scanner;

import cn.itcast.dao.UserDao;

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
		UserDao userDao = new UserDao();
		while(true){
			System.out.println("��ѡ���ܣ�A(�û���½)    B(ע���û�)      Q(�˳�ϵͳ)");
			String option = scanner.next();
			
			if("a".equalsIgnoreCase(option)){
				if(userDao.login()){
					System.out.println("��¼�ɹ���");
					if(BookDeal()){  //���ע���û������µ�¼
						continue;
					}
				}else {
					continue;
				}
			}else if("b".equalsIgnoreCase(option)){
				userDao.reg();
			}else if("Q".equalsIgnoreCase(option)){
				System.out.println("ѡ�����˳�������");
			}else{
				System.out.println("���������������������...");
				
			}
		
		}
	}
	public static boolean BookDeal() {
		
		Scanner  scanner = new Scanner(System.in);
		while(true){
			System.out.println("��ӭʹ��ͼ���ϵͳ����ͼ����ѡ���ܣ�A(�鿴ͼ��)    B(����ͼ��)  c(�޸�ͼ��)  d(ɾ��ͼ��)    E(ע�����û�)");
			String option = scanner.next();
			
			if("a".equalsIgnoreCase(option)){
				System.out.println("�鿴ͼ��");
				System.out.println("|����|\t|����|\t|������|\t|�۸�|\t|���|\t|��������|");
				
				
			}else if("b".equalsIgnoreCase(option)){
				System.out.println("ѡ��������ͼ��");
			}else if("c".equalsIgnoreCase(option)){
				System.out.println("ѡ�����޸�ͼ��");
			}else if("d".equalsIgnoreCase(option)){
				System.out.println("ѡ����ɾ��ͼ��");
				
			}else if("e".equalsIgnoreCase(option)){
				System.out.println("ѡ����ע�����û�");
				break;
			}else {
				System.out.println("�������󣡣�");
				continue;
			}
		
		}
		return true;
	}

}
