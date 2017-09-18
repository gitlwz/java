package cn.itcast.regex;

public class 正则2 {

	public static void main(String[] args) {
		/*
		 预定义字符类 
			. 	任何字符（与行结束符可能匹配也可能不匹配） 
			\d 	数字：[0-9] 
			\D 	非数字： [^0-9] 
			\s 	空白字符：[ \t\n\x0B\f\r] 
			\S 	非空白字符：[^\s] 
			\w 	单词字符：[a-zA-Z_0-9] 
			\W 	非单词字符：[^\w]
		 */
		
		System.out.println("任意字符" + "a".matches("."));
		System.out.println("数字字符" + "1".matches("\\d"));
		System.out.println("非数字字符" + "1".matches("\\D"));
		/*
		Greedy 数量词
		?   ，一次或一次也没有
		*	，零次或多次
		+	，一次或多次
		{n}	，恰好n次
		{n,}	，至少n次
		{n,m}	，至少n次，但是不超过m次
		*/
		
		/*
		范围表示
		[abc]	a、b 或 c（简单类） 
		[^abc]	任何字符，除了 a、b 或 c（否定） 
		[a-zA-Z]	a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
		[a-d[m-p]]	a 到 d 或 m 到 p：[a-dm-p]（并集） 
		[a-z&&[def]]	d、e 或 f（交集） 
		[a-z&&[^bc]]	a 到 z，除了 b 和 c：[ad-z]（减去） 
		[a-z&&[^m-p]]	a 到 z，而非 m 到 p：[a-lq-z]（减去）
		*/
	}

}
