package cn.itcast.regex;

/*
正则表达式：用于操作用于操作字符串的一个规则

需求:校验一个QQ号
	1.不能以0开头
	2.长度5-11
	3.只能由数字组成
 
 
 */


public class 正则 {

	public static void main(String[] args) {
		String qq = "1234557";
		/*
		if(!qq.startsWith("0")){
			if(qq.length() >= 5 && qq.length() <= 11){
				char[] arr = qq.toCharArray();
			}else {
				System.out.println("QQ号的长度只能是5-11位");
			}
		}else{ //以0开头
			System.out.println("QQ号不能以0开头！");
			
		}
*/
	}

}
