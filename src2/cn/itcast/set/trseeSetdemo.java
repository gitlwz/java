package cn.itcast.set;

import java.util.Iterator;
import java.util.TreeSet;

/*
 	
 	需求：将字符串中的数值进行排序。
 		
 	
 	
 */


public class trseeSetdemo {

	public static void main(String[] args) {
		String str = "8 10 15 5 2 7";
		String[] datas = str.split(" ");
		TreeSet tree = new TreeSet();
		for (int i = 0; i < datas.length; i++) {
			tree.add(Integer.parseInt(datas[i]));
		}
		
		Iterator it =  tree.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		
	}

}
