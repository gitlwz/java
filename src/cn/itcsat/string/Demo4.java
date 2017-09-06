package cn.itcsat.string;
/*
 * 2.2 获取方法
 	int length()  获取字符串的长度
	char charAt(int index) 获取特定位置的字符 (角标越界)
	int indexOf(String str) 查找子串第一次出现的索引值，如果子串没有出现 在字符串中，那么则返回-1表示
	int lastIndexOf(int ch) 获取最后一个字符的位置

 */
public class Demo4 {
	public static void main(String[] args){
		String str = "abc中国";
		
		System.out.println("字符串的字符个数:" + str.length());
		
		System.out.println("根据索引值获取对应的字符" + str.charAt(3));
		
		System.out.println("indexOf====" + str.indexOf("中国"));
		System.out.println();
	}
}
