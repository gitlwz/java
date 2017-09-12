package cn.itcsat.lwz;

import java.util.LinkedList;
import java.util.Random;

/*
	需求：使用LinkedList存储一副扑克牌，然后实现洗牌功能。
	
	52张
	
	一张扑克牌：花色   点数。
	
*/
class Poker{
	String color;
	
	String num;
	
	
	public Poker(String color,String num) {
		this.color = color;
		this.num = num;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{" + color + num + "}";
	}
}

public class linkedList_洗牌 {

	public static void main(String[] args) {
		LinkedList pokers = createPoker();
		shufflePoker(pokers);
		showPoker(pokers);
	}
	//洗牌的功能
	public static void shufflePoker(LinkedList pokers) {
		//创建随机数对象
		Random random = new Random();
		
		for (int i = 0; i < 100; i++) {
			//随机产生两个
			int index1 = random.nextInt(pokers.size());
			int index2 = random.nextInt(pokers.size());
			//根据索引值去除两张牌，然后交换两张牌的顺序
			Poker poker1 = (Poker)pokers.get(index1);
			Poker poker2 = (Poker)pokers.get(index2);
			
			pokers.set(index1, poker2);
			pokers.set(index2, poker1);
		}
	}
	
	
	//显示扑克
	public static void showPoker(LinkedList pokers) {
		for (int i = 0; i < pokers.size(); i++) {
			System.out.print(pokers.get(i));
			if (i%10 == 9) {
				System.out.println();
			}
		}
	}
	
	//生成扑克的写法
	public static LinkedList createPoker() {
		//该集合用于存储扑克对象。
		LinkedList list = new LinkedList();
		//定义数组存储所有的花色和点数
		String[] color = {"黑桃","红桃","梅花","方块"};
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < color.length; j++) {
				list.add(new Poker(color[j], num[i]));
			}
		}
		return list;
	}
	
}
