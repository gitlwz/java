package cn.itcast.set;

import java.util.TreeSet;

/*
���� ����ϵ��
------------| Collection �������ϵĸ��ӿ�
----------------| List  �����ʵ����List�ӿڵļ����࣬�߱����ص㣺 ���򣬿��ظ��� 
-------------------| ArrayList  ArrayList �ײ���ά����һ��Object����ʵ�ֵġ� �ص㣺 ��ѯ�ٶȿ죬��ɾ����
-------------------| LinkedList LinkedList �ײ���ʹ�����������ݽṹʵ�ֵģ� �ص㣺 ��ѯ�ٶ�������ɾ�졣
-------------------| Vector(�˽⼴��)  �ײ�Ҳ��ά����һ��Object������ʵ�ֵģ�ʵ����ArrayList��һ���ģ�����Vector���̰߳�ȫ�ģ�����Ч�ʵ͡�

----------------| Set  �����ʵ����Set�ӿڵļ����࣬�߱����ص㣺 ���򣬲����ظ���
-------------------| HashSet  �ײ���ʹ���˹�ϣ����֧�ֵģ��ص㣺 ��ȡ�ٶȿ�. 
-------------------| TreeSet   ���Ԫ�ؾ߱���Ȼ˳�� �����ԣ���ô�Ͱ���Ԫ����Ȼ˳������Խ�������洢��

TreeSet:
*/
public class treeSet {

	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		
		/*	tree.add(1);
		tree.add(10);
		tree.add(7);
		tree.add(19);
		tree.add(9);*/
		
		tree.add('b');
		tree.add('f');
		tree.add('a');
		tree.add('c');

		
		System.out.println(tree);
		
		
	}

}
