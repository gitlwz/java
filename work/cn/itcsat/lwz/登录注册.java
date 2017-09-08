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

public class 登录注册 {
	static Scanner scanner = new Scanner(System.in);//创建一个扫描器
	static Collection users = new ArrayList();      //创建人员信息库
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("请选择功能A（注册） B（登录）");
			String score =  scanner.next(); //定义了一个字符串变量接收扫描到内容。	
			//如果选择的是注册
			if("A".equalsIgnoreCase(score)){
				signIn();
			}else if("B".equalsIgnoreCase(score)){
				logIn();
			}
		}
	}
	
	public static void signIn() {
		while (true) {
			System.out.println("请输入账号");
			int id =  scanner.nextInt(); //定义了一个字符串变量接收扫描到内容。
			User p = new User();
			p.id = id;
			if(users.contains(p)){
				System.out.println("账号已存在请重新输入");
				continue;
			}else {
				System.out.println("请输入密码");
				int ps =  scanner.nextInt();
				p.ps = ps;
				users.add(p);
				System.out.println("注册成功~~~");
				Object[] arr = users.toArray();
				System.out.println(Arrays.toString(arr));
				break;
			}
			
		}

	}
	private static void logIn() {
		User p = new User();
		System.out.println("请输入账号");
		p.id = scanner.nextInt();
		System.out.println("请输入密码");
		p.ps =  scanner.nextInt();
		if(users.contains(p)){
			Object[] arr = users.toArray();
			User u = (User)arr[((ArrayList) users).indexOf(p)];
			if(u.ps == p.ps){
				System.out.println("登录成功~~");
			}else {
				System.out.println("登录失败~~");
			}
		}else {
			System.out.println("登录失败~~");
		}
	}

}
