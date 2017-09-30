import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class 读写联系 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		copy("F:\\新建文件夹\\fileceshi\\timg.jpg");
	}
	public static void copy(String name) throws IOException {
		File pngFile = new File(name);
		
		FileInputStream fileInputStream = new FileInputStream(pngFile);
		
		
		//每创建一个FileOutputStream 的时候，默认情况下FileOutputStream 的指针就会在文件的开始位置，每次写入，指针就会进行移动
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\新建文件夹\\" + pngFile.getName());
		
		byte[] data = new byte[1024];
		int length = 0;
		while((length =  fileInputStream.read(data)) != -1){
			fileOutputStream.write(data,0,length);
		}
		
		//关闭原则先开先关，后开先关
		fileOutputStream.close();
		fileInputStream.close();
		
	}
}
