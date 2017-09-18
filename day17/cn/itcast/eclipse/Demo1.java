package cn.itcast.eclipse;

import java.util.ArrayList;

/*
 alt + /     		:内容补全键

 ctrl + 1    		:快速修复

 alt + 上下方向键 		：移动代码

 ctrl + shift + /  	添加多行注释

 ctrl + shift + \  	取消多行注释

ctrl + shift + o    快速导包

ctrl + d            删除当前行代码

断电调试：可以让程序停留在指定的地方，然后去观察目前程序的数据，然后去调试分析。
	
	setp over    跳过
	setp into    进入
	setp return  出来
	
 */

class Person {
      String name;
      public Person() {
		// TODO Auto-generated constructor stub
	}
      
}

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("张1");
		list.add("张2");
		list = null;
		System.out.println(list.size());
	}

}
