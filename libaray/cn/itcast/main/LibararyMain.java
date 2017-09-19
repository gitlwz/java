package cn.itcast.main;

import java.util.Scanner;

public class LibararyMain {

	public static void main(String[] args) {
		System.out.println("****************************************");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*    		欢迎使用图书馆登录系统                                 *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("****************************************");
		Scanner  scanner = new Scanner(System.in);
		while(true){
			System.out.println("请选择功能：A(用户登陆)    B(注册用户)      Q(退出系统)");
			String option = scanner.next();
			
			if("a".equalsIgnoreCase(option)){
				System.out.println("选择了登录！！！");
				
			}else if("b".equalsIgnoreCase(option)){
				System.out.println("选择了注册！！！");
				
			}else if("Q".equalsIgnoreCase(option)){
				System.out.println("选择了退出！！！");
			}else{
				System.out.println("你的输入有误，请重新输入...");
				
			}
		
		}
	}

}
