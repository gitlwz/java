package cn.itcast.װ�������ģʽ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/*
װ�������ģʽ����ǿһ����Ĺ��ܣ����һ���������Щװ���໥��װ�Ρ�

װ�������ģʽ�Ĳ��裺
	1.��װ������ڲ�ά��һ����װ��������á�





*/

//���кŵĻ��������ַ���
class BufferedLineNum2{
	
	int count = 1;
	
	//���ڲ�ά��һ����װ��������á�
	BufferedReader bufferedReader;
	
	public BufferedLineNum2(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException {
		String line = bufferedReader.readLine();
		if (line == null) {
			return null;
		}
		line = count + " " + line;
		count++;
		return line;
	}
	
}

//���ֺŵĻ��������ַ���
class BufferedLineNum2{
	
	int count = 1;
	
	//���ڲ�ά��һ����װ��������á�
	BufferedReader bufferedReader;
	
	public BufferedLineNum2(BufferedReader bufferedReader) {
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException {
		String line = bufferedReader.readLine();
		if (line == null) {
			return null;
		}
		line = count + " " + line;
		count++;
		return line;
	}
	
}

public class a2װ��������ģʽ {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\�½��ļ���\\day21\\day21\\����\\day21\\src\\other\\Demo1.java");
		FileReader fileReader = new FileReader(file);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		BufferedLineNum2 bufferedLineNum2 = new BufferedLineNum2(bufferedReader);
		
		String line = null;
		
		while((line = bufferedLineNum2.readLine()) != null){
			System.out.println(line);
		}
		

	}

}
