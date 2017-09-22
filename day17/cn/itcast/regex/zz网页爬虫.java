package cn.itcast.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*



*/
public class zz网页爬虫 {

	public static void main(String[] args) {
		String contentString = "有事没事联系 ： 547485261@163.com 有事没事联系 ： 547485261@qq.cn有事没事联系 ： 547485261@qq.com.cn有事没事联系 ： 547485261@qq.net ";
		
		String reg = "[a-zA-Z1-9]\\w{5,17}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
		
		//把字符串的正则编译成正则对象
		Pattern p = Pattern .compile(reg);
		
		//使用正则对象
		Matcher m = p.matcher(contentString);
		while (m.find()) {
			System.out.println(m.group());
			
		}
		
	}

}
