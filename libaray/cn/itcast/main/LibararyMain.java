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
		System.out.println("*    		欢迎使用图书馆登录系统                                 *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("****************************************");
		Scanner  scanner = new Scanner(System.in);
		UserDao userDao = new UserDao();
		while(true){
			System.out.println("请选择功能：A(用户登陆)    B(注册用户)      Q(退出系统)");
			String option = scanner.next();
			
			if("a".equalsIgnoreCase(option)){
				if(userDao.login()){
					System.out.println("登录成功！");
					if(BookDeal()){  //如果注销用户，重新登录
						continue;
					}
				}else {
					continue;
				}
			}else if("b".equalsIgnoreCase(option)){
				userDao.reg();
			}else if("Q".equalsIgnoreCase(option)){
				System.out.println("选择了退出！！！");
			}else{
				System.out.println("你的输入有误，请重新输入...");
				
			}
		
		}
	}
	public static boolean BookDeal() {
		
		Scanner  scanner = new Scanner(System.in);
		while(true){
			System.out.println("欢迎使用图书馆系统操作图书请选择功能：A(查看图书)    B(增加图书)  c(修改图书)  d(删除图书)    E(注销本用户)");
			String option = scanner.next();
			
			if("a".equalsIgnoreCase(option)){
				System.out.println("查看图书");
				System.out.println("|书名|\t|作者|\t|出版社|\t|价格|\t|书号|\t|出版日期|");
				
				
			}else if("b".equalsIgnoreCase(option)){
				System.out.println("选择了增加图书");
			}else if("c".equalsIgnoreCase(option)){
				System.out.println("选择了修改图书");
			}else if("d".equalsIgnoreCase(option)){
				System.out.println("选择了删除图书");
				
			}else if("e".equalsIgnoreCase(option)){
				System.out.println("选择了注销本用户");
				break;
			}else {
				System.out.println("输入有误！！");
				continue;
			}
		
		}
		return true;
	}

}
