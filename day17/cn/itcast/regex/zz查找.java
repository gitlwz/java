package cn.itcast.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ������Ҫ�������
 * ָ��Ϊ�ַ�����������ʽ�������ȱ�����Ϊ�����ʵ����Ȼ�󣬿ɽ��õ����������ƥ��������ַ������ڴ���Matcher����
 * ִ��ƥ������Ƶ�����״̬��פ����ƥ�����У����Զ��ƥ�������Թ���ͬһģʽ����ˣ����͵ĵ���˳����
 * 
	
	Pattern p = Pattern.compile("����");
	Matcher m = p.matcher("aaaaab");
	boolean b = m.matches();
	
	
	���ң�
		������Ҫʹ�õĶ���
		1.Pattern(�������)
		2.Matcher(ƥ��������)
			ƥ����Ҫʹ�õ��ķ���
				1.find(); ����boolean  -��֪ͨƥ����ȥƥ���ַ��������ҷ��Ϲ�������Ӵ�������ܲ��ҵ����Ϲ�����ַ������򷵻�true�����򷵻�false
				2.group();		     -����ȡ���Ϲ�����Ӵ�
				
				ע�⣺ʹ��group������ʱ��һ��Ҫ�ȵ���find������ƥ��ȥ���ҷ��Ϲ�����ַ��������򱨴�
*/			
public class zz���� {

	public static void main(String[] args) {
		//�ҳ������ַ���ɵĵ���
		String content = "da jia de jia qi wang bi liao hai kai xin ma ";
		
		String reg = "\\b[a-zA-Z]{3}\\b";
		
		//��Ҫ���ַ������������� Patten�������
		Pattern p = Pattern.compile(reg);
		
		//ʹ���������ƥ���ַ������ڲ���һ��   Matcher  ����;
		Matcher m = p.matcher(content);
		
		//System.out.println("�з��Ϲ�����ַ�����" + m.find());
		
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
