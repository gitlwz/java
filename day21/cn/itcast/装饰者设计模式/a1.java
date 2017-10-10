package cn.itcast.װ�������ģʽ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
װ�������ģʽ��
	
	BufferedReader�ǲ�����չ��FileReader�Ĺ��ܡ�
 	BuferedWriter Ҳ����չ��FileWriter�Ĺ��ܡ�

	����1�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ��������кš�
	
	����2�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ������зֺš�
	
	����3�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ�������˫���š�
	
	
	��ǿһ����Ĺ���ʱ�����ǿ���ѡ��ʹ�ü̳У�
	
		ͨ���̳�ʵ����ǿһ����Ĺ����ŵ㣺 ����ṹ������ͨ���׶�
		
		ȱ�㣺ʹ�ò����ᵼ�¼̳е���ϵ�����Ӵ�
	
	
*/
class BufferedLineNum extends BufferedReader{
	
	//�к�
	int count = 1;
	
	public BufferedLineNum(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String lineData = super.readLine();
		if (lineData == null) {
			return null;
		}
		lineData = count + " :" + lineData;
		count++;
		return lineData;
	}
}

//���ֺŵĻ��������ַ���
class BufferedLineSemi extends BufferedReader{
	
	
	
	public BufferedLineSemi(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String lineData = super.readLine();
		if (lineData == null) {
			return null;
		}
		lineData = lineData + ";";
		
		return lineData;
	}
}
//��˫���ŵĻ��������ַ���
class BufferedLineQuto extends BufferedReader{
	
	
	
	public BufferedLineQuto(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String lineData = super.readLine();
		if (lineData == null) {
			return null;
		}
		lineData = "\""+lineData + "\"";
		
		return lineData;
	}
}

public class a1 {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\�½��ļ���\\day21\\day21\\����\\day21\\src\\other\\Demo1.java");
		
		FileReader fileReader = new FileReader(file);
		
		//�����к�
		BufferedLineNum bufferedLineNum = new BufferedLineNum(fileReader);
		
		//���зֺ�
		BufferedLineSemi bufferedLineSemi = new BufferedLineSemi(fileReader);
		
		//����˫����
		BufferedLineQuto bufferedLineQuto = new BufferedLineQuto(fileReader);
		
		String line = null;
		while ((line = bufferedLineQuto.readLine()) != null) {
			System.out.println(line);
			
		}
	}

}
