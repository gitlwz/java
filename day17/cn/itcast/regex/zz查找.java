package cn.itcast.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 查找需要正则对象
 * 指定为字符串的正则表达式必须首先被编译为此类的实例。然后，可将得到的正则对象匹配任意的字符串用于创建Matcher对象
 * 执行匹配锁设计的所有状态都驻留在匹配器中，所以多个匹配器可以共享同一模式，因此，典型的调用顺序是
 * 
	
	Pattern p = Pattern.compile("正则");
	Matcher m = p.matcher("aaaaab");
	boolean b = m.matches();
	
	
	查找：
		查找需要使用的对象
		1.Pattern(正则对象)
		2.Matcher(匹配器对象)
			匹配器要使用到的方法
				1.find(); 返回boolean  -》通知匹配器去匹配字符串，查找符合规则的字子串。如果能查找到符合规则的字符串，则返回true，否则返回false
				2.group();		     -》获取符合规则的子串
				
				注意：使用group方法的时候一定要先调用find方法让匹配去查找符合规则的字符串，否则报错。
*/			
public class zz查找 {

	public static void main(String[] args) {
		//找出三个字符组成的单词
		String content = "da jia de jia qi wang bi liao hai kai xin ma ";
		
		String reg = "\\b[a-zA-Z]{3}\\b";
		
		//先要把字符串的正则编译成 Patten正则对象。
		Pattern p = Pattern.compile(reg);
		
		//使用正则对象匹配字符串用于产生一个   Matcher  对象;
		Matcher m = p.matcher(content);
		
		//System.out.println("有符合规则的字符串吗？" + m.find());
		
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
