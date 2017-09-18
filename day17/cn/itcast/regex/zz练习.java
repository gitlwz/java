package cn.itcast.regex;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
	正则表达式有以下几种应用
		
		匹配：
			matches()
		
		切割：
			split()
		
		替换：
		
		
		查找：
 
 */


public class zz练习 {

	public static void main(String[] args) {
		matchesPhon("18339967951");
		tests1();
		tests2();
	}
	
	//匹配---------------------
	//编写一个正则表达式匹配手机号
	//第一位： 1，
	//第二位：3  4 5 7 8
	//长度11
	public static void matchesPhon(String phone) {
		String regString  = "1[34578]\\d{9}";
		
		System.out.println(phone.matches(regString));
	}
	//匹配固定电话		区号-主机号码	区号：首位0	长度3~4		主机号：首位不能是0，长度7~8
	public static void matchesTel(String phone) {
		String regString  = "0\\d{2,3}-[1-9]\\d{6,7}";
		
		System.out.println(phone.matches(regString));
	}
	//匹配end------------------------------------------
	
	
	
	//切割----------------------------------------------
	public static void tests1() {
		String str = "明天         天   放                 假";
		String[] datasStrings = str.split(" +");
		System.out.println("数组的元素：" + Arrays.toString(datasStrings));
	}
	
	//根据重叠词进行切割
	public static void tests2() {
		String str = "大家家家明天天玩的的的的的的开心"; //大明玩开心
		String[] datasStrings = str.split("(.)\\1+");  //如果正则的内容需要复用，那么需要对正则的内容进行分组。分组的目的就是为了提高正则的复用性，组号不能指定，组好是从1开始
		System.out.println("数组的元素：" + Arrays.toString(datasStrings));
	}
	
	
	
	
	//作业：编写一个正则匹配一个邮箱
	
	
	
	
}
