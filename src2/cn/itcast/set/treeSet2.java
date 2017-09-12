package cn.itcast.set;

import java.util.Comparator;
import java.util.TreeSet;



/*
treeSet����Զ���Ԫ��:

treeSetҪע������
	1. ��TreeSet���Ԫ�ص�ʱ�����Ԫ�ر���߱�����Ȼ˳������ԣ���ô�Ͱ���Ԫ����Ȼ˳������Խ�������洢��
	2. ��TreeSet���Ԫ�ص�ʱ�����Ԫ�ر����߱���Ȼ˳������ԣ���ô��Ԫ�������������Ҫʵ��Comparable�ӿڣ���Ԫ��
	�ıȽϹ�������compareTo(T o)�����ϡ� 
	3.����Ƚ�Ԫ�ص�ʱ��compareTo�������ص���0����ô��Ԫ�ؾͱ���Ϊ�ظ�Ԫ�أ���������ӣ���
	
	4.��TreeSet���Ԫ�ص�ʱ��, ���Ԫ�ر���û�о߱���Ȼ˳�� �����ԣ���Ԫ����������Ҳû��ʵ��Comparable�ӿڣ���ô����Ҫ�ڴ���TreeSet��ʱ����һ��
 	�Ƚ�����
 	
 	
 	5.��TreeSet���Ԫ�ص�ʱ��, ���Ԫ�ر���û�о߱���Ȼ˳�� �����ԣ���Ԫ�����������Ѿ�ʵ����Comparable�ӿڣ��ڴ���TreeSet����Ҳ�����˱Ƚ�������ô�ԱȽ���Ϊ���ȱȽϹ���
 	����Զ���Ƚ����� �Զ���һ����ʵ��Comparator�ӿڼ��ɣ���Ԫ����Ԫ��֮��ıȽϹ�������compare�����ڼ��ɡ�
 		�Զ���Ƚ����ĸ�ʽ��
 			class ����  implenebts Comparator{
 				
 			}
 	�Ƽ�ʹ�ã��Ƚ���(Comparator)
*/


class Emp {
	int id;
	
	String name;
	
	int salary;
	
	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "{ ��ţ�"+  this.id+" ������"+ this.name+" нˮ��"+ this.salary+"}";
	}
	
	/*public int compareTo(Object o) {
		Emp emp = (Emp) o;
		return this.salary - emp.salary;
	}*/
}

//�Զ���Ƚ���
class MyComparator implements Comparator{
	//���ݵ�һ������С�ڡ����ڻ���ڵڶ��������ֱ𷵻ظ������������������ 
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp) o1;
		Emp e2 = (Emp) o2;
		return e1.id - e2.id;
	}

	
}

public class treeSet2 {
	
	public static void main(String[] args) {
		TreeSet tree = new TreeSet(new MyComparator());
		
		tree.add(new Emp(113, "����", 200));
		tree.add(new Emp(110, "��½", 100));
		tree.add(new Emp(220, "����", 300));
		tree.add(new Emp(120, "�ϲ�", 500));
		
		
		System.out.println("���ϵ�Ԫ��:" + tree);
	}

}
