import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ��д��ϵ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		copy("F:\\�½��ļ���\\fileceshi\\timg.jpg");
	}
	public static void copy(String name) throws IOException {
		File pngFile = new File(name);
		
		FileInputStream fileInputStream = new FileInputStream(pngFile);
		
		
		//ÿ����һ��FileOutputStream ��ʱ��Ĭ�������FileOutputStream ��ָ��ͻ����ļ��Ŀ�ʼλ�ã�ÿ��д�룬ָ��ͻ�����ƶ�
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\�½��ļ���\\" + pngFile.getName());
		
		byte[] data = new byte[1024];
		int length = 0;
		while((length =  fileInputStream.read(data)) != -1){
			fileOutputStream.write(data,0,length);
		}
		
		//�ر�ԭ���ȿ��ȹأ����ȹ�
		fileOutputStream.close();
		fileInputStream.close();
		
	}
}
