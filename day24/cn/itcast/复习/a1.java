package cn.itcast.��ϰ;
/*
��Ԫ�����

�������ʽ?:ֵ1:ֵ2


��������û���������ͱ���ָ��Ķ���ͳ���Ϊ��������

�����ڲ��ࣺ û����������ͳ��������ڲ���

�����ڲ���ʹ��ǰ�᣺������ڼ̳л���ʵ�ֹ�ϵ��

��Ϊ�����ڲ���û�����������Դ��������ڲ�������ʱ��ͱ���Ҫ����������������ֻ��������ӿڵ�����������
�����ڲ���ֻ��û��������������һ�ų�Ա���Ǿ߱��ġ�

�����ڲ����Ӧ�ó�������Ҫ����Ϊ��������ʹ�á�
*/

interface Dao{
	public void add();
}

class Other{
	public void print(){
		new Dao(){
			//�������о�д�����ڲ���ĳ�Ա��
			
			@Override
			public void add() {
				System.out.println("���ѧ��������");
			}
		}.add();
	}
}

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
