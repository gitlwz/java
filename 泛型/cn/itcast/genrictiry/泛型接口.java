package cn.itcast.genrictiry;

/*

���ͽӿ�

���ͽӿڵĶ����ʽ��
	interface �ӿ���<�����Զ��巺��>{
	
	}

���ͽӿ�Ҫע������
	1.�ӿ����Զ���ķ��͵ľ���������������ʵ��һ���ӿڵ�ʱ��ָ���ġ�
	2.�ڽӿ����Զ���ķ��������ʵ�ֽӿڵ�ʱ��û��ָ����������ݷ��ͣ���ôĬ��ΪObject����
	
����Ŀǰʵ��һ���ӿڵ�ʱ�򣬻�����ȷĿǰҪ�������������ͣ�Ҫ�ȵ������ӿ�ʵ��������ʱ�����ָ�����͵ľ�����������
	���Ҫ�ӳ��ӿ��Զ����� �ľ����������ͣ���ô��ʽ����
	��ʽ��
		public class ���ͽӿ�<T> implements Dao<T>{
			
		}
 */

interface Dao<T>{
	
	public void add(T t);	
}


public class ���ͽӿ�<T> implements Dao<T>  {

	
		public static void main(String[] args) {
			���ͽӿ�<String> d = new ���ͽӿ�<String>();
		}

		public void add(T t){
			
		}

	

}
