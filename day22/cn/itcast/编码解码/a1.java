package cn.itcast.编码解码;

import java.nio.Buffer;
import java.util.Arrays;

/*

编码与解码

	编码：把看得懂的字符变成看不懂的码值这个过程我们称作为编码。
	
	解码：把码值查找对应的字符，我们把这个过程称作为解码。



*/
public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "中国";
		byte[] buf = string.getBytes(); //使用平台的默认码表gdk编码表
		
		System.out.println("数组的元素" + Arrays.toString(buf));
		
		
		
	}

}
