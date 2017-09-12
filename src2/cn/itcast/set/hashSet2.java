package cn.itcast.set;

public class hashSet2 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);
		
		System.out.println("str1:" + str1.hashCode());
		System.out.println("str2:" + str2.hashCode());
		/*
		HashCode默认情况下标识的是内存地址,String 类已经重写了Object的String hashCode方法了。
		
			注意：如果两个字符串一致，那么hashCode是一致的
		*/
	}

}
