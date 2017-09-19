package cn.itcast.dao;

import java.util.ArrayList;
import java.util.Scanner;

import cn.itcast.model.User;




//该类是对用户数据增删查改的。
public class UserDao {

	
	private static ArrayList<User> users = new ArrayList<User>();
	
	//注册
	public void reg() {
		Scanner scanner = new Scanner(System.in);
		String userName = null;
		while(true){
			System.out.println("请输入用户名:");  //用户名首位不能以数字开头， 6位英文字母与数组组成
			userName = scanner.next();
			if(userName.matches("[a-zA-Z][a-zA-Z0-9]{5}")){
				break;
			}else{
				System.out.println("用户名不符合规则..");
			}
		}
		String password  =null;
		while(true){
			System.out.println("请输入密码:");  //用户名首位不能以数字开头， 6位英文字母与数组组成
			password = scanner.next();
			if(password.matches("\\d{6}")){
				break;
			}else{
				System.out.println("密码不符合规则..");
			}
		}
		//使用了新注册的信息生产一个用户对象。
		User user = new User(userName,password);
		users.add(user);
		System.out.println("注册功能...");
		System.out.println("当前用户有："+users );
	}
	
}
