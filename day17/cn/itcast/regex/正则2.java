package cn.itcast.regex;

public class ����2 {

	public static void main(String[] args) {
		/*
		 Ԥ�����ַ��� 
			. 	�κ��ַ������н���������ƥ��Ҳ���ܲ�ƥ�䣩 
			\d 	���֣�[0-9] 
			\D 	�����֣� [^0-9] 
			\s 	�հ��ַ���[ \t\n\x0B\f\r] 
			\S 	�ǿհ��ַ���[^\s] 
			\w 	�����ַ���[a-zA-Z_0-9] 
			\W 	�ǵ����ַ���[^\w]
		 */
		
		System.out.println("�����ַ�" + "a".matches("."));
		System.out.println("�����ַ�" + "1".matches("\\d"));
		System.out.println("�������ַ�" + "1".matches("\\D"));
		/*
		Greedy ������
		?   ��һ�λ�һ��Ҳû��
		*	����λ���
		+	��һ�λ���
		{n}	��ǡ��n��
		{n,}	������n��
		{n,m}	������n�Σ����ǲ�����m��
		*/
		
		/*
		��Χ��ʾ
		[abc]	a��b �� c�����ࣩ 
		[^abc]	�κ��ַ������� a��b �� c���񶨣� 
		[a-zA-Z]	a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ�� 
		[a-d[m-p]]	a �� d �� m �� p��[a-dm-p]�������� 
		[a-z&&[def]]	d��e �� f�������� 
		[a-z&&[^bc]]	a �� z������ b �� c��[ad-z]����ȥ�� 
		[a-z&&[^m-p]]	a �� z������ m �� p��[a-lq-z]����ȥ��
		*/
	}

}
