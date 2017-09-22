package cn.itcast.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*



*/
public class zz��ҳ���� {

	public static void main(String[] args) {
		String contentString = "����û����ϵ �� 547485261@163.com ����û����ϵ �� 547485261@qq.cn����û����ϵ �� 547485261@qq.com.cn����û����ϵ �� 547485261@qq.net ";
		
		String reg = "[a-zA-Z1-9]\\w{5,17}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
		
		//���ַ��������������������
		Pattern p = Pattern .compile(reg);
		
		//ʹ���������
		Matcher m = p.matcher(contentString);
		while (m.find()) {
			System.out.println(m.group());
			
		}
		
	}

}
