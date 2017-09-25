package myself;

import java.util.ArrayList;
import java.util.Collections.*;

/*
jdk 1.5新特性之 ------------ 静态导入
	
	静态导入的作用：简化书写。
	
	
	静态导入的格式：
	import static 包名.类型.静态的成员

注意事项
	1.如果静态导入的成员与本类的成员存在同名的情况下，那么默认使用本类的静态成员。即静态导入无效。。
 
 */

import static java.util.Collections.*;
public class a1静态导入 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(13);
		list.add(9);
		list.add(10);
		list.add(19);
		
		//排序
		sort(list);
		
		System.out.println("集合的元素" + list);
		
		System.out.println("索引值" + list.indexOf(13));
		System.out.println("索引值" + binarySearch(list, 13));

	}

}
