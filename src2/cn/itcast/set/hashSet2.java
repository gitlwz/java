package cn.itcast.set;

public class hashSet2 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);
		
		System.out.println("str1:" + str1.hashCode());
		System.out.println("str2:" + str2.hashCode());
		/*
		HashCodeĬ������±�ʶ�����ڴ��ַ,String ���Ѿ���д��Object��String hashCode�����ˡ�
		
			ע�⣺��������ַ���һ�£���ôhashCode��һ�µ�
		*/
	}

}
