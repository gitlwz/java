package cn.itcast.װ�������ģʽ;
/*��ϰ��
һ������ÿ���˶��Ṥ�������ӵĹ������ǻ�����ĸ�׵Ĺ��������ڶ��ӵĻ�������һ����ǿ������ֹ���Ի�������������Ϳ�ϡ�
�ְֵĹ������������������������ǿ�������ϻ���
*/

interface Work {
	public void work();
}

class Son implements Work{
	@Override
	public void work() {
		System.out.println("��������������");
		
	}
}

class Mather implements Work{
	Work work;
	
	public Mather (Work work) {
		this.work = work;
	}

	@Override
	public void work() {
		this.work.work();
		System.out.println("��������ɫ....");
	}
}

class Father implements Work{
	
	Work work;
	public Father(Work work) {
		this.work = work;
	}
	
	@Override
	public void work() {
		work.work();
		System.out.println("�ϻ���.....");
	}
	
}




public class a3��ҵ {

	public static void main(String[] args) {
		
		Son s = new Son();
		
//		s.work();
		
		Mather mather = new Mather(s);
		
//		mather.work();
		
		
		Father father = new Father(mather);
		father.work();
		
	}

}


