package myself;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
jdk1.5 出现的新特性 ------》增强for循环

增强for循环的作用：简单迭代器的书写格式。(注意：增强for循环的底层还是使用了迭代器遍历。)

增强for村换的使用范围:如果是实现了Iterable接口的对象或者是数组对象都可以使用增强for循环。

增强for循环的格式：

	for( 数据类型    变量名   ：遍历目标  ){
	
	}

增强for循环要注意的事项：
	1.增强for循环底层也是使用了迭代器获取的，只不过获取迭代器由jvm完成，不需要我们获取迭代器而已，所以在使用增强for循环变量元素的过程中不准
	       使用集合对象对集合的元素个数进行修改。
	2.迭代器遍历元素与增强for循环遍历元素的区别
		1）使用迭代器遍历集合的元素时可以删除集合的元素，而增强for循环遍历不能
	3.普通for循环和增强for循环的区别
		普通for循环可以没有目标，增强for循环一定要有遍历目标。
	4.
*/
public class a2增强for循环 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("狗娃");
		set.add("狗剩");
		set.add("铁蛋");
		
		
		//使用迭代器遍历Set的集合
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("元素 ：" + iterator.next());
			
		}
		//使用增强for循环遍历------------------------------------
		for ( String item : set) {
			System.out.println("增强for循环遍历元素: " + item);
//			set.remove("狗剩");
		}
		
		//数组---------------------------------------------------
		
		int[] arr = {12,5,6,1};
		
		//普通for循环的遍历方式
		for (int i = 0; i < arr.length; i++) {
			System.out.println("元素：" + arr[i]);
		}
		//增强for循环的遍历
		
		for( int item : arr){
			System.out.println("增强for循环元素: " + item);
		}
		
		//注意：Map集合没有实现Iterable接口，所以map集合不能直接使用增强for循环
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("001", "张1");
		map.put("002", "张2");
		map.put("003", "张3");
		map.put("004", "张4");
		
		Set<Map.Entry<String, String>> entries = map.entrySet();
		
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + entry.getValue());
		}
		
		
	}

}
