package cn.itcsat.string;
/*
 	boolean endsWith(String str) 是否以指定字符结束
	boolean isEmpty()是否长度为0 如：“” null V1.6
	boolean contains(CharSequences) 是否包含指定序列 应用：搜索
	boolean equals(Object anObject) 是否相等
	boolean equalsIgnoreCase(String anotherString) 忽略大小写是否相等





char[] toCharArray()  将字符串转换为字符数组
byte[]	getBytes()
 */
public class Demo5 {
	public static void main(String[] args){
		String str  = "Demo.java";
		System.out.println("是否以指定的字符串结束： " + str.endsWith("ja"));
		
		System.out.println("判断字符串是否为空：" + str.isEmpty());
		
	}
}
